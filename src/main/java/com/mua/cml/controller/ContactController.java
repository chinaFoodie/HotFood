package com.mua.cml.controller;

import com.mua.cml.model.Contact;
import com.mua.cml.model.ContactExample;
import com.mua.cml.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by King on 2017/7/17.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @Resource
    ContactService contactService;

    @ResponseBody
    @RequestMapping(value = "/contacts")
    public List<Contact> getContacts (HttpServletRequest request, RedirectAttributes attributes) throws Exception {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        ContactExample contactExample = new ContactExample();
//        ContactExample.Criteria criteria = ContactExample.createCriteria();
        List<Contact> users = contactService.getContacts(contactExample);
        return users;
    }
}
