package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import com.mychat.framework.handler.HandlerExecutionChain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class AbstractHandlerMapping implements HandlerMapping, InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    //这边用final来修饰，使得子类无法重写, 最终目的让主线逻辑在父类里完成
    @Override
    public final HandlerExecutionChain getHandler(JmsRequest request) {
        Object handler = getHandlerInternal(request);
        HandlerExecutionChain executionChain = getHandlerExecutionChain(handler, request);

        return null;
    }

    protected HandlerExecutionChain getHandlerExecutionChain(Object handler, JmsRequest request) {
        return null;
    }

    @Override
    public void afterPropertiesSet() {
        initHandlerMethods(applicationContext);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        this.applicationContext = applicationContext;
    }

    //因为可能有不同的处理器映射器，所以让子类去获取相应的Handler
    protected abstract Object getHandlerInternal(JmsRequest request);

    //初始化处理器的映射关系，不同的处理器可能映射方式不相同，所以由子类去实现
    protected abstract void initHandlerMethods(ApplicationContext applicationContext);

}
