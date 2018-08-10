package com.example.springboot.dao;

import com.example.springboot.pojo.HzExam;
import java.util.List;

public interface HzExamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam
     *
     * @mbg.generated
     */
    int insert(HzExam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam
     *
     * @mbg.generated
     */
    HzExam selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam
     *
     * @mbg.generated
     */
    List<HzExam> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzExam record);
}