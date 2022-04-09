package com.base.byteFormat;

import lombok.Data;

@Data
public class ChatByteResponse {

    private ChatByteRequestHeader header;

    private ChatByteRequestBody body;

}
