package com.miao.ashop.common.exception;



public class DbException {

    public static class DbNotExistException extends BaseException{
        private static final long serialVersionUID = -762937455654147384L;

        public DbNotExistException(){
            super(ErrorEnum.DB_NOT_EXIST, null);
        }
        public DbNotExistException(String errMsg){
            super(ErrorEnum.DB_NOT_EXIST.errCode(), errMsg + ErrorEnum.DB_NOT_EXIST.errorMsg());
        }
    }

}
