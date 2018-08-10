package com.example.springboot.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Umstnav implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column umstnav.NAVID
     *
     * @mbg.generated
     */
    private String navid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column umstnav.MENUID
     *
     * @mbg.generated
     */
    private String menuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column umstnav.SYSCODE
     *
     * @mbg.generated
     */
    private String syscode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column umstnav.USERID
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column umstnav.SHOWORDER
     *
     * @mbg.generated
     */
    private BigDecimal showorder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table umstnav
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column umstnav.NAVID
     *
     * @return the value of umstnav.NAVID
     *
     * @mbg.generated
     */
    public String getNavid() {
        return navid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column umstnav.NAVID
     *
     * @param navid the value for umstnav.NAVID
     *
     * @mbg.generated
     */
    public void setNavid(String navid) {
        this.navid = navid == null ? null : navid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column umstnav.MENUID
     *
     * @return the value of umstnav.MENUID
     *
     * @mbg.generated
     */
    public String getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column umstnav.MENUID
     *
     * @param menuid the value for umstnav.MENUID
     *
     * @mbg.generated
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column umstnav.SYSCODE
     *
     * @return the value of umstnav.SYSCODE
     *
     * @mbg.generated
     */
    public String getSyscode() {
        return syscode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column umstnav.SYSCODE
     *
     * @param syscode the value for umstnav.SYSCODE
     *
     * @mbg.generated
     */
    public void setSyscode(String syscode) {
        this.syscode = syscode == null ? null : syscode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column umstnav.USERID
     *
     * @return the value of umstnav.USERID
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column umstnav.USERID
     *
     * @param userid the value for umstnav.USERID
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column umstnav.SHOWORDER
     *
     * @return the value of umstnav.SHOWORDER
     *
     * @mbg.generated
     */
    public BigDecimal getShoworder() {
        return showorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column umstnav.SHOWORDER
     *
     * @param showorder the value for umstnav.SHOWORDER
     *
     * @mbg.generated
     */
    public void setShoworder(BigDecimal showorder) {
        this.showorder = showorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table umstnav
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", navid=").append(navid);
        sb.append(", menuid=").append(menuid);
        sb.append(", syscode=").append(syscode);
        sb.append(", userid=").append(userid);
        sb.append(", showorder=").append(showorder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}