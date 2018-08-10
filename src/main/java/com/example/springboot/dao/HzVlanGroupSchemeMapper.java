package com.example.springboot.dao;

import com.example.springboot.pojo.HzVlanGroupScheme;
import java.util.List;

public interface HzVlanGroupSchemeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vlan_group_scheme
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vlan_group_scheme
     *
     * @mbg.generated
     */
    int insert(HzVlanGroupScheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vlan_group_scheme
     *
     * @mbg.generated
     */
    HzVlanGroupScheme selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vlan_group_scheme
     *
     * @mbg.generated
     */
    List<HzVlanGroupScheme> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vlan_group_scheme
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzVlanGroupScheme record);
}