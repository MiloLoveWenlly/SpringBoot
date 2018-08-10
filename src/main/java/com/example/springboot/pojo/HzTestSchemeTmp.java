package com.example.springboot.pojo;

import java.io.Serializable;

public class HzTestSchemeTmp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_test_scheme_tmp.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_test_scheme_tmp.scheme_id
     *
     * @mbg.generated
     */
    private String schemeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_test_scheme_tmp
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_test_scheme_tmp.id
     *
     * @return the value of hz_test_scheme_tmp.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_test_scheme_tmp.id
     *
     * @param id the value for hz_test_scheme_tmp.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_test_scheme_tmp.scheme_id
     *
     * @return the value of hz_test_scheme_tmp.scheme_id
     *
     * @mbg.generated
     */
    public String getSchemeId() {
        return schemeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_test_scheme_tmp.scheme_id
     *
     * @param schemeId the value for hz_test_scheme_tmp.scheme_id
     *
     * @mbg.generated
     */
    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId == null ? null : schemeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_test_scheme_tmp
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
        sb.append(", schemeId=").append(schemeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}