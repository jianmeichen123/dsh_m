package com.dsh.m.model;

import java.io.Serializable;

public class GoodsBclass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3069484121243079470L;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods_bclass.bclassid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer bclassid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods_bclass.bclassname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String bclassname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods_bclass.isallow
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Boolean isallow;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods_bclass.bclassid
	 * @return  the value of goods_bclass.bclassid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getBclassid() {
		return bclassid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods_bclass.bclassid
	 * @param bclassid  the value for goods_bclass.bclassid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setBclassid(Integer bclassid) {
		this.bclassid = bclassid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods_bclass.bclassname
	 * @return  the value of goods_bclass.bclassname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getBclassname() {
		return bclassname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods_bclass.bclassname
	 * @param bclassname  the value for goods_bclass.bclassname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setBclassname(String bclassname) {
		this.bclassname = bclassname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods_bclass.isallow
	 * @return  the value of goods_bclass.isallow
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Boolean getIsallow() {
		return isallow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods_bclass.isallow
	 * @param isallow  the value for goods_bclass.isallow
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setIsallow(Boolean isallow) {
		this.isallow = isallow;
	}
}