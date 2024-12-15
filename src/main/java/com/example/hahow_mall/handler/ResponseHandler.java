package com.example.hahow_mall.handler;

import com.example.hahow_mall.data.product.data.BaseResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@RestControllerAdvice(basePackages = "com.example.hahow_mall.controller")
@RequiredArgsConstructor
public class ResponseHandler implements ResponseBodyAdvice<Object> {
    private final ObjectMapper objectMapper;

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object data,
                                  MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {
        if (data instanceof BaseResponse) {
            response.setStatusCode(HttpStatus.valueOf(((BaseResponse<?>) data).getStatus()));
            return data;
        }
        if (data instanceof String) {
            return objectMapper.writeValueAsString(BaseResponse.success(data, HttpStatus.OK.value()));
        }

        return BaseResponse.success(data, HttpStatus.OK.value());
    }
}
