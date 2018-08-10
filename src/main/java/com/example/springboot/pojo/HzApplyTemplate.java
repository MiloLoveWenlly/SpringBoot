package com.example.springboot.pojo;

import java.io.Serializable;

public class HzApplyTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_template.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_template.apply_id
     *
     * @mbg.generated
     */
    private String applyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_apply_template.template_id
     *
     * @mbg.generated
     */
    private String templateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_apply_template
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_template.id
     *
     * @return the value of hz_apply_template.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_template.id
     *
     * @param id the value for hz_apply_template.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_template.apply_id
     *
     * @return the value of hz_apply_template.apply_id
     *
     * @mbg.generated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_template.apply_id
     *
     * @param applyId the value for hz_apply_template.apply_id
     *
     * @mbg.generated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_apply_template.template_id
     *
     * @return the value of hz_apply_template.template_id
     *
     * @mbg.generated
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_apply_template.template_id
     *
     * @param templateId the value for hz_apply_template.template_id
     *
     * @mbg.generated
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_apply_template
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
        sb.append(", templateId=").append(templateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}