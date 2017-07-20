package com.mua.cml.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HfMemberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public HfMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
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

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNickIsNull() {
            addCriterion("member_nick is null");
            return (Criteria) this;
        }

        public Criteria andMemberNickIsNotNull() {
            addCriterion("member_nick is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNickEqualTo(String value) {
            addCriterion("member_nick =", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickNotEqualTo(String value) {
            addCriterion("member_nick <>", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickGreaterThan(String value) {
            addCriterion("member_nick >", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickGreaterThanOrEqualTo(String value) {
            addCriterion("member_nick >=", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickLessThan(String value) {
            addCriterion("member_nick <", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickLessThanOrEqualTo(String value) {
            addCriterion("member_nick <=", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickLike(String value) {
            addCriterion("member_nick like", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickNotLike(String value) {
            addCriterion("member_nick not like", value, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickIn(List<String> values) {
            addCriterion("member_nick in", values, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickNotIn(List<String> values) {
            addCriterion("member_nick not in", values, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickBetween(String value1, String value2) {
            addCriterion("member_nick between", value1, value2, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberNickNotBetween(String value1, String value2) {
            addCriterion("member_nick not between", value1, value2, "memberNick");
            return (Criteria) this;
        }

        public Criteria andMemberDescIsNull() {
            addCriterion("member_desc is null");
            return (Criteria) this;
        }

        public Criteria andMemberDescIsNotNull() {
            addCriterion("member_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDescEqualTo(String value) {
            addCriterion("member_desc =", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescNotEqualTo(String value) {
            addCriterion("member_desc <>", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescGreaterThan(String value) {
            addCriterion("member_desc >", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescGreaterThanOrEqualTo(String value) {
            addCriterion("member_desc >=", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescLessThan(String value) {
            addCriterion("member_desc <", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescLessThanOrEqualTo(String value) {
            addCriterion("member_desc <=", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescLike(String value) {
            addCriterion("member_desc like", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescNotLike(String value) {
            addCriterion("member_desc not like", value, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescIn(List<String> values) {
            addCriterion("member_desc in", values, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescNotIn(List<String> values) {
            addCriterion("member_desc not in", values, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescBetween(String value1, String value2) {
            addCriterion("member_desc between", value1, value2, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberDescNotBetween(String value1, String value2) {
            addCriterion("member_desc not between", value1, value2, "memberDesc");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(String value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(String value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(String value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(String value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(String value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(String value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLike(String value) {
            addCriterion("member_level like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotLike(String value) {
            addCriterion("member_level not like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<String> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<String> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(String value1, String value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(String value1, String value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(String value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(String value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(String value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(String value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(String value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(String value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLike(String value) {
            addCriterion("member_sex like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotLike(String value) {
            addCriterion("member_sex not like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<String> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<String> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(String value1, String value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(String value1, String value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIsNull() {
            addCriterion("member_phone is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIsNotNull() {
            addCriterion("member_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneEqualTo(String value) {
            addCriterion("member_phone =", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotEqualTo(String value) {
            addCriterion("member_phone <>", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneGreaterThan(String value) {
            addCriterion("member_phone >", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("member_phone >=", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLessThan(String value) {
            addCriterion("member_phone <", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLessThanOrEqualTo(String value) {
            addCriterion("member_phone <=", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLike(String value) {
            addCriterion("member_phone like", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotLike(String value) {
            addCriterion("member_phone not like", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIn(List<String> values) {
            addCriterion("member_phone in", values, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotIn(List<String> values) {
            addCriterion("member_phone not in", values, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneBetween(String value1, String value2) {
            addCriterion("member_phone between", value1, value2, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotBetween(String value1, String value2) {
            addCriterion("member_phone not between", value1, value2, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardIsNull() {
            addCriterion("member_id_card is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardIsNotNull() {
            addCriterion("member_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardEqualTo(String value) {
            addCriterion("member_id_card =", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotEqualTo(String value) {
            addCriterion("member_id_card <>", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardGreaterThan(String value) {
            addCriterion("member_id_card >", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_card >=", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardLessThan(String value) {
            addCriterion("member_id_card <", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardLessThanOrEqualTo(String value) {
            addCriterion("member_id_card <=", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardLike(String value) {
            addCriterion("member_id_card like", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotLike(String value) {
            addCriterion("member_id_card not like", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardIn(List<String> values) {
            addCriterion("member_id_card in", values, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotIn(List<String> values) {
            addCriterion("member_id_card not in", values, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardBetween(String value1, String value2) {
            addCriterion("member_id_card between", value1, value2, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotBetween(String value1, String value2) {
            addCriterion("member_id_card not between", value1, value2, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageIsNull() {
            addCriterion("member_head_image is null");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageIsNotNull() {
            addCriterion("member_head_image is not null");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageEqualTo(String value) {
            addCriterion("member_head_image =", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageNotEqualTo(String value) {
            addCriterion("member_head_image <>", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageGreaterThan(String value) {
            addCriterion("member_head_image >", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageGreaterThanOrEqualTo(String value) {
            addCriterion("member_head_image >=", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageLessThan(String value) {
            addCriterion("member_head_image <", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageLessThanOrEqualTo(String value) {
            addCriterion("member_head_image <=", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageLike(String value) {
            addCriterion("member_head_image like", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageNotLike(String value) {
            addCriterion("member_head_image not like", value, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageIn(List<String> values) {
            addCriterion("member_head_image in", values, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageNotIn(List<String> values) {
            addCriterion("member_head_image not in", values, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageBetween(String value1, String value2) {
            addCriterion("member_head_image between", value1, value2, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberHeadImageNotBetween(String value1, String value2) {
            addCriterion("member_head_image not between", value1, value2, "memberHeadImage");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeIsNull() {
            addCriterion("member_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeIsNotNull() {
            addCriterion("member_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("member_create_time =", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("member_create_time <>", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("member_create_time >", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_create_time >=", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("member_create_time <", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_create_time <=", value, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("member_create_time in", values, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("member_create_time not in", values, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_create_time between", value1, value2, "memberCreateTime");
            return (Criteria) this;
        }

        public Criteria andMemberCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_create_time not between", value1, value2, "memberCreateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_member
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 20 14:17:47 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hf_member
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}