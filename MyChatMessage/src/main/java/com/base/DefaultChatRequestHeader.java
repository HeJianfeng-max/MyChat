package com.base;

import com.messageFormat.jms.JmsRequestHeader;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DefaultChatRequestHeader implements JmsRequestHeader {

    private String messageId;

    private String messageType;

    private String hostIp;

    private String replyToQueue;

    private String sendToQueue;

    private String language;

    private Long fromUserRrn;

    private Long toUserRrn;

    private List<Long> toUserRrnList = new ArrayList<>();

}
