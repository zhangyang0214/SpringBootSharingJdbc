package com.example.demo.entry;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserEntry {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String roleCode;
    private String roleName;
    private String gmtCreate;
    private String gmtUpdate;
    private String nickname;
    private String userCreate;
}
