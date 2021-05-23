package com.example.demo.dao.mapper1;

import com.example.demo.entry.UserEntry;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select id,username as userName,password,email,role_code as roleCode,gmt_create as gmtCreate,gmt_update as gmtUpdate,nickname as nickName,user_create as userCreate from sys_user")
    List<UserEntry> findUserList();

    @Insert({"insert into sys_user(username,password,email) values('${user.userName}','${user.password}','${user.email}')"})
    int add(@Param("user") UserEntry user);

    @Delete("delete from sys_user where id = #{id}")
    int delete(int id);
}
