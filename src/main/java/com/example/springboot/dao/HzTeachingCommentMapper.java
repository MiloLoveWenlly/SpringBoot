package com.example.springboot.dao;

import com.example.springboot.pojo.HzTeachingComment;
import java.util.List;

public interface HzTeachingCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_teaching_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_teaching_comment
     *
     * @mbg.generated
     */
    int insert(HzTeachingComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_teaching_comment
     *
     * @mbg.generated
     */
    HzTeachingComment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_teaching_comment
     *
     * @mbg.generated
     */
    List<HzTeachingComment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_teaching_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzTeachingComment record);
}