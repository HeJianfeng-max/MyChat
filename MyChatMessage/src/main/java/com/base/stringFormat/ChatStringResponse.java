package com.base.stringFormat;

import com.messageFormat.jms.stringFormat.JmsStringResponse;
import lombok.Data;

@Data
public class ChatStringResponse implements JmsStringResponse {

    private ChatStringRequestHeader header;

    private ChatStringRequestBody body;

}
