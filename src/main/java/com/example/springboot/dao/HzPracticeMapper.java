package com.example.springboot.dao;

import com.example.springboot.pojo.HzPractice;
import java.util.List;

public interface HzPracticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_practice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_practice
     *
     * @mbg.generated
     */
    int insert(HzPractice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_practice
     *
     * @mbg.generated
     */
    HzPractice selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_practice
     *
     * @mbg.generated
     */
    List<HzPractice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_practice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzPractice record);
}