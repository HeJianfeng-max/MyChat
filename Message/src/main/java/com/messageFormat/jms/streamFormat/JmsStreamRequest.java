package com.messageFormat.jms.streamFormat;

import com.messageFormat.jms.JmsRequest;

public interface JmsStreamRequest extends JmsRequest {

    JmsStreamRequestHeader getHeader();

    JmsStreamRequestBody getBody();

}
