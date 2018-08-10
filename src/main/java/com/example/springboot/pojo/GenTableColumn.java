package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class GenTableColumn implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.gen_table_id
     *
     * @mbg.generated
     */
    private String genTableId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.comments
     *
     * @mbg.generated
     */
    private String comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.jdbc_type
     *
     * @mbg.generated
     */
    private String jdbcType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.jdbc_length
     *
     * @mbg.generated
     */
    private String jdbcLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.java_type
     *
     * @mbg.generated
     */
    private String javaType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.java_field
     *
     * @mbg.generated
     */
    private String javaField;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.is_pk
     *
     * @mbg.generated
     */
    private String isPk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.is_null
     *
     * @mbg.generated
     */
    private String isNull;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.is_insert
     *
     * @mbg.generated
     */
    private String isInsert;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.is_edit
     *
     * @mbg.generated
     */
    private String isEdit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.is_list
     *
     * @mbg.generated
     */
    private String isList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.is_query
     *
     * @mbg.generated
     */
    private String isQuery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.query_type
     *
     * @mbg.generated
     */
    private String queryType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.show_type
     *
     * @mbg.generated
     */
    private String showType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.dict_type
     *
     * @mbg.generated
     */
    private String dictType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.sort
     *
     * @mbg.generated
     */
    private Long sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gen_table_column.del_flag
     *
     * @mbg.generated
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gen_table_column
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.id
     *
     * @return the value of gen_table_column.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.id
     *
     * @param id the value for gen_table_column.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.gen_table_id
     *
     * @return the value of gen_table_column.gen_table_id
     *
     * @mbg.generated
     */
    public String getGenTableId() {
        return genTableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.gen_table_id
     *
     * @param genTableId the value for gen_table_column.gen_table_id
     *
     * @mbg.generated
     */
    public void setGenTableId(String genTableId) {
        this.genTableId = genTableId == null ? null : genTableId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.name
     *
     * @return the value of gen_table_column.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.name
     *
     * @param name the value for gen_table_column.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.comments
     *
     * @return the value of gen_table_column.comments
     *
     * @mbg.generated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.comments
     *
     * @param comments the value for gen_table_column.comments
     *
     * @mbg.generated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.jdbc_type
     *
     * @return the value of gen_table_column.jdbc_type
     *
     * @mbg.generated
     */
    public String getJdbcType() {
        return jdbcType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.jdbc_type
     *
     * @param jdbcType the value for gen_table_column.jdbc_type
     *
     * @mbg.generated
     */
    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType == null ? null : jdbcType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.jdbc_length
     *
     * @return the value of gen_table_column.jdbc_length
     *
     * @mbg.generated
     */
    public String getJdbcLength() {
        return jdbcLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.jdbc_length
     *
     * @param jdbcLength the value for gen_table_column.jdbc_length
     *
     * @mbg.generated
     */
    public void setJdbcLength(String jdbcLength) {
        this.jdbcLength = jdbcLength == null ? null : jdbcLength.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.java_type
     *
     * @return the value of gen_table_column.java_type
     *
     * @mbg.generated
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.java_type
     *
     * @param javaType the value for gen_table_column.java_type
     *
     * @mbg.generated
     */
    public void setJavaType(String javaType) {
        this.javaType = javaType == null ? null : javaType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.java_field
     *
     * @return the value of gen_table_column.java_field
     *
     * @mbg.generated
     */
    public String getJavaField() {
        return javaField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.java_field
     *
     * @param javaField the value for gen_table_column.java_field
     *
     * @mbg.generated
     */
    public void setJavaField(String javaField) {
        this.javaField = javaField == null ? null : javaField.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.is_pk
     *
     * @return the value of gen_table_column.is_pk
     *
     * @mbg.generated
     */
    public String getIsPk() {
        return isPk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.is_pk
     *
     * @param isPk the value for gen_table_column.is_pk
     *
     * @mbg.generated
     */
    public void setIsPk(String isPk) {
        this.isPk = isPk == null ? null : isPk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.is_null
     *
     * @return the value of gen_table_column.is_null
     *
     * @mbg.generated
     */
    public String getIsNull() {
        return isNull;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.is_null
     *
     * @param isNull the value for gen_table_column.is_null
     *
     * @mbg.generated
     */
    public void setIsNull(String isNull) {
        this.isNull = isNull == null ? null : isNull.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.is_insert
     *
     * @return the value of gen_table_column.is_insert
     *
     * @mbg.generated
     */
    public String getIsInsert() {
        return isInsert;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.is_insert
     *
     * @param isInsert the value for gen_table_column.is_insert
     *
     * @mbg.generated
     */
    public void setIsInsert(String isInsert) {
        this.isInsert = isInsert == null ? null : isInsert.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.is_edit
     *
     * @return the value of gen_table_column.is_edit
     *
     * @mbg.generated
     */
    public String getIsEdit() {
        return isEdit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.is_edit
     *
     * @param isEdit the value for gen_table_column.is_edit
     *
     * @mbg.generated
     */
    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit == null ? null : isEdit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.is_list
     *
     * @return the value of gen_table_column.is_list
     *
     * @mbg.generated
     */
    public String getIsList() {
        return isList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.is_list
     *
     * @param isList the value for gen_table_column.is_list
     *
     * @mbg.generated
     */
    public void setIsList(String isList) {
        this.isList = isList == null ? null : isList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.is_query
     *
     * @return the value of gen_table_column.is_query
     *
     * @mbg.generated
     */
    public String getIsQuery() {
        return isQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.is_query
     *
     * @param isQuery the value for gen_table_column.is_query
     *
     * @mbg.generated
     */
    public void setIsQuery(String isQuery) {
        this.isQuery = isQuery == null ? null : isQuery.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.query_type
     *
     * @return the value of gen_table_column.query_type
     *
     * @mbg.generated
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.query_type
     *
     * @param queryType the value for gen_table_column.query_type
     *
     * @mbg.generated
     */
    public void setQueryType(String queryType) {
        this.queryType = queryType == null ? null : queryType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.show_type
     *
     * @return the value of gen_table_column.show_type
     *
     * @mbg.generated
     */
    public String getShowType() {
        return showType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.show_type
     *
     * @param showType the value for gen_table_column.show_type
     *
     * @mbg.generated
     */
    public void setShowType(String showType) {
        this.showType = showType == null ? null : showType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.dict_type
     *
     * @return the value of gen_table_column.dict_type
     *
     * @mbg.generated
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.dict_type
     *
     * @param dictType the value for gen_table_column.dict_type
     *
     * @mbg.generated
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.create_by
     *
     * @return the value of gen_table_column.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.create_by
     *
     * @param createBy the value for gen_table_column.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.create_date
     *
     * @return the value of gen_table_column.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.create_date
     *
     * @param createDate the value for gen_table_column.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.update_by
     *
     * @return the value of gen_table_column.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.update_by
     *
     * @param updateBy the value for gen_table_column.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.update_date
     *
     * @return the value of gen_table_column.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.update_date
     *
     * @param updateDate the value for gen_table_column.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.remarks
     *
     * @return the value of gen_table_column.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.remarks
     *
     * @param remarks the value for gen_table_column.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.sort
     *
     * @return the value of gen_table_column.sort
     *
     * @mbg.generated
     */
    public Long getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.sort
     *
     * @param sort the value for gen_table_column.sort
     *
     * @mbg.generated
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gen_table_column.del_flag
     *
     * @return the value of gen_table_column.del_flag
     *
     * @mbg.generated
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gen_table_column.del_flag
     *
     * @param delFlag the value for gen_table_column.del_flag
     *
     * @mbg.generated
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gen_table_column
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
        sb.append(", genTableId=").append(genTableId);
        sb.append(", name=").append(name);
        sb.append(", comments=").append(comments);
        sb.append(", jdbcType=").append(jdbcType);
        sb.append(", jdbcLength=").append(jdbcLength);
        sb.append(", javaType=").append(javaType);
        sb.append(", javaField=").append(javaField);
        sb.append(", isPk=").append(isPk);
        sb.append(", isNull=").append(isNull);
        sb.append(", isInsert=").append(isInsert);
        sb.append(", isEdit=").append(isEdit);
        sb.append(", isList=").append(isList);
        sb.append(", isQuery=").append(isQuery);
        sb.append(", queryType=").append(queryType);
        sb.append(", showType=").append(showType);
        sb.append(", dictType=").append(dictType);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", sort=").append(sort);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}