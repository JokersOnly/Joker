package com.apple.springboot.index.service.impl;

import com.apple.springboot.index.entity.TestTable;
import com.apple.springboot.index.mapper.TestTableMapper;
import com.apple.springboot.index.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private TestTableMapper testTableMapper;
    @Override
    public TestTable getUserInfoById(Integer id) {
        String queryFunction = "selectByPrimaryKey";
        try {
            Method m = testTableMapper.getClass().getMethod(queryFunction,Integer.class);
            TestTable testTable=(TestTable) m.invoke(testTableMapper,id);
            return testTable;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
