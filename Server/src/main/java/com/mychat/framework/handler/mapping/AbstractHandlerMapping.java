package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import com.mychat.framework.handler.HandlerExecutionChain;

public abstract class AbstractHandlerMapping implements HandlerMapping {

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

    //因为可能有不同的处理器映射器，所以让子类去获取相应的Handler
    protected abstract Object getHandlerInternal(JmsRequest request);


}
