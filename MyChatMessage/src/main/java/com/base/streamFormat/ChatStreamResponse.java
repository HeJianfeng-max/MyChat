package com.base.streamFormat;

import lombok.Data;

@Data
public class ChatStreamResponse {

    private ChatStreamResponseHeader header;

    private ChatStreamResponseBody body;
}
