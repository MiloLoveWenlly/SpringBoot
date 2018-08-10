package com.example.springboot.pojo;

import java.io.Serializable;

public class HzUserGroupInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_group_info.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_group_info.group_id
     *
     * @mbg.generated
     */
    private String groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_group_info.student_id
     *
     * @mbg.generated
     */
    private String studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_user_group_info.stu_no
     *
     * @mbg.generated
     */
    private String stuNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_user_group_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_group_info.id
     *
     * @return the value of hz_user_group_info.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_group_info.id
     *
     * @param id the value for hz_user_group_info.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_group_info.group_id
     *
     * @return the value of hz_user_group_info.group_id
     *
     * @mbg.generated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_group_info.group_id
     *
     * @param groupId the value for hz_user_group_info.group_id
     *
     * @mbg.generated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_group_info.student_id
     *
     * @return the value of hz_user_group_info.student_id
     *
     * @mbg.generated
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_group_info.student_id
     *
     * @param studentId the value for hz_user_group_info.student_id
     *
     * @mbg.generated
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_user_group_info.stu_no
     *
     * @return the value of hz_user_group_info.stu_no
     *
     * @mbg.generated
     */
    public String getStuNo() {
        return stuNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_user_group_info.stu_no
     *
     * @param stuNo the value for hz_user_group_info.stu_no
     *
     * @mbg.generated
     */
    public void setStuNo(String stuNo) {
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_user_group_info
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
        sb.append(", groupId=").append(groupId);
        sb.append(", studentId=").append(studentId);
        sb.append(", stuNo=").append(stuNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}