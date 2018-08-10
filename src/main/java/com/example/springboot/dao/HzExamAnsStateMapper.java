package com.example.springboot.dao;

import com.example.springboot.pojo.HzExamAnsState;
import java.util.List;

public interface HzExamAnsStateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam_ans_state
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam_ans_state
     *
     * @mbg.generated
     */
    int insert(HzExamAnsState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam_ans_state
     *
     * @mbg.generated
     */
    HzExamAnsState selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam_ans_state
     *
     * @mbg.generated
     */
    List<HzExamAnsState> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_exam_ans_state
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzExamAnsState record);
}