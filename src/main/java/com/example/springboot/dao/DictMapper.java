package com.example.springboot.dao;

import com.example.springboot.pojo.Dict;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dict record);

    Dict selectByPrimaryKey(Integer id);

    List<Dict> selectAll();

    int updateByPrimaryKey(Dict record);
}