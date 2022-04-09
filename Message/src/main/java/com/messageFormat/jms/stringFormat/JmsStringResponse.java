package com.messageFormat.jms.stringFormat;

import com.messageFormat.jms.JmsResponse;

public interface JmsStringResponse extends JmsResponse {

    JmsStringResponseHeader getHeader();

    JmsStringResponseBody getBody();

}
