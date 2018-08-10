package com.example.springboot.dao;

import com.example.springboot.pojo.CfgPageModule;
import java.util.List;

public interface CfgPageModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page_module
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page_module
     *
     * @mbg.generated
     */
    int insert(CfgPageModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page_module
     *
     * @mbg.generated
     */
    CfgPageModule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page_module
     *
     * @mbg.generated
     */
    List<CfgPageModule> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page_module
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CfgPageModule record);
}