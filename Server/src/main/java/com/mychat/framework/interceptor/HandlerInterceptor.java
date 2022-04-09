package com.mychat.framework.interceptor;

import com.messageFormat.jms.JmsRequest;
import com.messageFormat.jms.JmsResponse;
import com.mychat.framework.handler.HandlerMethod;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public interface HandlerInterceptor {

    boolean preHandle(JmsRequest request, JmsResponse response, HandlerMethod handler);

    void postHandle(JmsRequest request, JmsResponse response, HandlerMethod handler);

    void afterCompletion(JmsRequest request, JmsResponse response, HandlerMethod handler, Exception exception);

}
