package com.messageFormat.jms.byteFormat;


import com.messageFormat.jms.JmsRequestBody;

public interface JmsByteRequestBody extends JmsRequestBody {

    byte[] getBytes();

    void setBytes(byte[] bytes);

}
