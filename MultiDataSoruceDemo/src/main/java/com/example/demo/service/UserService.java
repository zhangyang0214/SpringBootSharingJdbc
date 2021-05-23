package com.example.demo.service;

import com.example.demo.entry.UserEntry;

import java.util.List;

public interface UserService {
    List<UserEntry> findUserList();

    int addUser(String userName,String password,String email);

    int deleteUser(int id);

    List<UserEntry> findUserList2();

    int addUser2(String userName,String password,String email,String roleCode
                 ,String roleName,String userCreate);

    int deleteUser2(int id);
}
