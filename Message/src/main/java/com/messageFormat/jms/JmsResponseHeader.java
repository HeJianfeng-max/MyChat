package com.messageFormat.jms;

import com.messageFormat.base.ResponseHeader;

public interface JmsResponseHeader extends ResponseHeader {

    void setMessageType(String messageType);

    String getMessageType();

    void setMessageId(String messageId);

    String getMessageId();

    void setReplyToQueue(String queue);

    String getReplyToQueue();

    void setSendToQueue(String queueName);

    String getSendToQueue();

    boolean isSuccess();

    void setSuccess(boolean success);
}
