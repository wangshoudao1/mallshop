package com.mall.shop.common;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/8/7 14:22
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200,"操作成功！"),
    FAILED(500,"操作失败！");
    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessager() {
        return message;
    }
}
