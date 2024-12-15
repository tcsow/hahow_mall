package com.example.hahow_mall.data.product.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {
    private int status;
    private String message;
    private T data;

    private static <T> BaseResponse<T> of(int status, String message, T data) {
        BaseResponse<T> baseResponse = new BaseResponse<>();
        baseResponse.setStatus(status);
        baseResponse.setMessage(message);
        baseResponse.setData(data);
        return baseResponse;
    }

    public static <T> BaseResponse<T> success(T data,int status) {
        return BaseResponse.of(status, null, data);
    }

    public static <T> BaseResponse<T> failed(int status,T data, String message) {
        BaseResponse<T> baseResponse = BaseResponse.of(status, message, data);
        return baseResponse;
    }

}
