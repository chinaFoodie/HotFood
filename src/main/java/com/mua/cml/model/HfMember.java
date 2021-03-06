package com.mua.cml.model;

import java.util.Date;

public class HfMember {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_id
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private Long memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_nick
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_desc
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_level
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_sex
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_phone
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_id_card
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberIdCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_head_image
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberHeadImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_create_time
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private Date memberCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hf_member.member_password
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    private String memberPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_id
     *
     * @return the value of hf_member.member_id
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_id
     *
     * @param memberId the value for hf_member.member_id
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_nick
     *
     * @return the value of hf_member.member_nick
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberNick() {
        return memberNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_nick
     *
     * @param memberNick the value for hf_member.member_nick
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberNick(String memberNick) {
        this.memberNick = memberNick == null ? null : memberNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_desc
     *
     * @return the value of hf_member.member_desc
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberDesc() {
        return memberDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_desc
     *
     * @param memberDesc the value for hf_member.member_desc
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberDesc(String memberDesc) {
        this.memberDesc = memberDesc == null ? null : memberDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_level
     *
     * @return the value of hf_member.member_level
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberLevel() {
        return memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_level
     *
     * @param memberLevel the value for hf_member.member_level
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel == null ? null : memberLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_sex
     *
     * @return the value of hf_member.member_sex
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberSex() {
        return memberSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_sex
     *
     * @param memberSex the value for hf_member.member_sex
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex == null ? null : memberSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_phone
     *
     * @return the value of hf_member.member_phone
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_phone
     *
     * @param memberPhone the value for hf_member.member_phone
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_id_card
     *
     * @return the value of hf_member.member_id_card
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberIdCard() {
        return memberIdCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_id_card
     *
     * @param memberIdCard the value for hf_member.member_id_card
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberIdCard(String memberIdCard) {
        this.memberIdCard = memberIdCard == null ? null : memberIdCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_head_image
     *
     * @return the value of hf_member.member_head_image
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberHeadImage() {
        return memberHeadImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_head_image
     *
     * @param memberHeadImage the value for hf_member.member_head_image
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberHeadImage(String memberHeadImage) {
        this.memberHeadImage = memberHeadImage == null ? null : memberHeadImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_create_time
     *
     * @return the value of hf_member.member_create_time
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public Date getMemberCreateTime() {
        return memberCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_create_time
     *
     * @param memberCreateTime the value for hf_member.member_create_time
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberCreateTime(Date memberCreateTime) {
        this.memberCreateTime = memberCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hf_member.member_password
     *
     * @return the value of hf_member.member_password
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public String getMemberPassword() {
        return memberPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hf_member.member_password
     *
     * @param memberPassword the value for hf_member.member_password
     *
     * @mbggenerated Thu Jul 20 15:06:36 CST 2017
     */
    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }
}