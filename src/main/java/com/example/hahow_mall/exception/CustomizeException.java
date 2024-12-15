package com.example.hahow_mall.exception;

import com.example.hahow_mall.enums.ErrorCodeEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author: tcsow
 * @date: 2024/10/10
 */
@Getter
@RequiredArgsConstructor
public class CustomizeException extends RuntimeException {
    private final ErrorCodeEnum errorCodeEnum;
    private final Object[] errorLogArgs;
    private final Object[] errorMsgArgs;

    public String getErrorLog() {
        if (errorLogArgs != null && errorLogArgs.length > 0) {
            return String.format(errorCodeEnum.getErrorLog(), errorLogArgs);
        } else {
            return errorCodeEnum.getErrorLog();
        }
    }

}
