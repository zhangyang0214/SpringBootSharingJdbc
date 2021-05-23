package com.example.demo.service.impl;

import com.example.demo.dao.mapper1.UserMapper;
import com.example.demo.dao.mapper2.UserMapper2;
import com.example.demo.entry.UserEntry;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected UserMapper2 userMapper2;


    @Override
    public List<UserEntry> findUserList() {
        return userMapper.findUserList();
    }

    @Override
    public int addUser(String userName, String password, String email) {
        UserEntry user=new UserEntry();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        return userMapper.add(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.delete(id);
    }

    @Override
    public List<UserEntry> findUserList2() {
        return userMapper2.findUserList();
    }

    @Override
    public int addUser2(String userName, String password, String email,String roleCode,String roleName,String userCreate) {
        UserEntry user=new UserEntry();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        user.setRoleCode(roleCode);
        user.setRoleName(roleName);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        user.setGmtCreate(dtf.format(LocalDateTime.now()));
        user.setGmtUpdate(dtf.format(LocalDateTime.now()));
        user.setUserCreate("1");
        return userMapper2.add(user);
    }

    @Override
    public int deleteUser2(int id) {
        return userMapper2.delete(id);
    }

}
