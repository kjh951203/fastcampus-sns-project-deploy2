package com.fastcampus.snsproject.exception;

import com.fastcampus.snsproject.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SimpleSnsApplicationException extends RuntimeException {

    private ErrorCode errorCode;
    private String message;


    public SimpleSnsApplicationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = null;
    }

    @Override
    public String getMessage() {
        if (message == null) {
            return errorCode.getMessage();
        } else {
            return String.format("%s. %s", errorCode.getMessage(), message);
        }

    }
}
