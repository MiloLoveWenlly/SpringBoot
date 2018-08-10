package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzAttence implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_attence.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_attence.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_attence.apply_id
     *
     * @mbg.generated
     */
    private String applyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_attence.use_time
     *
     * @mbg.generated
     */
    private Long useTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_attence.last_time
     *
     * @mbg.generated
     */
    private Date lastTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_attence
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_attence.id
     *
     * @return the value of hz_attence.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_attence.id
     *
     * @param id the value for hz_attence.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_attence.user_id
     *
     * @return the value of hz_attence.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_attence.user_id
     *
     * @param userId the value for hz_attence.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_attence.apply_id
     *
     * @return the value of hz_attence.apply_id
     *
     * @mbg.generated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_attence.apply_id
     *
     * @param applyId the value for hz_attence.apply_id
     *
     * @mbg.generated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_attence.use_time
     *
     * @return the value of hz_attence.use_time
     *
     * @mbg.generated
     */
    public Long getUseTime() {
        return useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_attence.use_time
     *
     * @param useTime the value for hz_attence.use_time
     *
     * @mbg.generated
     */
    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_attence.last_time
     *
     * @return the value of hz_attence.last_time
     *
     * @mbg.generated
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_attence.last_time
     *
     * @param lastTime the value for hz_attence.last_time
     *
     * @mbg.generated
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_attence
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
        sb.append(", userId=").append(userId);
        sb.append(", applyId=").append(applyId);
        sb.append(", useTime=").append(useTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}