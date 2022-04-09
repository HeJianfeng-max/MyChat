package com.mychat.framework.handler.mapping;

import com.messageFormat.jms.JmsRequest;
import org.springframework.context.ApplicationContext;

/**
 * @Description: 处理器映射器的顶层接口
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public class RequestMappingHandlerMapping extends AbstractHandlerMapping {

    @Override
    protected Object getHandlerInternal(JmsRequest request) {
        return null;
    }

    @Override
    protected void initHandlerMethods(ApplicationContext applicationContext) {

    }
}
