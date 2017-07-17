package com.mua.cml.controller;

import com.alibaba.fastjson.util.TypeUtils;
import com.mua.cml.common.ApiResponse;
import com.mua.cml.model.Contact;
import com.mua.cml.model.ContactExample;
import com.mua.cml.model.customized.Page;
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
    public ApiResponse getContacts(HttpServletRequest request, RedirectAttributes attributes) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Integer start = TypeUtils.castToInt(request.getParameter("start"));
        Integer length = TypeUtils.castToInt(request.getParameter("length"));
        Integer draw = TypeUtils.castToInt(request.getParameter("draw"));

        ContactExample contactExample = new ContactExample();
//        ContactExample.Criteria criteria = ContactExample.createCriteria();
        List<Contact> users = null;
        try {
            Page page = new Page();
            page.setOffset(start);
            page.setPageSize(length);
            users = contactService.getContacts(contactExample);
            return ApiResponse.dtInstance(users, draw, page.getTotalCount(), page.getTotalCount());
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.errInstance();
        }
    }
}
