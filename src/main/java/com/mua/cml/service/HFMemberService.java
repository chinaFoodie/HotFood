package com.mua.cml.service;

import org.springframework.stereotype.Service;

/**
 * Created by King on 2017/7/20.
 */
@Service
public interface HFMemberService {
    int register(String phone, String password, String nick) throws Exception;
}
