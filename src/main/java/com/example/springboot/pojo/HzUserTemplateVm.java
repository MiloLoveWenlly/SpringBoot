package com.example.springboot.pojo;

import java.io.Serializable;

public class HzUserTemplateVm implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_template_vm.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_template_vm.template_id
     *
     * @mbg.generated
     */
    private String templateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_template_vm.vm_id
     *
     * @mbg.generated
     */
    private String vmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_template_vm.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_user_template_vm
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_template_vm.id
     *
     * @return the value of hz_user_template_vm.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_template_vm.id
     *
     * @param id the value for hz_user_template_vm.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_template_vm.template_id
     *
     * @return the value of hz_user_template_vm.template_id
     *
     * @mbg.generated
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_template_vm.template_id
     *
     * @param templateId the value for hz_user_template_vm.template_id
     *
     * @mbg.generated
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_template_vm.vm_id
     *
     * @return the value of hz_user_template_vm.vm_id
     *
     * @mbg.generated
     */
    public String getVmId() {
        return vmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_template_vm.vm_id
     *
     * @param vmId the value for hz_user_template_vm.vm_id
     *
     * @mbg.generated
     */
    public void setVmId(String vmId) {
        this.vmId = vmId == null ? null : vmId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_template_vm.user_id
     *
     * @return the value of hz_user_template_vm.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_template_vm.user_id
     *
     * @param userId the value for hz_user_template_vm.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_template_vm
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", templateId=").append(templateId);
        sb.append(", vmId=").append(vmId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}