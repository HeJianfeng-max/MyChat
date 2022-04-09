package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import com.mychat.framework.handler.HandlerExecutionChain;

/**
 * @Description: 处理器映射器的顶层接口
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public interface HandlerMapping {

    HandlerExecutionChain getHandler(JmsRequest request);

}
