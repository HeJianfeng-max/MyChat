package com.base;

import com.messageFormat.jms.JmsResponseHeader;
import lombok.Data;

@Data
public class DefaultChatResponseHeader implements JmsResponseHeader {

    private boolean success;

    private String errorMessage;

    private String messageId;

    private String messageType;

    private String sendToQueue;

    private String replyToQueue;

}
