package com.miao.ashop.common.http.advice;


import com.miao.ashop.common.http.GlobalResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        final String returnTypeName = methodParameter.getParameterType().getName();

        return !"com.miao.ashop.common.http.GlobalResponse".equals(returnTypeName)
                && !"org.springframework.http.ResponseEntity".equals(returnTypeName);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        final String returnTypeName = methodParameter.getParameterType().getName();

        // void
        if ("void".equals(returnTypeName)){
            return GlobalResponse.success();
        }

        // 非json返回类型直接返回
        if (mediaType.includes(MediaType.APPLICATION_JSON)){
            return o;
        }

        // GlobalResponse data
        if ("com.miao.ashop.common.http.GlobalResponse".equals(returnTypeName)){
            return o;
        }

        return GlobalResponse.success(o);
    }
}