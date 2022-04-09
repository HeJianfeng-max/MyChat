package com.messageFormat.jms.stringFormat;

import com.messageFormat.jms.JmsRequest;

public interface JmsStringRequest extends JmsRequest {

    JmsStringRequestHeader getHeader();

    JmsStringRequestBody getBody();

}
