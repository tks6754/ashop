package com.miao.ashop.goods.config.advice;

import com.miao.ashop.common.http.advice.GlobalResponseHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = {RestController.class, Controller.class})
public class GoodsResponseHandler extends GlobalResponseHandler {
}
