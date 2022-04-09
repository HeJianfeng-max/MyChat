package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import com.mychat.framework.handler.HandlerMethod;

public abstract class AbstractHandlerMethodMapping extends AbstractHandlerMapping {

    @Override
    protected Object getHandlerInternal(JmsRequest request) {

        return lookupHandlerMethod("", request);
    }

    protected HandlerMethod lookupHandlerMethod(String lookupPath, JmsRequest request) {
        return null;
    }

    protected abstract boolean isHandler(Class<?> beanType);

}
