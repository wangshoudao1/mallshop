package com.mall.shop.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/8/7 14:17
 */
@Setter
@Getter
public class CommonResult<T> {
    private long code;
    private String mesage;
    private T data;

    protected CommonResult(){

    }
    public CommonResult(long code, String mesage, T data) {
        this.code = code;
        this.mesage = mesage;
        this.data = data;
    }

    public static<T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessager(),data);
    }

}
