package com.example.hahow_mall.handler;

import com.example.hahow_mall.data.product.data.BaseResponse;
import com.example.hahow_mall.exception.CustomizeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@RestControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class GlobalExceptionHandler {
    private final MessageSource messageSource;

    @ExceptionHandler(value = CustomizeException.class)
    @ResponseBody
    public ResponseEntity<BaseResponse<String>> exceptionHandler(CustomizeException e) {
        log.error(e.getErrorLog());
        final String resMessage = messageSource.getMessage(e.getErrorCodeEnum().getErrorCode(), e.getErrorMsgArgs(), LocaleContextHolder.getLocale());

        return ResponseEntity.status(e.getErrorCodeEnum().getStatusCode())
                .body(BaseResponse.failed(e.getErrorCodeEnum().getStatusCode().value(), null, resMessage));
    }
}
