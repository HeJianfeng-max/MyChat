package com.mychat.framework.handler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: Jianfeng.He
 * @Date: 2022/4/9
 **/

public class MethodParameter {

    private Method method;

    private String parameterName;

    private int parameterIndex;

    private Class<?> parameterType;

    private Annotation[] parameterAnnotations;

}
