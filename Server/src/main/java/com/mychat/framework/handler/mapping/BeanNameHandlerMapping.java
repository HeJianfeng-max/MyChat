package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public class BeanNameHandlerMapping extends AbstractHandlerMapping {
    private Map<String, Object> beanNameAndHandlerMap = new HashMap<>();

    @Override
    protected Object getHandlerInternal(JmsRequest request) {

        return null;
    }

    @Override
    protected void initHandlerMethods(ApplicationContext applicationContext) {

    }
}
