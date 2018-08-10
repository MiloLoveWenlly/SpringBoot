package com.example.springboot.dao;

import com.example.springboot.pojo.HzHyperIso;
import java.util.List;

public interface HzHyperIsoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_iso
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_iso
     *
     * @mbg.generated
     */
    int insert(HzHyperIso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_iso
     *
     * @mbg.generated
     */
    HzHyperIso selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_iso
     *
     * @mbg.generated
     */
    List<HzHyperIso> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_iso
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzHyperIso record);
}