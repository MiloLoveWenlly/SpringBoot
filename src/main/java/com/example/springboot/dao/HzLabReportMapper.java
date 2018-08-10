package com.example.springboot.dao;

import com.example.springboot.pojo.HzLabReport;
import java.util.List;

public interface HzLabReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lab_report
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lab_report
     *
     * @mbg.generated
     */
    int insert(HzLabReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lab_report
     *
     * @mbg.generated
     */
    HzLabReport selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lab_report
     *
     * @mbg.generated
     */
    List<HzLabReport> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_lab_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzLabReport record);
}