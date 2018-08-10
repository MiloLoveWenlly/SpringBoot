package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzAdjustCourseLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.apply_id
     *
     * @mbg.generated
     */
    private String applyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.apply_code
     *
     * @mbg.generated
     */
    private String applyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.old_course_id
     *
     * @mbg.generated
     */
    private String oldCourseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.old_test_id
     *
     * @mbg.generated
     */
    private String oldTestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.old_ids
     *
     * @mbg.generated
     */
    private String oldIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.new_ids
     *
     * @mbg.generated
     */
    private String newIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.old_content
     *
     * @mbg.generated
     */
    private String oldContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.new_content
     *
     * @mbg.generated
     */
    private String newContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_adjust_course_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_adjust_course_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.id
     *
     * @return the value of hz_adjust_course_log.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.id
     *
     * @param id the value for hz_adjust_course_log.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.apply_id
     *
     * @return the value of hz_adjust_course_log.apply_id
     *
     * @mbg.generated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.apply_id
     *
     * @param applyId the value for hz_adjust_course_log.apply_id
     *
     * @mbg.generated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.apply_code
     *
     * @return the value of hz_adjust_course_log.apply_code
     *
     * @mbg.generated
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.apply_code
     *
     * @param applyCode the value for hz_adjust_course_log.apply_code
     *
     * @mbg.generated
     */
    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.old_course_id
     *
     * @return the value of hz_adjust_course_log.old_course_id
     *
     * @mbg.generated
     */
    public String getOldCourseId() {
        return oldCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.old_course_id
     *
     * @param oldCourseId the value for hz_adjust_course_log.old_course_id
     *
     * @mbg.generated
     */
    public void setOldCourseId(String oldCourseId) {
        this.oldCourseId = oldCourseId == null ? null : oldCourseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.old_test_id
     *
     * @return the value of hz_adjust_course_log.old_test_id
     *
     * @mbg.generated
     */
    public String getOldTestId() {
        return oldTestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.old_test_id
     *
     * @param oldTestId the value for hz_adjust_course_log.old_test_id
     *
     * @mbg.generated
     */
    public void setOldTestId(String oldTestId) {
        this.oldTestId = oldTestId == null ? null : oldTestId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.old_ids
     *
     * @return the value of hz_adjust_course_log.old_ids
     *
     * @mbg.generated
     */
    public String getOldIds() {
        return oldIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.old_ids
     *
     * @param oldIds the value for hz_adjust_course_log.old_ids
     *
     * @mbg.generated
     */
    public void setOldIds(String oldIds) {
        this.oldIds = oldIds == null ? null : oldIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.new_ids
     *
     * @return the value of hz_adjust_course_log.new_ids
     *
     * @mbg.generated
     */
    public String getNewIds() {
        return newIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.new_ids
     *
     * @param newIds the value for hz_adjust_course_log.new_ids
     *
     * @mbg.generated
     */
    public void setNewIds(String newIds) {
        this.newIds = newIds == null ? null : newIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.old_content
     *
     * @return the value of hz_adjust_course_log.old_content
     *
     * @mbg.generated
     */
    public String getOldContent() {
        return oldContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.old_content
     *
     * @param oldContent the value for hz_adjust_course_log.old_content
     *
     * @mbg.generated
     */
    public void setOldContent(String oldContent) {
        this.oldContent = oldContent == null ? null : oldContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.new_content
     *
     * @return the value of hz_adjust_course_log.new_content
     *
     * @mbg.generated
     */
    public String getNewContent() {
        return newContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.new_content
     *
     * @param newContent the value for hz_adjust_course_log.new_content
     *
     * @mbg.generated
     */
    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_adjust_course_log.create_time
     *
     * @return the value of hz_adjust_course_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_adjust_course_log.create_time
     *
     * @param createTime the value for hz_adjust_course_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_adjust_course_log
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
        sb.append(", applyCode=").append(applyCode);
        sb.append(", oldCourseId=").append(oldCourseId);
        sb.append(", oldTestId=").append(oldTestId);
        sb.append(", oldIds=").append(oldIds);
        sb.append(", newIds=").append(newIds);
        sb.append(", oldContent=").append(oldContent);
        sb.append(", newContent=").append(newContent);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}