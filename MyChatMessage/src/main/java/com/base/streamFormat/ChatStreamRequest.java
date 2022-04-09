package com.base.streamFormat;

import com.messageFormat.jms.streamFormat.JmsStreamRequest;
import lombok.Data;

@Data
public class ChatStreamRequest implements JmsStreamRequest {

    private ChatStreamRequestHeader header;

    private ChatStreamRequestBody body;

}
