package com.example.springboot.dao;

import com.example.springboot.pojo.HzFaq;
import java.util.List;

public interface HzFaqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_FAQ
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_FAQ
     *
     * @mbg.generated
     */
    int insert(HzFaq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_FAQ
     *
     * @mbg.generated
     */
    HzFaq selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_FAQ
     *
     * @mbg.generated
     */
    List<HzFaq> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_FAQ
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzFaq record);
}