package com.mychat.framework.handler;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;
import com.mychat.framework.interceptor.HandlerInterceptor;

public class HandlerExecutionChain {

    private  Object handler;

    private HandlerInterceptor[] interceptors;

    public boolean applyPreHandle(JmsRequest request, JmsResponse response) {

        return true;
    }

    public void applyPostHandle(JmsRequest request, JmsResponse response) {

    }

    public void triggerAfterCompletion(JmsRequest request, JmsResponse response) {

    }

}
