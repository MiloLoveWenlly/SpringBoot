package com.example.springboot.dao;

import com.example.springboot.pojo.SysCodeConfig;
import java.util.List;

public interface SysCodeConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_code_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String resourceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_code_config
     *
     * @mbg.generated
     */
    int insert(SysCodeConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_code_config
     *
     * @mbg.generated
     */
    SysCodeConfig selectByPrimaryKey(String resourceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_code_config
     *
     * @mbg.generated
     */
    List<SysCodeConfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_code_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysCodeConfig record);
}