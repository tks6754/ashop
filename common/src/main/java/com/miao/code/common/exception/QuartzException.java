package com.miao.code.common.exception;


/**
 * Quartz 异常
 */
public class QuartzException extends BaseException{
    private static final long serialVersionUID = 3045625927243195717L;

    public QuartzException(ErrorEnum errEnum, Throwable throwable){
        super(errEnum, throwable);
    }


}
