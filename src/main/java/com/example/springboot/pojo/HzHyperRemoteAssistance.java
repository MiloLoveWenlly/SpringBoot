package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzHyperRemoteAssistance implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.apply_id
     *
     * @mbg.generated
     */
    private String applyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.target_id
     *
     * @mbg.generated
     */
    private String targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.response_time
     *
     * @mbg.generated
     */
    private Date responseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_remote_assistance.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_hyper_remote_assistance
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.id
     *
     * @return the value of hz_hyper_remote_assistance.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.id
     *
     * @param id the value for hz_hyper_remote_assistance.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.apply_id
     *
     * @return the value of hz_hyper_remote_assistance.apply_id
     *
     * @mbg.generated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.apply_id
     *
     * @param applyId the value for hz_hyper_remote_assistance.apply_id
     *
     * @mbg.generated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.creator_id
     *
     * @return the value of hz_hyper_remote_assistance.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.creator_id
     *
     * @param creatorId the value for hz_hyper_remote_assistance.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.target_id
     *
     * @return the value of hz_hyper_remote_assistance.target_id
     *
     * @mbg.generated
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.target_id
     *
     * @param targetId the value for hz_hyper_remote_assistance.target_id
     *
     * @mbg.generated
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.create_time
     *
     * @return the value of hz_hyper_remote_assistance.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.create_time
     *
     * @param createTime the value for hz_hyper_remote_assistance.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.response_time
     *
     * @return the value of hz_hyper_remote_assistance.response_time
     *
     * @mbg.generated
     */
    public Date getResponseTime() {
        return responseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.response_time
     *
     * @param responseTime the value for hz_hyper_remote_assistance.response_time
     *
     * @mbg.generated
     */
    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.end_time
     *
     * @return the value of hz_hyper_remote_assistance.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.end_time
     *
     * @param endTime the value for hz_hyper_remote_assistance.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_remote_assistance.state
     *
     * @return the value of hz_hyper_remote_assistance.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_remote_assistance.state
     *
     * @param state the value for hz_hyper_remote_assistance.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_remote_assistance
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
        sb.append(", creatorId=").append(creatorId);
        sb.append(", targetId=").append(targetId);
        sb.append(", createTime=").append(createTime);
        sb.append(", responseTime=").append(responseTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}