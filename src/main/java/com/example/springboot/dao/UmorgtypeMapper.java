package com.example.springboot.dao;

import com.example.springboot.pojo.Umorgtype;
import java.util.List;

public interface UmorgtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umorgtype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umorgtype
     *
     * @mbg.generated
     */
    int insert(Umorgtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umorgtype
     *
     * @mbg.generated
     */
    Umorgtype selectByPrimaryKey(String typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umorgtype
     *
     * @mbg.generated
     */
    List<Umorgtype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umorgtype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Umorgtype record);
}