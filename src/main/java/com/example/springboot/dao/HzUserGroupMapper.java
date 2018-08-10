package com.example.springboot.dao;

import com.example.springboot.pojo.HzUserGroup;
import java.util.List;

public interface HzUserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_group
     *
     * @mbg.generated
     */
    int insert(HzUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_group
     *
     * @mbg.generated
     */
    HzUserGroup selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_group
     *
     * @mbg.generated
     */
    List<HzUserGroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzUserGroup record);
}