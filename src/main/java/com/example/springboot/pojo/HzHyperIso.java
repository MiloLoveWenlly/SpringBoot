package com.example.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class HzHyperIso implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.system_id
     *
     * @mbg.generated
     */
    private String systemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.system_name
     *
     * @mbg.generated
     */
    private String systemName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.cluster_id
     *
     * @mbg.generated
     */
    private String clusterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.file_id
     *
     * @mbg.generated
     */
    private String fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_hyper_iso.size
     *
     * @mbg.generated
     */
    private Double size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_hyper_iso
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.id
     *
     * @return the value of hz_hyper_iso.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.id
     *
     * @param id the value for hz_hyper_iso.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.type
     *
     * @return the value of hz_hyper_iso.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.type
     *
     * @param type the value for hz_hyper_iso.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.name
     *
     * @return the value of hz_hyper_iso.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.name
     *
     * @param name the value for hz_hyper_iso.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.system_id
     *
     * @return the value of hz_hyper_iso.system_id
     *
     * @mbg.generated
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.system_id
     *
     * @param systemId the value for hz_hyper_iso.system_id
     *
     * @mbg.generated
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.system_name
     *
     * @return the value of hz_hyper_iso.system_name
     *
     * @mbg.generated
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.system_name
     *
     * @param systemName the value for hz_hyper_iso.system_name
     *
     * @mbg.generated
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.cluster_id
     *
     * @return the value of hz_hyper_iso.cluster_id
     *
     * @mbg.generated
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.cluster_id
     *
     * @param clusterId the value for hz_hyper_iso.cluster_id
     *
     * @mbg.generated
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId == null ? null : clusterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.creator_id
     *
     * @return the value of hz_hyper_iso.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.creator_id
     *
     * @param creatorId the value for hz_hyper_iso.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.create_time
     *
     * @return the value of hz_hyper_iso.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.create_time
     *
     * @param createTime the value for hz_hyper_iso.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.state
     *
     * @return the value of hz_hyper_iso.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.state
     *
     * @param state the value for hz_hyper_iso.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.url
     *
     * @return the value of hz_hyper_iso.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.url
     *
     * @param url the value for hz_hyper_iso.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.file_id
     *
     * @return the value of hz_hyper_iso.file_id
     *
     * @mbg.generated
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.file_id
     *
     * @param fileId the value for hz_hyper_iso.file_id
     *
     * @mbg.generated
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_hyper_iso.size
     *
     * @return the value of hz_hyper_iso.size
     *
     * @mbg.generated
     */
    public Double getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_hyper_iso.size
     *
     * @param size the value for hz_hyper_iso.size
     *
     * @mbg.generated
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_hyper_iso
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
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", systemId=").append(systemId);
        sb.append(", systemName=").append(systemName);
        sb.append(", clusterId=").append(clusterId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", createTime=").append(createTime);
        sb.append(", state=").append(state);
        sb.append(", url=").append(url);
        sb.append(", fileId=").append(fileId);
        sb.append(", size=").append(size);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}