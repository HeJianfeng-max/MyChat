package com.messageFormat.jms;

import com.messageFormat.base.RequestHeader;

public interface JmsRequestHeader extends RequestHeader {

    void setMessageType(String messageType);

    String getMessageType();

    void setHostIp(String hostIp);

    String getHostIp();

    void setMessageId(String messageId);

    String getMessageId();

    void setReplyToQueue(String queue);

    String getReplyToQueue();

    void setSendToQueue(String queue);

    String getSendToQueue();

}
