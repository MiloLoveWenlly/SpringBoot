package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzCourse implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.resource_id
     *
     * @mbg.generated
     */
    private String resourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.logo_url
     *
     * @mbg.generated
     */
    private String logoUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.course_sn
     *
     * @mbg.generated
     */
    private String courseSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.course_type
     *
     * @mbg.generated
     */
    private String courseType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.score
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.course_intro
     *
     * @mbg.generated
     */
    private String courseIntro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.apply_user
     *
     * @mbg.generated
     */
    private String applyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.train_target
     *
     * @mbg.generated
     */
    private String trainTarget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.last_update_time
     *
     * @mbg.generated
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.updator_id
     *
     * @mbg.generated
     */
    private String updatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.updator_name
     *
     * @mbg.generated
     */
    private String updatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_course.is_delete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_course
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.resource_id
     *
     * @return the value of hz_course.resource_id
     *
     * @mbg.generated
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.resource_id
     *
     * @param resourceId the value for hz_course.resource_id
     *
     * @mbg.generated
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.logo_url
     *
     * @return the value of hz_course.logo_url
     *
     * @mbg.generated
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.logo_url
     *
     * @param logoUrl the value for hz_course.logo_url
     *
     * @mbg.generated
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.course_name
     *
     * @return the value of hz_course.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.course_name
     *
     * @param courseName the value for hz_course.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.course_sn
     *
     * @return the value of hz_course.course_sn
     *
     * @mbg.generated
     */
    public String getCourseSn() {
        return courseSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.course_sn
     *
     * @param courseSn the value for hz_course.course_sn
     *
     * @mbg.generated
     */
    public void setCourseSn(String courseSn) {
        this.courseSn = courseSn == null ? null : courseSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.course_type
     *
     * @return the value of hz_course.course_type
     *
     * @mbg.generated
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.course_type
     *
     * @param courseType the value for hz_course.course_type
     *
     * @mbg.generated
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.score
     *
     * @return the value of hz_course.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.score
     *
     * @param score the value for hz_course.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.course_intro
     *
     * @return the value of hz_course.course_intro
     *
     * @mbg.generated
     */
    public String getCourseIntro() {
        return courseIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.course_intro
     *
     * @param courseIntro the value for hz_course.course_intro
     *
     * @mbg.generated
     */
    public void setCourseIntro(String courseIntro) {
        this.courseIntro = courseIntro == null ? null : courseIntro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.apply_user
     *
     * @return the value of hz_course.apply_user
     *
     * @mbg.generated
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.apply_user
     *
     * @param applyUser the value for hz_course.apply_user
     *
     * @mbg.generated
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.train_target
     *
     * @return the value of hz_course.train_target
     *
     * @mbg.generated
     */
    public String getTrainTarget() {
        return trainTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.train_target
     *
     * @param trainTarget the value for hz_course.train_target
     *
     * @mbg.generated
     */
    public void setTrainTarget(String trainTarget) {
        this.trainTarget = trainTarget == null ? null : trainTarget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.sort
     *
     * @return the value of hz_course.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.sort
     *
     * @param sort the value for hz_course.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.remark
     *
     * @return the value of hz_course.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.remark
     *
     * @param remark the value for hz_course.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.create_time
     *
     * @return the value of hz_course.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.create_time
     *
     * @param createTime the value for hz_course.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.creator_id
     *
     * @return the value of hz_course.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.creator_id
     *
     * @param creatorId the value for hz_course.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.creator_name
     *
     * @return the value of hz_course.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.creator_name
     *
     * @param creatorName the value for hz_course.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.last_update_time
     *
     * @return the value of hz_course.last_update_time
     *
     * @mbg.generated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.last_update_time
     *
     * @param lastUpdateTime the value for hz_course.last_update_time
     *
     * @mbg.generated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.updator_id
     *
     * @return the value of hz_course.updator_id
     *
     * @mbg.generated
     */
    public String getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.updator_id
     *
     * @param updatorId the value for hz_course.updator_id
     *
     * @mbg.generated
     */
    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId == null ? null : updatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.updator_name
     *
     * @return the value of hz_course.updator_name
     *
     * @mbg.generated
     */
    public String getUpdatorName() {
        return updatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.updator_name
     *
     * @param updatorName the value for hz_course.updator_name
     *
     * @mbg.generated
     */
    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName == null ? null : updatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_course.is_delete
     *
     * @return the value of hz_course.is_delete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_course.is_delete
     *
     * @param isDelete the value for hz_course.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_course
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceId=").append(resourceId);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseSn=").append(courseSn);
        sb.append(", courseType=").append(courseType);
        sb.append(", score=").append(score);
        sb.append(", courseIntro=").append(courseIntro);
        sb.append(", applyUser=").append(applyUser);
        sb.append(", trainTarget=").append(trainTarget);
        sb.append(", sort=").append(sort);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", updatorId=").append(updatorId);
        sb.append(", updatorName=").append(updatorName);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}