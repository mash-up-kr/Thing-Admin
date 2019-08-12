package com.mashup.thing.exception;

import org.springframework.http.HttpStatus;

public class FailSingInException extends BaseException {
    public FailSingInException() {
        this(HttpStatus.FORBIDDEN);
    }

    public FailSingInException(HttpStatus httpStatus) {
        this(4301, httpStatus);
    }

    public FailSingInException(int code, HttpStatus httpStatus) {
        super(ErrorModel.builder()
                .code(code)
                .httpStatus(httpStatus)
                .massage("Fail Authentication - Invalid Id")
                .build());
    }
}
