package com.mua.cml.service;

import com.mua.cml.model.HfMember;
import org.springframework.stereotype.Service;

/**
 * Created by King on 2017/7/20.
 */
@Service
public interface HFMemberService {
    long register(String phone, String password, String nick) throws Exception;

    HfMember selectById(long id) throws Exception;
}
