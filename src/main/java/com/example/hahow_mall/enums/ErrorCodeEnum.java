package com.example.hahow_mall.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author: tcsow
 * @date: 2024/10/10
 */
@RequiredArgsConstructor
@Getter
public enum ErrorCodeEnum {
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"ERROR0001","Internal Server Error."),
    BAD_REQUEST_ERROR(HttpStatus.BAD_REQUEST,"ERROR0002","Bad request"),
    PRODUCT_NOT_FOUND_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"ERROR0003","Product Not Found id:%s ,name:%s"),




    ;

    private final HttpStatus statusCode;
    private final String errorCode;
    private final String errorLog;

}
