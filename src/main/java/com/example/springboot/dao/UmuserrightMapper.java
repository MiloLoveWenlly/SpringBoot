package com.example.springboot.dao;

import com.example.springboot.pojo.Umuserright;
import java.util.List;

public interface UmuserrightMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umuserright
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userrightid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umuserright
     *
     * @mbg.generated
     */
    int insert(Umuserright record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umuserright
     *
     * @mbg.generated
     */
    Umuserright selectByPrimaryKey(String userrightid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umuserright
     *
     * @mbg.generated
     */
    List<Umuserright> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umuserright
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Umuserright record);
}