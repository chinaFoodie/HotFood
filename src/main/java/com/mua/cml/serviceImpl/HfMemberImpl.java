package com.mua.cml.serviceImpl;

import com.mua.cml.mapper.HfMemberMapper;
import com.mua.cml.model.HfMember;
import com.mua.cml.service.HFMemberService;
import com.mua.cml.util.DateUtil;
import com.mua.cml.util.MemberIdUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by King on 2017/7/20.
 */
@Service
public class HfMemberImpl implements HFMemberService {

    @Resource
    HfMemberMapper hfMemberMapper;

    @Override
    public long register(String phone, String password, String nick) {
        HfMember hfMember = new HfMember();
        hfMember.setMemberId(getId());
        hfMember.setMemberPhone(phone);
        hfMember.setMemberPassword(password);
        hfMember.setMemberNick(nick);
        try {
            hfMember.setMemberCreateTime(DateUtil.parse(new Date(), "yyyyMMddHHmmss"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        hfMemberMapper.insert(hfMember);
        return hfMember.getMemberId();
    }

    @Override
    public HfMember selectById(long id) throws Exception {
        HfMember hfMember = hfMemberMapper.selectByPrimaryKey(id);
        return hfMember;
    }

    private long getId() {
        long id;
        int times = 0;
        times++;
        id = MemberIdUtil.createMemberId() + 100000;
        if (times >= 5) {
            int temp = times / 5;
            id = MemberIdUtil.createMemberId() + 100000 * (temp + 1);
        }
        HfMember hfMember = hfMemberMapper.selectByPrimaryKey(id);
        if (hfMember != null) {
            getId();
        }
        return id;
    }
}
