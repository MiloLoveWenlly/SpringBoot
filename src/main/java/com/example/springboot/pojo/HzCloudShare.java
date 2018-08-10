package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzCloudShare implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.share_name
     *
     * @mbg.generated
     */
    private String shareName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.share_password
     *
     * @mbg.generated
     */
    private String sharePassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.share_time
     *
     * @mbg.generated
     */
    private Date shareTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.share_num
     *
     * @mbg.generated
     */
    private Integer shareNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.share_desc
     *
     * @mbg.generated
     */
    private String shareDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.share_code
     *
     * @mbg.generated
     */
    private String shareCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share.course_id
     *
     * @mbg.generated
     */
    private String courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_cloud_share
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.id
     *
     * @return the value of hz_cloud_share.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.id
     *
     * @param id the value for hz_cloud_share.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.user_id
     *
     * @return the value of hz_cloud_share.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.user_id
     *
     * @param userId the value for hz_cloud_share.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.share_name
     *
     * @return the value of hz_cloud_share.share_name
     *
     * @mbg.generated
     */
    public String getShareName() {
        return shareName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.share_name
     *
     * @param shareName the value for hz_cloud_share.share_name
     *
     * @mbg.generated
     */
    public void setShareName(String shareName) {
        this.shareName = shareName == null ? null : shareName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.share_password
     *
     * @return the value of hz_cloud_share.share_password
     *
     * @mbg.generated
     */
    public String getSharePassword() {
        return sharePassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.share_password
     *
     * @param sharePassword the value for hz_cloud_share.share_password
     *
     * @mbg.generated
     */
    public void setSharePassword(String sharePassword) {
        this.sharePassword = sharePassword == null ? null : sharePassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.share_time
     *
     * @return the value of hz_cloud_share.share_time
     *
     * @mbg.generated
     */
    public Date getShareTime() {
        return shareTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.share_time
     *
     * @param shareTime the value for hz_cloud_share.share_time
     *
     * @mbg.generated
     */
    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.state
     *
     * @return the value of hz_cloud_share.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.state
     *
     * @param state the value for hz_cloud_share.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.share_num
     *
     * @return the value of hz_cloud_share.share_num
     *
     * @mbg.generated
     */
    public Integer getShareNum() {
        return shareNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.share_num
     *
     * @param shareNum the value for hz_cloud_share.share_num
     *
     * @mbg.generated
     */
    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.share_desc
     *
     * @return the value of hz_cloud_share.share_desc
     *
     * @mbg.generated
     */
    public String getShareDesc() {
        return shareDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.share_desc
     *
     * @param shareDesc the value for hz_cloud_share.share_desc
     *
     * @mbg.generated
     */
    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc == null ? null : shareDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.share_code
     *
     * @return the value of hz_cloud_share.share_code
     *
     * @mbg.generated
     */
    public String getShareCode() {
        return shareCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.share_code
     *
     * @param shareCode the value for hz_cloud_share.share_code
     *
     * @mbg.generated
     */
    public void setShareCode(String shareCode) {
        this.shareCode = shareCode == null ? null : shareCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share.course_id
     *
     * @return the value of hz_cloud_share.course_id
     *
     * @mbg.generated
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share.course_id
     *
     * @param courseId the value for hz_cloud_share.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_share
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
        sb.append(", shareName=").append(shareName);
        sb.append(", sharePassword=").append(sharePassword);
        sb.append(", shareTime=").append(shareTime);
        sb.append(", state=").append(state);
        sb.append(", shareNum=").append(shareNum);
        sb.append(", shareDesc=").append(shareDesc);
        sb.append(", shareCode=").append(shareCode);
        sb.append(", courseId=").append(courseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}