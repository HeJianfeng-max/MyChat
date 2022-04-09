package com.messageFormat.jms.byteFormat;

import com.messageFormat.jms.JmsRequest;

public interface JmsByteRequest extends JmsRequest {

    JmsByteRequestHeader getHeader();

    JmsByteRequestBody getBody();

}
