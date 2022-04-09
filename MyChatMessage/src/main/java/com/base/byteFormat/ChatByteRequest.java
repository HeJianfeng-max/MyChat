package com.base.byteFormat;

import com.messageFormat.jms.byteFormat.JmsByteRequest;
import lombok.Data;

@Data
public class ChatByteRequest implements JmsByteRequest {

    private ChatByteRequestHeader header;

    private ChatByteRequestBody body;

}
