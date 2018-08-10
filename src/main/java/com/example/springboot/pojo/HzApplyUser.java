package com.example.springboot.pojo;

import java.io.Serializable;

public class HzApplyUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.apply_id
     *
     * @mbg.generated
     */
    private String applyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.org_id
     *
     * @mbg.generated
     */
    private String orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.org_name
     *
     * @mbg.generated
     */
    private String orgName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_user.vm_status
     *
     * @mbg.generated
     */
    private Integer vmStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_apply_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.id
     *
     * @return the value of hz_apply_user.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.id
     *
     * @param id the value for hz_apply_user.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.apply_id
     *
     * @return the value of hz_apply_user.apply_id
     *
     * @mbg.generated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.apply_id
     *
     * @param applyId the value for hz_apply_user.apply_id
     *
     * @mbg.generated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.user_id
     *
     * @return the value of hz_apply_user.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.user_id
     *
     * @param userId the value for hz_apply_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.user_name
     *
     * @return the value of hz_apply_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.user_name
     *
     * @param userName the value for hz_apply_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.org_id
     *
     * @return the value of hz_apply_user.org_id
     *
     * @mbg.generated
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.org_id
     *
     * @param orgId the value for hz_apply_user.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.org_name
     *
     * @return the value of hz_apply_user.org_name
     *
     * @mbg.generated
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.org_name
     *
     * @param orgName the value for hz_apply_user.org_name
     *
     * @mbg.generated
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_user.vm_status
     *
     * @return the value of hz_apply_user.vm_status
     *
     * @mbg.generated
     */
    public Integer getVmStatus() {
        return vmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_user.vm_status
     *
     * @param vmStatus the value for hz_apply_user.vm_status
     *
     * @mbg.generated
     */
    public void setVmStatus(Integer vmStatus) {
        this.vmStatus = vmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_apply_user
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
        sb.append(", applyId=").append(applyId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", vmStatus=").append(vmStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}