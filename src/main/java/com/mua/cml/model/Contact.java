package com.mua.cml.model;

public class Contact {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.id
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.emailType
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    private String emailtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.email
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.numberType
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    private String numbertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.number
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    private String number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.name
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.id
     *
     * @return the value of contact.id
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.id
     *
     * @param id the value for contact.id
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.emailType
     *
     * @return the value of contact.emailType
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public String getEmailtype() {
        return emailtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.emailType
     *
     * @param emailtype the value for contact.emailType
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public void setEmailtype(String emailtype) {
        this.emailtype = emailtype == null ? null : emailtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.email
     *
     * @return the value of contact.email
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.email
     *
     * @param email the value for contact.email
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.numberType
     *
     * @return the value of contact.numberType
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public String getNumbertype() {
        return numbertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.numberType
     *
     * @param numbertype the value for contact.numberType
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public void setNumbertype(String numbertype) {
        this.numbertype = numbertype == null ? null : numbertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.number
     *
     * @return the value of contact.number
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.number
     *
     * @param number the value for contact.number
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.name
     *
     * @return the value of contact.name
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.name
     *
     * @param name the value for contact.name
     *
     * @mbggenerated Mon Jul 17 14:54:34 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}