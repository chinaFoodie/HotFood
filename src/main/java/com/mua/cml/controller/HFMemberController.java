package com.mua.cml.controller;

import com.mua.cml.common.ApiResponse;
import com.mua.cml.service.HFMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 会员控制器
 * Created by King on 2017/7/20.
 */
@Controller
@RequestMapping("/member")
public class HFMemberController {

    @Resource
    HFMemberService hfMemberService;

    @ResponseBody
    @RequestMapping(value = "/register")
    public ApiResponse registerHfMember(@RequestParam String nick, @RequestParam String phone, @RequestParam String password) {
        try {
            long memberId = hfMemberService.register(phone, password, nick);
            return ApiResponse.sucInstance(hfMemberService.selectById(memberId));
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.errInstance();
        }
    }
}
