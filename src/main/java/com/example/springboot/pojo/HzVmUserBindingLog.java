package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzVmUserBindingLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.resource_id
     *
     * @mbg.generated
     */
    private String resourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.apply_id
     *
     * @mbg.generated
     */
    private String applyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.vm_id
     *
     * @mbg.generated
     */
    private String vmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.use_time
     *
     * @mbg.generated
     */
    private Date useTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.recycle_time
     *
     * @mbg.generated
     */
    private Date recycleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.term_id
     *
     * @mbg.generated
     */
    private String termId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.term_name
     *
     * @mbg.generated
     */
    private String termName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.week_id
     *
     * @mbg.generated
     */
    private String weekId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.week_name
     *
     * @mbg.generated
     */
    private String weekName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.lesson_id
     *
     * @mbg.generated
     */
    private String lessonId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.lesson_name
     *
     * @mbg.generated
     */
    private String lessonName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.course_id
     *
     * @mbg.generated
     */
    private String courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.test_id
     *
     * @mbg.generated
     */
    private String testId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.test_name
     *
     * @mbg.generated
     */
    private String testName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.lab_id
     *
     * @mbg.generated
     */
    private String labId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.lab_name
     *
     * @mbg.generated
     */
    private String labName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.teacher_id
     *
     * @mbg.generated
     */
    private String teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.teacher_name
     *
     * @mbg.generated
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.course_time_begin
     *
     * @mbg.generated
     */
    private Date courseTimeBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.course_time_end
     *
     * @mbg.generated
     */
    private Date courseTimeEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.test_time
     *
     * @mbg.generated
     */
    private Integer testTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.test_time_real
     *
     * @mbg.generated
     */
    private Integer testTimeReal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_user_binding_log.day_of_week
     *
     * @mbg.generated
     */
    private Integer dayOfWeek;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_vm_user_binding_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.resource_id
     *
     * @return the value of hz_vm_user_binding_log.resource_id
     *
     * @mbg.generated
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.resource_id
     *
     * @param resourceId the value for hz_vm_user_binding_log.resource_id
     *
     * @mbg.generated
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.apply_id
     *
     * @return the value of hz_vm_user_binding_log.apply_id
     *
     * @mbg.generated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.apply_id
     *
     * @param applyId the value for hz_vm_user_binding_log.apply_id
     *
     * @mbg.generated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.user_id
     *
     * @return the value of hz_vm_user_binding_log.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.user_id
     *
     * @param userId the value for hz_vm_user_binding_log.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.user_name
     *
     * @return the value of hz_vm_user_binding_log.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.user_name
     *
     * @param userName the value for hz_vm_user_binding_log.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.vm_id
     *
     * @return the value of hz_vm_user_binding_log.vm_id
     *
     * @mbg.generated
     */
    public String getVmId() {
        return vmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.vm_id
     *
     * @param vmId the value for hz_vm_user_binding_log.vm_id
     *
     * @mbg.generated
     */
    public void setVmId(String vmId) {
        this.vmId = vmId == null ? null : vmId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.create_time
     *
     * @return the value of hz_vm_user_binding_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.create_time
     *
     * @param createTime the value for hz_vm_user_binding_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.use_time
     *
     * @return the value of hz_vm_user_binding_log.use_time
     *
     * @mbg.generated
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.use_time
     *
     * @param useTime the value for hz_vm_user_binding_log.use_time
     *
     * @mbg.generated
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.recycle_time
     *
     * @return the value of hz_vm_user_binding_log.recycle_time
     *
     * @mbg.generated
     */
    public Date getRecycleTime() {
        return recycleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.recycle_time
     *
     * @param recycleTime the value for hz_vm_user_binding_log.recycle_time
     *
     * @mbg.generated
     */
    public void setRecycleTime(Date recycleTime) {
        this.recycleTime = recycleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.term_id
     *
     * @return the value of hz_vm_user_binding_log.term_id
     *
     * @mbg.generated
     */
    public String getTermId() {
        return termId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.term_id
     *
     * @param termId the value for hz_vm_user_binding_log.term_id
     *
     * @mbg.generated
     */
    public void setTermId(String termId) {
        this.termId = termId == null ? null : termId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.term_name
     *
     * @return the value of hz_vm_user_binding_log.term_name
     *
     * @mbg.generated
     */
    public String getTermName() {
        return termName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.term_name
     *
     * @param termName the value for hz_vm_user_binding_log.term_name
     *
     * @mbg.generated
     */
    public void setTermName(String termName) {
        this.termName = termName == null ? null : termName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.week_id
     *
     * @return the value of hz_vm_user_binding_log.week_id
     *
     * @mbg.generated
     */
    public String getWeekId() {
        return weekId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.week_id
     *
     * @param weekId the value for hz_vm_user_binding_log.week_id
     *
     * @mbg.generated
     */
    public void setWeekId(String weekId) {
        this.weekId = weekId == null ? null : weekId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.week_name
     *
     * @return the value of hz_vm_user_binding_log.week_name
     *
     * @mbg.generated
     */
    public String getWeekName() {
        return weekName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.week_name
     *
     * @param weekName the value for hz_vm_user_binding_log.week_name
     *
     * @mbg.generated
     */
    public void setWeekName(String weekName) {
        this.weekName = weekName == null ? null : weekName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.lesson_id
     *
     * @return the value of hz_vm_user_binding_log.lesson_id
     *
     * @mbg.generated
     */
    public String getLessonId() {
        return lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.lesson_id
     *
     * @param lessonId the value for hz_vm_user_binding_log.lesson_id
     *
     * @mbg.generated
     */
    public void setLessonId(String lessonId) {
        this.lessonId = lessonId == null ? null : lessonId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.lesson_name
     *
     * @return the value of hz_vm_user_binding_log.lesson_name
     *
     * @mbg.generated
     */
    public String getLessonName() {
        return lessonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.lesson_name
     *
     * @param lessonName the value for hz_vm_user_binding_log.lesson_name
     *
     * @mbg.generated
     */
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName == null ? null : lessonName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.course_id
     *
     * @return the value of hz_vm_user_binding_log.course_id
     *
     * @mbg.generated
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.course_id
     *
     * @param courseId the value for hz_vm_user_binding_log.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.course_name
     *
     * @return the value of hz_vm_user_binding_log.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.course_name
     *
     * @param courseName the value for hz_vm_user_binding_log.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.test_id
     *
     * @return the value of hz_vm_user_binding_log.test_id
     *
     * @mbg.generated
     */
    public String getTestId() {
        return testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.test_id
     *
     * @param testId the value for hz_vm_user_binding_log.test_id
     *
     * @mbg.generated
     */
    public void setTestId(String testId) {
        this.testId = testId == null ? null : testId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.test_name
     *
     * @return the value of hz_vm_user_binding_log.test_name
     *
     * @mbg.generated
     */
    public String getTestName() {
        return testName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.test_name
     *
     * @param testName the value for hz_vm_user_binding_log.test_name
     *
     * @mbg.generated
     */
    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.lab_id
     *
     * @return the value of hz_vm_user_binding_log.lab_id
     *
     * @mbg.generated
     */
    public String getLabId() {
        return labId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.lab_id
     *
     * @param labId the value for hz_vm_user_binding_log.lab_id
     *
     * @mbg.generated
     */
    public void setLabId(String labId) {
        this.labId = labId == null ? null : labId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.lab_name
     *
     * @return the value of hz_vm_user_binding_log.lab_name
     *
     * @mbg.generated
     */
    public String getLabName() {
        return labName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.lab_name
     *
     * @param labName the value for hz_vm_user_binding_log.lab_name
     *
     * @mbg.generated
     */
    public void setLabName(String labName) {
        this.labName = labName == null ? null : labName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.teacher_id
     *
     * @return the value of hz_vm_user_binding_log.teacher_id
     *
     * @mbg.generated
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.teacher_id
     *
     * @param teacherId the value for hz_vm_user_binding_log.teacher_id
     *
     * @mbg.generated
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.teacher_name
     *
     * @return the value of hz_vm_user_binding_log.teacher_name
     *
     * @mbg.generated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.teacher_name
     *
     * @param teacherName the value for hz_vm_user_binding_log.teacher_name
     *
     * @mbg.generated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.course_time_begin
     *
     * @return the value of hz_vm_user_binding_log.course_time_begin
     *
     * @mbg.generated
     */
    public Date getCourseTimeBegin() {
        return courseTimeBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.course_time_begin
     *
     * @param courseTimeBegin the value for hz_vm_user_binding_log.course_time_begin
     *
     * @mbg.generated
     */
    public void setCourseTimeBegin(Date courseTimeBegin) {
        this.courseTimeBegin = courseTimeBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.course_time_end
     *
     * @return the value of hz_vm_user_binding_log.course_time_end
     *
     * @mbg.generated
     */
    public Date getCourseTimeEnd() {
        return courseTimeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.course_time_end
     *
     * @param courseTimeEnd the value for hz_vm_user_binding_log.course_time_end
     *
     * @mbg.generated
     */
    public void setCourseTimeEnd(Date courseTimeEnd) {
        this.courseTimeEnd = courseTimeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.test_time
     *
     * @return the value of hz_vm_user_binding_log.test_time
     *
     * @mbg.generated
     */
    public Integer getTestTime() {
        return testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.test_time
     *
     * @param testTime the value for hz_vm_user_binding_log.test_time
     *
     * @mbg.generated
     */
    public void setTestTime(Integer testTime) {
        this.testTime = testTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.test_time_real
     *
     * @return the value of hz_vm_user_binding_log.test_time_real
     *
     * @mbg.generated
     */
    public Integer getTestTimeReal() {
        return testTimeReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.test_time_real
     *
     * @param testTimeReal the value for hz_vm_user_binding_log.test_time_real
     *
     * @mbg.generated
     */
    public void setTestTimeReal(Integer testTimeReal) {
        this.testTimeReal = testTimeReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_user_binding_log.day_of_week
     *
     * @return the value of hz_vm_user_binding_log.day_of_week
     *
     * @mbg.generated
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_user_binding_log.day_of_week
     *
     * @param dayOfWeek the value for hz_vm_user_binding_log.day_of_week
     *
     * @mbg.generated
     */
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_user_binding_log
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
        sb.append(", applyId=").append(applyId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", vmId=").append(vmId);
        sb.append(", createTime=").append(createTime);
        sb.append(", useTime=").append(useTime);
        sb.append(", recycleTime=").append(recycleTime);
        sb.append(", termId=").append(termId);
        sb.append(", termName=").append(termName);
        sb.append(", weekId=").append(weekId);
        sb.append(", weekName=").append(weekName);
        sb.append(", lessonId=").append(lessonId);
        sb.append(", lessonName=").append(lessonName);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", testId=").append(testId);
        sb.append(", testName=").append(testName);
        sb.append(", labId=").append(labId);
        sb.append(", labName=").append(labName);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", courseTimeBegin=").append(courseTimeBegin);
        sb.append(", courseTimeEnd=").append(courseTimeEnd);
        sb.append(", testTime=").append(testTime);
        sb.append(", testTimeReal=").append(testTimeReal);
        sb.append(", dayOfWeek=").append(dayOfWeek);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}