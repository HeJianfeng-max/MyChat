package com.mychat.framework.handler.adapter;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public abstract class AbstractHandlerAdapter implements HandlerAdapter {

    @Override
    public Object handle(JmsRequest request, JmsResponse response, Object handler) {

        return null;
    }

    abstract Object handleInternal(JmsRequest request, JmsResponse response, Object handler);

}
