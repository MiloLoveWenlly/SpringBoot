package com.example.springboot.dao;

import com.example.springboot.pojo.HzLesson;
import java.util.List;

public interface HzLessonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lesson
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lesson
     *
     * @mbg.generated
     */
    int insert(HzLesson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lesson
     *
     * @mbg.generated
     */
    HzLesson selectByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lesson
     *
     * @mbg.generated
     */
    List<HzLesson> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lesson
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzLesson record);
}