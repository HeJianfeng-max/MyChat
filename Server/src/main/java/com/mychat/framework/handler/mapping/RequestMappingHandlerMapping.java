package com.mychat.framework.handler.mapping;

public class RequestMappingHandlerMapping extends AbstractHandlerMethodMapping {

    @Override
    protected boolean isHandler(Class<?> beanType) {
        return false;
    }
}
