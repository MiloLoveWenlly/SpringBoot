package com.example.springboot.dao;

import com.example.springboot.pojo.Tree;
import java.util.List;

public interface TreeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tree record);

    Tree selectByPrimaryKey(Long id);

    List<Tree> selectAll();

    int updateByPrimaryKey(Tree record);
}