package com.mua.cml.serviceImpl;

import com.mua.cml.mapper.ContactMapper;
import com.mua.cml.model.Contact;
import com.mua.cml.model.ContactExample;
import com.mua.cml.service.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by King on 2017/7/17.
 */
@Service
public class ContactImpl implements ContactService {

    @Resource
    ContactMapper contactMapper;

    @Override
    public List<Contact> getContacts(ContactExample contactExample) throws Exception {
        List<Contact> contacts = contactMapper.selectByExample(contactExample);
        return contacts;
    }
}
