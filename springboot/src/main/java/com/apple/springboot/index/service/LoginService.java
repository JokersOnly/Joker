package com.apple.springboot.index.service;


import com.apple.springboot.index.entity.TestTable;

public interface LoginService {
    TestTable getUserInfoById(Integer id);
}
