package com.mychat.framework;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;
import com.mychat.framework.handler.HandlerExecutionChain;
import com.mychat.framework.handler.adapter.BeanNameHandlerAdapter;
import com.mychat.framework.handler.adapter.HandlerAdapter;
import com.mychat.framework.handler.adapter.RequestMappingHandlerAdapter;
import com.mychat.framework.handler.mapping.BeanNameHandlerMapping;
import com.mychat.framework.handler.mapping.HandlerMapping;
import com.mychat.framework.handler.mapping.RequestMappingHandlerMapping;
import org.springframework.context.ApplicationContext;
import java.util.*;

public class JmsRequestDispatcher {

    private List<HandlerMapping> handlerMappings;

    private List<HandlerAdapter> handlerAdapters;

    private static final Map<Class, List<Class>> strategyMap = new HashMap<>();

    static {
        strategyMap.put(HandlerMapping.class, Arrays.asList(new Class[] {RequestMappingHandlerMapping.class, BeanNameHandlerMapping.class}));
        strategyMap.put(HandlerAdapter.class, Arrays.asList(new Class[] {RequestMappingHandlerAdapter.class, BeanNameHandlerAdapter.class}));
    }

    public void doDispatch(JmsRequest request, JmsResponse response) {

        //获取处理器的执行链
        HandlerExecutionChain executionChain = getHandlerExecutionChain(request);

        //获取处理器适配器
        HandlerAdapter handlerAdapter = getHandleAdapter(executionChain);

        //执行拦截器的preHandle方法
        if (!executionChain.applyPreHandle(request, response)) {
            return;
        }

        //执行处理器的方法(其实就是Controller里面的某个方法)
        handlerAdapter.handle(request, response, executionChain);

        //执行拦截器的postHandle方法
        executionChain.applyPostHandle(request, response);

    }

    protected HandlerExecutionChain getHandlerExecutionChain(JmsRequest request) {
        for (HandlerMapping mapping : handlerMappings) {
            HandlerExecutionChain executionChain = mapping.getHandler(request);
            if (executionChain != null) {
                return executionChain;
            }
        }
        return null;
    }

    protected HandlerAdapter getHandleAdapter(HandlerExecutionChain executionChain) {
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(executionChain)) {
                return adapter;
            }
        }
        return null;
    }

    protected void initStrategies(ApplicationContext context) {
        initHandlerMappings(context);
        initHandlerAdapters(context);
    }

    protected void initHandlerMappings(ApplicationContext context) {
        handlerMappings = getDefaultStrategies(context, HandlerMapping.class);
    }

    protected void initHandlerAdapters(ApplicationContext context) {
        handlerAdapters = getDefaultStrategies(context, HandlerAdapter.class);
    }

    //获取每种组件的所有默认策略List
    protected <T> List<T> getDefaultStrategies(ApplicationContext context, Class<T> strategyInterface) {
        List<T> strategies = new ArrayList<>();
        List<Class> handlerMappingStrategies = strategyMap.get(strategyInterface);
        for (Class<T> clazz : handlerMappingStrategies) {
            strategies.add(createDefaultStrategy(context, strategyInterface));
        }
        return strategies;
    }

    //将类对象注册到Spring容器中，将每个组件注册到容器中
    protected <T> T createDefaultStrategy(ApplicationContext context, Class<T> clazz) {
        return context.getAutowireCapableBeanFactory().createBean(clazz);
    }

}
