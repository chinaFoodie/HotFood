package com.mua.cml.util;

import java.util.Random;

/**
 * Created by King on 2017/7/20.
 */
public class MemberIdUtil {
    /**
     * 产生用户id
     *
     * @return
     */
    public static long createMemberId() {
        long memberId;
        Random ne = new Random();
        memberId = ne.nextInt(99999 - 10000 + 1) + 10000;
        return memberId;
    }
}
