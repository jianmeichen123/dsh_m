package com.dsh.m.model;

import java.util.ArrayList;
import java.util.List;

public class SysConfigExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public SysConfigExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andConfigNumIsNull() {
			addCriterion("config_num is null");
			return (Criteria) this;
		}

		public Criteria andConfigNumIsNotNull() {
			addCriterion("config_num is not null");
			return (Criteria) this;
		}

		public Criteria andConfigNumEqualTo(String value) {
			addCriterion("config_num =", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumNotEqualTo(String value) {
			addCriterion("config_num <>", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumGreaterThan(String value) {
			addCriterion("config_num >", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumGreaterThanOrEqualTo(String value) {
			addCriterion("config_num >=", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumLessThan(String value) {
			addCriterion("config_num <", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumLessThanOrEqualTo(String value) {
			addCriterion("config_num <=", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumLike(String value) {
			addCriterion("config_num like", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumNotLike(String value) {
			addCriterion("config_num not like", value, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumIn(List<String> values) {
			addCriterion("config_num in", values, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumNotIn(List<String> values) {
			addCriterion("config_num not in", values, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumBetween(String value1, String value2) {
			addCriterion("config_num between", value1, value2, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNumNotBetween(String value1, String value2) {
			addCriterion("config_num not between", value1, value2, "configNum");
			return (Criteria) this;
		}

		public Criteria andConfigNameIsNull() {
			addCriterion("config_name is null");
			return (Criteria) this;
		}

		public Criteria andConfigNameIsNotNull() {
			addCriterion("config_name is not null");
			return (Criteria) this;
		}

		public Criteria andConfigNameEqualTo(String value) {
			addCriterion("config_name =", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotEqualTo(String value) {
			addCriterion("config_name <>", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameGreaterThan(String value) {
			addCriterion("config_name >", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
			addCriterion("config_name >=", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameLessThan(String value) {
			addCriterion("config_name <", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameLessThanOrEqualTo(String value) {
			addCriterion("config_name <=", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameLike(String value) {
			addCriterion("config_name like", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotLike(String value) {
			addCriterion("config_name not like", value, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameIn(List<String> values) {
			addCriterion("config_name in", values, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotIn(List<String> values) {
			addCriterion("config_name not in", values, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameBetween(String value1, String value2) {
			addCriterion("config_name between", value1, value2, "configName");
			return (Criteria) this;
		}

		public Criteria andConfigNameNotBetween(String value1, String value2) {
			addCriterion("config_name not between", value1, value2,
					"configName");
			return (Criteria) this;
		}

		public Criteria andConfigValueIsNull() {
			addCriterion("config_value is null");
			return (Criteria) this;
		}

		public Criteria andConfigValueIsNotNull() {
			addCriterion("config_value is not null");
			return (Criteria) this;
		}

		public Criteria andConfigValueEqualTo(String value) {
			addCriterion("config_value =", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotEqualTo(String value) {
			addCriterion("config_value <>", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueGreaterThan(String value) {
			addCriterion("config_value >", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
			addCriterion("config_value >=", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueLessThan(String value) {
			addCriterion("config_value <", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueLessThanOrEqualTo(String value) {
			addCriterion("config_value <=", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueLike(String value) {
			addCriterion("config_value like", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotLike(String value) {
			addCriterion("config_value not like", value, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueIn(List<String> values) {
			addCriterion("config_value in", values, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotIn(List<String> values) {
			addCriterion("config_value not in", values, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueBetween(String value1, String value2) {
			addCriterion("config_value between", value1, value2, "configValue");
			return (Criteria) this;
		}

		public Criteria andConfigValueNotBetween(String value1, String value2) {
			addCriterion("config_value not between", value1, value2,
					"configValue");
			return (Criteria) this;
		}

		public Criteria andConfigExplainIsNull() {
			addCriterion("config_explain is null");
			return (Criteria) this;
		}

		public Criteria andConfigExplainIsNotNull() {
			addCriterion("config_explain is not null");
			return (Criteria) this;
		}

		public Criteria andConfigExplainEqualTo(String value) {
			addCriterion("config_explain =", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainNotEqualTo(String value) {
			addCriterion("config_explain <>", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainGreaterThan(String value) {
			addCriterion("config_explain >", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainGreaterThanOrEqualTo(String value) {
			addCriterion("config_explain >=", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainLessThan(String value) {
			addCriterion("config_explain <", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainLessThanOrEqualTo(String value) {
			addCriterion("config_explain <=", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainLike(String value) {
			addCriterion("config_explain like", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainNotLike(String value) {
			addCriterion("config_explain not like", value, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainIn(List<String> values) {
			addCriterion("config_explain in", values, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainNotIn(List<String> values) {
			addCriterion("config_explain not in", values, "configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainBetween(String value1, String value2) {
			addCriterion("config_explain between", value1, value2,
					"configExplain");
			return (Criteria) this;
		}

		public Criteria andConfigExplainNotBetween(String value1, String value2) {
			addCriterion("config_explain not between", value1, value2,
					"configExplain");
			return (Criteria) this;
		}

		public Criteria andTsIsNull() {
			addCriterion("ts is null");
			return (Criteria) this;
		}

		public Criteria andTsIsNotNull() {
			addCriterion("ts is not null");
			return (Criteria) this;
		}

		public Criteria andTsEqualTo(String value) {
			addCriterion("ts =", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotEqualTo(String value) {
			addCriterion("ts <>", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThan(String value) {
			addCriterion("ts >", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThanOrEqualTo(String value) {
			addCriterion("ts >=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThan(String value) {
			addCriterion("ts <", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThanOrEqualTo(String value) {
			addCriterion("ts <=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLike(String value) {
			addCriterion("ts like", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotLike(String value) {
			addCriterion("ts not like", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsIn(List<String> values) {
			addCriterion("ts in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotIn(List<String> values) {
			addCriterion("ts not in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsBetween(String value1, String value2) {
			addCriterion("ts between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotBetween(String value1, String value2) {
			addCriterion("ts not between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andDrIsNull() {
			addCriterion("dr is null");
			return (Criteria) this;
		}

		public Criteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (Criteria) this;
		}

		public Criteria andDrEqualTo(String value) {
			addCriterion("dr =", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotEqualTo(String value) {
			addCriterion("dr <>", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrGreaterThan(String value) {
			addCriterion("dr >", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrGreaterThanOrEqualTo(String value) {
			addCriterion("dr >=", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrLessThan(String value) {
			addCriterion("dr <", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrLessThanOrEqualTo(String value) {
			addCriterion("dr <=", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrLike(String value) {
			addCriterion("dr like", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotLike(String value) {
			addCriterion("dr not like", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrIn(List<String> values) {
			addCriterion("dr in", values, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotIn(List<String> values) {
			addCriterion("dr not in", values, "dr");
			return (Criteria) this;
		}

		public Criteria andDrBetween(String value1, String value2) {
			addCriterion("dr between", value1, value2, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotBetween(String value1, String value2) {
			addCriterion("dr not between", value1, value2, "dr");
			return (Criteria) this;
		}

		public Criteria andZyx1IsNull() {
			addCriterion("zyx1 is null");
			return (Criteria) this;
		}

		public Criteria andZyx1IsNotNull() {
			addCriterion("zyx1 is not null");
			return (Criteria) this;
		}

		public Criteria andZyx1EqualTo(String value) {
			addCriterion("zyx1 =", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1NotEqualTo(String value) {
			addCriterion("zyx1 <>", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1GreaterThan(String value) {
			addCriterion("zyx1 >", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1GreaterThanOrEqualTo(String value) {
			addCriterion("zyx1 >=", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1LessThan(String value) {
			addCriterion("zyx1 <", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1LessThanOrEqualTo(String value) {
			addCriterion("zyx1 <=", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1Like(String value) {
			addCriterion("zyx1 like", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1NotLike(String value) {
			addCriterion("zyx1 not like", value, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1In(List<String> values) {
			addCriterion("zyx1 in", values, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1NotIn(List<String> values) {
			addCriterion("zyx1 not in", values, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1Between(String value1, String value2) {
			addCriterion("zyx1 between", value1, value2, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx1NotBetween(String value1, String value2) {
			addCriterion("zyx1 not between", value1, value2, "zyx1");
			return (Criteria) this;
		}

		public Criteria andZyx2IsNull() {
			addCriterion("zyx2 is null");
			return (Criteria) this;
		}

		public Criteria andZyx2IsNotNull() {
			addCriterion("zyx2 is not null");
			return (Criteria) this;
		}

		public Criteria andZyx2EqualTo(String value) {
			addCriterion("zyx2 =", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2NotEqualTo(String value) {
			addCriterion("zyx2 <>", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2GreaterThan(String value) {
			addCriterion("zyx2 >", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2GreaterThanOrEqualTo(String value) {
			addCriterion("zyx2 >=", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2LessThan(String value) {
			addCriterion("zyx2 <", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2LessThanOrEqualTo(String value) {
			addCriterion("zyx2 <=", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2Like(String value) {
			addCriterion("zyx2 like", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2NotLike(String value) {
			addCriterion("zyx2 not like", value, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2In(List<String> values) {
			addCriterion("zyx2 in", values, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2NotIn(List<String> values) {
			addCriterion("zyx2 not in", values, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2Between(String value1, String value2) {
			addCriterion("zyx2 between", value1, value2, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx2NotBetween(String value1, String value2) {
			addCriterion("zyx2 not between", value1, value2, "zyx2");
			return (Criteria) this;
		}

		public Criteria andZyx3IsNull() {
			addCriterion("zyx3 is null");
			return (Criteria) this;
		}

		public Criteria andZyx3IsNotNull() {
			addCriterion("zyx3 is not null");
			return (Criteria) this;
		}

		public Criteria andZyx3EqualTo(String value) {
			addCriterion("zyx3 =", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3NotEqualTo(String value) {
			addCriterion("zyx3 <>", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3GreaterThan(String value) {
			addCriterion("zyx3 >", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3GreaterThanOrEqualTo(String value) {
			addCriterion("zyx3 >=", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3LessThan(String value) {
			addCriterion("zyx3 <", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3LessThanOrEqualTo(String value) {
			addCriterion("zyx3 <=", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3Like(String value) {
			addCriterion("zyx3 like", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3NotLike(String value) {
			addCriterion("zyx3 not like", value, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3In(List<String> values) {
			addCriterion("zyx3 in", values, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3NotIn(List<String> values) {
			addCriterion("zyx3 not in", values, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3Between(String value1, String value2) {
			addCriterion("zyx3 between", value1, value2, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx3NotBetween(String value1, String value2) {
			addCriterion("zyx3 not between", value1, value2, "zyx3");
			return (Criteria) this;
		}

		public Criteria andZyx4IsNull() {
			addCriterion("zyx4 is null");
			return (Criteria) this;
		}

		public Criteria andZyx4IsNotNull() {
			addCriterion("zyx4 is not null");
			return (Criteria) this;
		}

		public Criteria andZyx4EqualTo(String value) {
			addCriterion("zyx4 =", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4NotEqualTo(String value) {
			addCriterion("zyx4 <>", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4GreaterThan(String value) {
			addCriterion("zyx4 >", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4GreaterThanOrEqualTo(String value) {
			addCriterion("zyx4 >=", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4LessThan(String value) {
			addCriterion("zyx4 <", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4LessThanOrEqualTo(String value) {
			addCriterion("zyx4 <=", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4Like(String value) {
			addCriterion("zyx4 like", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4NotLike(String value) {
			addCriterion("zyx4 not like", value, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4In(List<String> values) {
			addCriterion("zyx4 in", values, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4NotIn(List<String> values) {
			addCriterion("zyx4 not in", values, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4Between(String value1, String value2) {
			addCriterion("zyx4 between", value1, value2, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx4NotBetween(String value1, String value2) {
			addCriterion("zyx4 not between", value1, value2, "zyx4");
			return (Criteria) this;
		}

		public Criteria andZyx5IsNull() {
			addCriterion("zyx5 is null");
			return (Criteria) this;
		}

		public Criteria andZyx5IsNotNull() {
			addCriterion("zyx5 is not null");
			return (Criteria) this;
		}

		public Criteria andZyx5EqualTo(String value) {
			addCriterion("zyx5 =", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5NotEqualTo(String value) {
			addCriterion("zyx5 <>", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5GreaterThan(String value) {
			addCriterion("zyx5 >", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5GreaterThanOrEqualTo(String value) {
			addCriterion("zyx5 >=", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5LessThan(String value) {
			addCriterion("zyx5 <", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5LessThanOrEqualTo(String value) {
			addCriterion("zyx5 <=", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5Like(String value) {
			addCriterion("zyx5 like", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5NotLike(String value) {
			addCriterion("zyx5 not like", value, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5In(List<String> values) {
			addCriterion("zyx5 in", values, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5NotIn(List<String> values) {
			addCriterion("zyx5 not in", values, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5Between(String value1, String value2) {
			addCriterion("zyx5 between", value1, value2, "zyx5");
			return (Criteria) this;
		}

		public Criteria andZyx5NotBetween(String value1, String value2) {
			addCriterion("zyx5 not between", value1, value2, "zyx5");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_config
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_config
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 17 13:34:44 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}