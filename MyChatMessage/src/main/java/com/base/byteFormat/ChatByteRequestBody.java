package com.base.byteFormat;

import com.messageFormat.jms.byteFormat.JmsByteRequestBody;
import lombok.Data;

@Data
public class ChatByteRequestBody implements JmsByteRequestBody {

    private byte[] bytes;

}
