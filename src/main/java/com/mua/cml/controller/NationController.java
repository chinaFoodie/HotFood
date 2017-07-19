package com.mua.cml.controller;

import com.alibaba.fastjson.JSONObject;
import com.mua.cml.common.ApiResponse;
import com.mua.cml.service.NationService;
import com.mua.cml.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by King on 2017/7/17.
 */
@Controller
@RequestMapping("/cml")
public class NationController {
    private static String UPD_IMG_DIRECTORY = "/updImg/";

    @Resource
    NationService nationService;

    @RequestMapping("/addNation")
    @ResponseBody
    public ApiResponse addNation(@RequestParam String nationName,
                                 @RequestParam String nationDesc, @RequestParam String nationPic) {
        int rows = nationService.updNation(nationName, nationDesc, nationPic);
        return ApiResponse.sucInstance(rows);
    }

    @ResponseBody
    @RequestMapping(value = "/nationImgUpload", method = RequestMethod.POST)
    public ApiResponse upLoadNationPic(MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        //解决跨域名访问问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            if (file == null) {
                return ApiResponse.errInstance();
            }
            String fileName = file.getOriginalFilename();
            String realPath = request.getSession().getServletContext().getRealPath("/");
            String trueFileName = DateUtil.format(new Date(), DateUtil.FORMAT_YYYYMMDDHHMMSS_CLOSELY) + fileName;
            String fileStorePath = realPath + UPD_IMG_DIRECTORY + trueFileName;
            file.transferTo(new File(fileStorePath));
            return ApiResponse.sucInstance(UPD_IMG_DIRECTORY + trueFileName);
        } catch (Exception e) {
            return ApiResponse.errInstance();
        }
    }


    @RequestMapping(value = "/uploadImg", headers = "content-type=multipart/*", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse uploadImg(MultipartFile img, HttpServletRequest request) {
        String picUrl = "";
        try {
            picUrl = nationService.upload(img, request, picUrl);
            return ApiResponse.sucInstance(picUrl);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.errInstance();
        }
    }
}
