package com.example.springboot.pojo;

import java.io.Serializable;

public class HzTaskInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_task_info.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_task_info.task_id
     *
     * @mbg.generated
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_task_info.exam_id
     *
     * @mbg.generated
     */
    private String examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_task_info.score
     *
     * @mbg.generated
     */
    private Double score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_task_info.number
     *
     * @mbg.generated
     */
    private Integer number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_task_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_task_info.id
     *
     * @return the value of hz_task_info.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_task_info.id
     *
     * @param id the value for hz_task_info.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_task_info.task_id
     *
     * @return the value of hz_task_info.task_id
     *
     * @mbg.generated
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_task_info.task_id
     *
     * @param taskId the value for hz_task_info.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_task_info.exam_id
     *
     * @return the value of hz_task_info.exam_id
     *
     * @mbg.generated
     */
    public String getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_task_info.exam_id
     *
     * @param examId the value for hz_task_info.exam_id
     *
     * @mbg.generated
     */
    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_task_info.score
     *
     * @return the value of hz_task_info.score
     *
     * @mbg.generated
     */
    public Double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_task_info.score
     *
     * @param score the value for hz_task_info.score
     *
     * @mbg.generated
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_task_info.number
     *
     * @return the value of hz_task_info.number
     *
     * @mbg.generated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_task_info.number
     *
     * @param number the value for hz_task_info.number
     *
     * @mbg.generated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_task_info
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
        sb.append(", taskId=").append(taskId);
        sb.append(", examId=").append(examId);
        sb.append(", score=").append(score);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}