package com.example.springboot.dao;

import com.example.springboot.pojo.HzLore;
import java.util.List;

public interface HzLoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lore
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lore
     *
     * @mbg.generated
     */
    int insert(HzLore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lore
     *
     * @mbg.generated
     */
    HzLore selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lore
     *
     * @mbg.generated
     */
    List<HzLore> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lore
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzLore record);
}