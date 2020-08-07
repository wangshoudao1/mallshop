package com.mall.shop.tiny.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/8/6 16:31
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private Integer age;

}
