package com.example.demo.dao.mapper2;

import com.example.demo.entry.UserEntry;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper2 {
    @Select("select id,username as userName,password,email,role_code as roleCode,gmt_create as gmtCreate,gmt_update as gmtUpdate,nickname as nickName,user_create as userCreate from sys_user")
    List<UserEntry> findUserList();

    @Insert({"insert into sys_user(username,password,email,role_Code,role_Name,gmt_Create,gmt_Update,user_Create) values('${user.userName}','${user.password}','${user.email}','${user.roleCode}','${user.roleName}','${user.gmtCreate}','${user.gmtUpdate}','${user.userCreate}')"})
    int add(@Param("user") UserEntry user);

    @Delete("delete from sys_user where id = #{id}")
    int delete(int id);
}
