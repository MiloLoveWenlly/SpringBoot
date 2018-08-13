package com.example.springboot.dao;

import com.example.springboot.pojo.RoleAssociateTree;
import java.util.List;

public interface RoleAssociateTreeMapper {
    int insert(RoleAssociateTree record);

    List<RoleAssociateTree> selectAll();
}