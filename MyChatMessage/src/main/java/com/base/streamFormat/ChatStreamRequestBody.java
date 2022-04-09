package com.base.streamFormat;

import com.messageFormat.jms.streamFormat.JmsStreamRequestBody;
import lombok.Data;

import java.io.InputStream;

@Data
public class ChatStreamRequestBody implements JmsStreamRequestBody {

    private InputStream inputStream;

}
