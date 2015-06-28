package com.dsh.m.model;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.cusid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer cusid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.username
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.seconduser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Boolean seconduser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.sex
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.age
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String age;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.edu
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String edu;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.identity
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String identity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.telephone
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String telephone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.mobile
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String mobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.qq
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String qq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.email
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.other
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String other;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.shopname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String shopname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.shortname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String shortname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.business
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String business;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.addr
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String addr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.seats
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer seats;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.capability
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String capability;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.sign_begin
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Date signBegin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.sign_end
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Date signEnd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.register_time
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Date registerTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.save_money
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private BigDecimal saveMoney;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.loginname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String loginname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.loginpass
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String loginpass;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.status
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Boolean status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.orderStatus
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Boolean orderstatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.rolesid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer rolesid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.subareaid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer subareaid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.cusid
	 * @return  the value of customer.cusid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getCusid() {
		return cusid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.cusid
	 * @param cusid  the value for customer.cusid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.username
	 * @return  the value of customer.username
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.username
	 * @param username  the value for customer.username
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.seconduser
	 * @return  the value of customer.seconduser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Boolean getSeconduser() {
		return seconduser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.seconduser
	 * @param seconduser  the value for customer.seconduser
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSeconduser(Boolean seconduser) {
		this.seconduser = seconduser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.sex
	 * @return  the value of customer.sex
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.sex
	 * @param sex  the value for customer.sex
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.age
	 * @return  the value of customer.age
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.age
	 * @param age  the value for customer.age
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.edu
	 * @return  the value of customer.edu
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getEdu() {
		return edu;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.edu
	 * @param edu  the value for customer.edu
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setEdu(String edu) {
		this.edu = edu;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.identity
	 * @return  the value of customer.identity
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.identity
	 * @param identity  the value for customer.identity
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.telephone
	 * @return  the value of customer.telephone
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.telephone
	 * @param telephone  the value for customer.telephone
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.mobile
	 * @return  the value of customer.mobile
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.mobile
	 * @param mobile  the value for customer.mobile
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.qq
	 * @return  the value of customer.qq
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.qq
	 * @param qq  the value for customer.qq
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.email
	 * @return  the value of customer.email
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.email
	 * @param email  the value for customer.email
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.other
	 * @return  the value of customer.other
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getOther() {
		return other;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.other
	 * @param other  the value for customer.other
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setOther(String other) {
		this.other = other;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.shopname
	 * @return  the value of customer.shopname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getShopname() {
		return shopname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.shopname
	 * @param shopname  the value for customer.shopname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.shortname
	 * @return  the value of customer.shortname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getShortname() {
		return shortname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.shortname
	 * @param shortname  the value for customer.shortname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.business
	 * @return  the value of customer.business
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getBusiness() {
		return business;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.business
	 * @param business  the value for customer.business
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setBusiness(String business) {
		this.business = business;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.addr
	 * @return  the value of customer.addr
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.addr
	 * @param addr  the value for customer.addr
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.seats
	 * @return  the value of customer.seats
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getSeats() {
		return seats;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.seats
	 * @param seats  the value for customer.seats
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.capability
	 * @return  the value of customer.capability
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getCapability() {
		return capability;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.capability
	 * @param capability  the value for customer.capability
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setCapability(String capability) {
		this.capability = capability;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.sign_begin
	 * @return  the value of customer.sign_begin
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Date getSignBegin() {
		return signBegin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.sign_begin
	 * @param signBegin  the value for customer.sign_begin
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSignBegin(Date signBegin) {
		this.signBegin = signBegin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.sign_end
	 * @return  the value of customer.sign_end
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Date getSignEnd() {
		return signEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.sign_end
	 * @param signEnd  the value for customer.sign_end
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSignEnd(Date signEnd) {
		this.signEnd = signEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.register_time
	 * @return  the value of customer.register_time
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.register_time
	 * @param registerTime  the value for customer.register_time
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.save_money
	 * @return  the value of customer.save_money
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public BigDecimal getSaveMoney() {
		return saveMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.save_money
	 * @param saveMoney  the value for customer.save_money
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSaveMoney(BigDecimal saveMoney) {
		this.saveMoney = saveMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.loginname
	 * @return  the value of customer.loginname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.loginname
	 * @param loginname  the value for customer.loginname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.loginpass
	 * @return  the value of customer.loginpass
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getLoginpass() {
		return loginpass;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.loginpass
	 * @param loginpass  the value for customer.loginpass
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.status
	 * @return  the value of customer.status
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.status
	 * @param status  the value for customer.status
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.orderStatus
	 * @return  the value of customer.orderStatus
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Boolean getOrderstatus() {
		return orderstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.orderStatus
	 * @param orderstatus  the value for customer.orderStatus
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setOrderstatus(Boolean orderstatus) {
		this.orderstatus = orderstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.rolesid
	 * @return  the value of customer.rolesid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getRolesid() {
		return rolesid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.rolesid
	 * @param rolesid  the value for customer.rolesid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setRolesid(Integer rolesid) {
		this.rolesid = rolesid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.subareaid
	 * @return  the value of customer.subareaid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getSubareaid() {
		return subareaid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.subareaid
	 * @param subareaid  the value for customer.subareaid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSubareaid(Integer subareaid) {
		this.subareaid = subareaid;
	}
}