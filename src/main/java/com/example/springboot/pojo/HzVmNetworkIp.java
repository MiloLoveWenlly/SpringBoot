package com.example.springboot.pojo;

import java.io.Serializable;

public class HzVmNetworkIp implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_network_ip.ipaddress_id
     *
     * @mbg.generated
     */
    private String ipaddressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_network_ip.public_ip
     *
     * @mbg.generated
     */
    private String publicIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_network_ip.issourcenat
     *
     * @mbg.generated
     */
    private Boolean issourcenat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_network_ip.vm_id
     *
     * @mbg.generated
     */
    private String vmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_network_ip.vm_name
     *
     * @mbg.generated
     */
    private String vmName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hz_vm_network_ip.network_id
     *
     * @mbg.generated
     */
    private String networkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hz_vm_network_ip
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_network_ip.ipaddress_id
     *
     * @return the value of hz_vm_network_ip.ipaddress_id
     *
     * @mbg.generated
     */
    public String getIpaddressId() {
        return ipaddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_network_ip.ipaddress_id
     *
     * @param ipaddressId the value for hz_vm_network_ip.ipaddress_id
     *
     * @mbg.generated
     */
    public void setIpaddressId(String ipaddressId) {
        this.ipaddressId = ipaddressId == null ? null : ipaddressId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_network_ip.public_ip
     *
     * @return the value of hz_vm_network_ip.public_ip
     *
     * @mbg.generated
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_network_ip.public_ip
     *
     * @param publicIp the value for hz_vm_network_ip.public_ip
     *
     * @mbg.generated
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp == null ? null : publicIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_network_ip.issourcenat
     *
     * @return the value of hz_vm_network_ip.issourcenat
     *
     * @mbg.generated
     */
    public Boolean getIssourcenat() {
        return issourcenat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_network_ip.issourcenat
     *
     * @param issourcenat the value for hz_vm_network_ip.issourcenat
     *
     * @mbg.generated
     */
    public void setIssourcenat(Boolean issourcenat) {
        this.issourcenat = issourcenat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_network_ip.vm_id
     *
     * @return the value of hz_vm_network_ip.vm_id
     *
     * @mbg.generated
     */
    public String getVmId() {
        return vmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_network_ip.vm_id
     *
     * @param vmId the value for hz_vm_network_ip.vm_id
     *
     * @mbg.generated
     */
    public void setVmId(String vmId) {
        this.vmId = vmId == null ? null : vmId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_network_ip.vm_name
     *
     * @return the value of hz_vm_network_ip.vm_name
     *
     * @mbg.generated
     */
    public String getVmName() {
        return vmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_network_ip.vm_name
     *
     * @param vmName the value for hz_vm_network_ip.vm_name
     *
     * @mbg.generated
     */
    public void setVmName(String vmName) {
        this.vmName = vmName == null ? null : vmName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hz_vm_network_ip.network_id
     *
     * @return the value of hz_vm_network_ip.network_id
     *
     * @mbg.generated
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hz_vm_network_ip.network_id
     *
     * @param networkId the value for hz_vm_network_ip.network_id
     *
     * @mbg.generated
     */
    public void setNetworkId(String networkId) {
        this.networkId = networkId == null ? null : networkId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hz_vm_network_ip
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ipaddressId=").append(ipaddressId);
        sb.append(", publicIp=").append(publicIp);
        sb.append(", issourcenat=").append(issourcenat);
        sb.append(", vmId=").append(vmId);
        sb.append(", vmName=").append(vmName);
        sb.append(", networkId=").append(networkId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}