package com.oecoo.demo.service.impl;

import com.oecoo.demo.dao.UserMapper;
import com.oecoo.demo.pojo.User;
import com.oecoo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.selectAll();
    }

}
