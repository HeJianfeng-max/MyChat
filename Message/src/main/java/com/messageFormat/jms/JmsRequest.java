package com.messageFormat.jms;

import com.messageFormat.base.Request;

public interface JmsRequest extends Request {

    JmsRequestHeader getHeader();

    JmsRequestBody getBody();

}
