package com.messageFormat.jms.streamFormat;

import com.messageFormat.jms.JmsRequestBody;

import java.io.InputStream;

public interface JmsStreamRequestBody extends JmsRequestBody {

    InputStream getInputStream();

    void setInputStream(InputStream inputStream);

}
