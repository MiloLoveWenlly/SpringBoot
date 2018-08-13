package com.example.springboot.pojo;

import java.io.Serializable;

public class OrgGroup implements Serializable {
    private Long groupId;

    private Long existingNum;

    private String groupCode;

    private String name;

    private String node;

    private Long num;

    private String parentNode;

    private static final long serialVersionUID = 1L;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getExistingNum() {
        return existingNum;
    }

    public void setExistingNum(Long existingNum) {
        this.existingNum = existingNum;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getParentNode() {
        return parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", existingNum=").append(existingNum);
        sb.append(", groupCode=").append(groupCode);
        sb.append(", name=").append(name);
        sb.append(", node=").append(node);
        sb.append(", num=").append(num);
        sb.append(", parentNode=").append(parentNode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}