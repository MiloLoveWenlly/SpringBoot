package com.example.springboot.dao;

import com.example.springboot.pojo.HzCloudPwd;
import java.util.List;

public interface HzCloudPwdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_pwd
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_pwd
     *
     * @mbg.generated
     */
    int insert(HzCloudPwd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_pwd
     *
     * @mbg.generated
     */
    HzCloudPwd selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_pwd
     *
     * @mbg.generated
     */
    List<HzCloudPwd> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_pwd
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzCloudPwd record);
}