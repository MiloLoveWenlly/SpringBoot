package com.example.springboot.dao;

import com.example.springboot.pojo.Ummenu;
import java.util.List;

public interface UmmenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ummenu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String menuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ummenu
     *
     * @mbg.generated
     */
    int insert(Ummenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ummenu
     *
     * @mbg.generated
     */
    Ummenu selectByPrimaryKey(String menuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ummenu
     *
     * @mbg.generated
     */
    List<Ummenu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ummenu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Ummenu record);
}