package com.messageFormat.jms.byteFormat;

import com.messageFormat.jms.JmsResponse;

public interface JmsByteResponse extends JmsResponse {

    JmsByteResponseHeader getHeader();

    JmsByteResponseBody getBody();

}
