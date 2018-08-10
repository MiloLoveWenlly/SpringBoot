package com.example.springboot.dao;

import com.example.springboot.pojo.HzHyperVm;
import java.util.List;

public interface HzHyperVmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_vm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_vm
     *
     * @mbg.generated
     */
    int insert(HzHyperVm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_vm
     *
     * @mbg.generated
     */
    HzHyperVm selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_vm
     *
     * @mbg.generated
     */
    List<HzHyperVm> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_vm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzHyperVm record);
}