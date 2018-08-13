package com.example.springboot.dao;

import com.example.springboot.pojo.OrgGroup;
import java.util.List;

public interface OrgGroupMapper {
    int deleteByPrimaryKey(Long groupId);

    int insert(OrgGroup record);

    OrgGroup selectByPrimaryKey(Long groupId);

    List<OrgGroup> selectAll();

    int updateByPrimaryKey(OrgGroup record);
}