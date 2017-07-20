package com.mua.cml.mapper;

import com.mua.cml.model.Contact;
import com.mua.cml.model.ContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int countByExample(ContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int deleteByExample(ContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int insert(Contact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int insertSelective(Contact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    List<Contact> selectByExample(ContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    Contact selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int updateByExampleSelective(@Param("record") Contact record, @Param("example") ContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int updateByExample(@Param("record") Contact record, @Param("example") ContactExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int updateByPrimaryKeySelective(Contact record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbggenerated Thu Jul 20 14:17:47 CST 2017
     */
    int updateByPrimaryKey(Contact record);
}