package com.example.springboot.dao;

import com.example.springboot.pojo.UserAssociateRole;
import java.util.List;

public interface UserAssociateRoleMapper {
    int insert(UserAssociateRole record);

    List<UserAssociateRole> selectAll();
}