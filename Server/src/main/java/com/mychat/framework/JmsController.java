package com.mychat.framework;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public interface JmsController {

    void execute(JmsRequest request, JmsResponse response);

}
