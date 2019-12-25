package com.miao.ashop.user.config.advice;

import com.miao.ashop.common.http.advice.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler extends GlobalExceptionHandler {
}
