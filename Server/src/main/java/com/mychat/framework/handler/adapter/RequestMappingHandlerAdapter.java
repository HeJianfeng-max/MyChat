package com.mychat.framework.handler.adapter;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public class RequestMappingHandlerAdapter extends AbstractHandlerAdapter {

    @Override
    public boolean supports(Object handler) {

        return false;
    }

    @Override
    Object handleInternal(JmsRequest request, JmsResponse response, Object handler) {
        return null;
    }
}

