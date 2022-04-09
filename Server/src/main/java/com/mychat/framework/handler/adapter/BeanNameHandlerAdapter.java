package com.mychat.framework.handler.adapter;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;
import com.mychat.framework.handler.HandlerExecutionChain;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public class BeanNameHandlerAdapter extends AbstractHandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return false;
    }

}
