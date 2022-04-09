package com.mychat.framework.handler.adapter;

public interface HandlerAdapter {

    boolean supports(Object handler);

    Object handle();

}
