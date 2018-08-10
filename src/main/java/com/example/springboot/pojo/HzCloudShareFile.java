package com.example.springboot.pojo;

import java.io.Serializable;

public class HzCloudShareFile implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share_file.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share_file.share_id
     *
     * @mbg.generated
     */
    private String shareId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share_file.file_id
     *
     * @mbg.generated
     */
    private String fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_cloud_share_file.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_cloud_share_file
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share_file.id
     *
     * @return the value of hz_cloud_share_file.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share_file.id
     *
     * @param id the value for hz_cloud_share_file.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share_file.share_id
     *
     * @return the value of hz_cloud_share_file.share_id
     *
     * @mbg.generated
     */
    public String getShareId() {
        return shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share_file.share_id
     *
     * @param shareId the value for hz_cloud_share_file.share_id
     *
     * @mbg.generated
     */
    public void setShareId(String shareId) {
        this.shareId = shareId == null ? null : shareId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share_file.file_id
     *
     * @return the value of hz_cloud_share_file.file_id
     *
     * @mbg.generated
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share_file.file_id
     *
     * @param fileId the value for hz_cloud_share_file.file_id
     *
     * @mbg.generated
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_cloud_share_file.state
     *
     * @return the value of hz_cloud_share_file.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_cloud_share_file.state
     *
     * @param state the value for hz_cloud_share_file.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_cloud_share_file
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
        sb.append(", shareId=").append(shareId);
        sb.append(", fileId=").append(fileId);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}