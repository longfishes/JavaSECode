package com.longfish.exception;

public class BelowZeroException extends RuntimeException{
    public BelowZeroException() {
        super();
    }

    public BelowZeroException(String message){
        super(message);
    }

    public BelowZeroException(String message,Throwable cause){
        super(message,cause);
    }

    public BelowZeroException(Throwable cause){
        super(cause);
    }

    protected BelowZeroException(String message, Throwable cause,boolean enableSuppression,boolean writeableStackTrace){
        super(message, cause,enableSuppression,writeableStackTrace);
    }
}
