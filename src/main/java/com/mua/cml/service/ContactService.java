package com.mua.cml.service;

import com.mua.cml.model.Contact;
import com.mua.cml.model.ContactExample;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by King on 2017/7/17.
 */
@Service
public interface ContactService {
    List<Contact> getContacts(ContactExample contactExample) throws Exception;
}
