package com.example.springboot.dao;

import com.example.springboot.pojo.GenScheme;
import java.util.List;

public interface GenSchemeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_scheme
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_scheme
     *
     * @mbg.generated
     */
    int insert(GenScheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_scheme
     *
     * @mbg.generated
     */
    GenScheme selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_scheme
     *
     * @mbg.generated
     */
    List<GenScheme> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_scheme
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GenScheme record);
}