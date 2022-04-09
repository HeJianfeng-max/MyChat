package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import com.mychat.framework.handler.HandlerExecutionChain;

public interface HandlerMapping {

    HandlerExecutionChain getHandler(JmsRequest request);

}
