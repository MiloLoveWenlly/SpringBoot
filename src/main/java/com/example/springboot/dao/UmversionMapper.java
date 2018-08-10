package com.example.springboot.dao;

import com.example.springboot.pojo.Umversion;
import java.util.List;

public interface UmversionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umversion
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String versionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umversion
     *
     * @mbg.generated
     */
    int insert(Umversion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umversion
     *
     * @mbg.generated
     */
    Umversion selectByPrimaryKey(String versionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umversion
     *
     * @mbg.generated
     */
    List<Umversion> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umversion
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Umversion record);
}