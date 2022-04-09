package com.base.stringFormat;

import com.messageFormat.jms.stringFormat.JmsStringRequest;
import lombok.Data;

@Data
public class ChatStringRequest implements JmsStringRequest {

    private ChatStringRequestHeader header;

    private ChatStringRequestBody body;

}
