package com.mall.shop.tiny.service.impl;

import com.mall.shop.tiny.mapper.MyOwnMapper;
import com.mall.shop.tiny.model.User;
import com.mall.shop.tiny.service.MyOwnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:实现类
 * @author: wangshoudao
 * @create: 2020/8/6 16:24
 */
@Service
public class MyOwnServiceImpl implements MyOwnService {
    @Autowired
    private MyOwnMapper myOwnMapper;
    @Override
    public List<User> listAllUser() {
        return myOwnMapper.listAllUser();
    }
}
