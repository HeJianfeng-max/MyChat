package com.messageFormat.jms.streamFormat;

import com.messageFormat.jms.JmsResponse;

public interface JmsStreamResponse extends JmsResponse {

    JmsStreamResponseHeader getHeader();

    JmsStreamResponseBody getBody();

}
