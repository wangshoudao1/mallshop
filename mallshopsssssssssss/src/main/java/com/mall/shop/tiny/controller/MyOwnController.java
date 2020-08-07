package com.mall.shop.tiny.controller;

import com.mall.shop.tiny.model.User;
import com.mall.shop.tiny.service.MyOwnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/8/6 15:59
 */
@RestController
@RequestMapping("/myOwn")
public class MyOwnController {
    @Autowired
    private MyOwnService myOwnService;

    @RequestMapping(value="/listAllUser",method= RequestMethod.GET)
//    @ResponseBody
    public List<User> listAllUser(){
       return myOwnService.listAllUser();
    }


}
