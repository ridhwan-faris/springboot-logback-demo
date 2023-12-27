package com.ridhwan.logbackdemo.common.model.web.response;

import com.ridhwan.logbackdemo.common.enums.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    private String responseCode;
    private String responseMessage;
    private T data;

    public static BaseResponse getInstance(){
        return new BaseResponse();
    }

    public static <E> BaseResponse <E> sendSuccess(E data){
        BaseResponse baseResponse = getInstance();
        baseResponse.setResponseCode(ResponseCode.SUCCESS.getCode());
        baseResponse.setResponseMessage(ResponseCode.SUCCESS.getMessage());
        baseResponse.setData(data);
        return baseResponse;
    }
}
