package com.mua.cml.controller;

import com.mua.cml.common.ApiResponse;
import com.mua.cml.service.NationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by King on 2017/7/17.
 */
@Controller
@RequestMapping("/cml")
public class NationController {

    @Resource
    NationService nationService;

    @RequestMapping("/addNation")
    @ResponseBody
    public ApiResponse addNation(@RequestParam String nationName,
                                 @RequestParam String nationDesc, @RequestParam String nationPic) {
        int rows = nationService.updNation(nationName, nationDesc, nationPic);
        return ApiResponse.sucInstance(rows);
    }

}
