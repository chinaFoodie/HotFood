package com.mua.cml.service;

import com.alibaba.fastjson.JSONObject;
import com.mua.cml.model.CmlNation;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by King on 2017/7/17.
 */
@Service
public interface NationService {
    int insert(CmlNation cmlNation);

    int updNation(String nationName, String nationDesc, String nationPic);

    String upload (MultipartFile file, HttpServletRequest request, String picUrl) throws IOException;
}
