package com.messageFormat.jms;

import com.messageFormat.base.Response;

public interface JmsResponse extends Response {

    JmsResponseHeader getHeader();

    JmsResponseBody getBody();

}
