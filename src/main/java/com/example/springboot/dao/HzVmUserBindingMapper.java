package com.example.springboot.dao;

import com.example.springboot.pojo.HzVmUserBinding;
import java.util.List;

public interface HzVmUserBindingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_user_binding
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_user_binding
     *
     * @mbg.generated
     */
    int insert(HzVmUserBinding record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_user_binding
     *
     * @mbg.generated
     */
    HzVmUserBinding selectByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_user_binding
     *
     * @mbg.generated
     */
    List<HzVmUserBinding> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_user_binding
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HzVmUserBinding record);
}