package com.apple.springboot.index.controller;

import com.apple.springboot.index.entity.TestTable;
import com.apple.springboot.index.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;


@RestController
@RequestMapping("/index")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    private String getUserInfo(Integer id){
        TestTable userInfo = loginService.getUserInfoById(id);
        String date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(userInfo.getCreateDate());
        return userInfo.getUserName()+"  +  "+userInfo.getIdTestTable()+"   "
                +date;
    }
}
