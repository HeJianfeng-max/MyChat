package com.mychat.framework.handler.adapter;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;

public interface HandlerAdapter {

    boolean supports(Object handler);

    Object handle(JmsRequest request, JmsResponse response, Object handler);

}
