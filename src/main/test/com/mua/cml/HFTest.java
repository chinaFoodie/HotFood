package com.mua.cml;

import com.mua.cml.util.MemberIdUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by King on 2017/7/20.
 */
public class HFTest {

    public static List<Long> list = new ArrayList<Long>();

    public static void main(String[] args) throws IOException {
//        MyHttpClient httpClient = MyHttpClient.getInstance();
//        String hostUrl = "https://ali-weather.showapi.com/area-to-weather?area=重庆";
//        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
//        HttpEntity entity = httpClient.doGet(hostUrl, params, true, null);
//        String result = EntityUtils.toString(entity);
//        System.out.print(result);
//        int x;//定义两变量
//        Random ne = new Random();//实例化一个random的对象ne
//        x = ne.nextInt(99999 - 10000 + 1) + 10000;//为变量赋随机值1000-9999
//        System.out.println("产生的随机数是:" + x);//输出

//        Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
//        InetAddress ip = null;
//        while (allNetInterfaces.hasMoreElements()) {
//            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
//            System.out.println(netInterface.getName());
//            Enumeration addresses = netInterface.getInetAddresses();
//            while (addresses.hasMoreElements()) {
//                ip = (InetAddress) addresses.nextElement();
//                if (ip != null && ip instanceof Inet4Address) {
//                    System.out.println("本机的IP = " + ip.getHostAddress());
//                }
//            }
//        }

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                getId(0);
            }
        }
    }

    public static long getId(int times) {
        long id;
        times++;
        id = MemberIdUtil.createMemberId() + 100000;
        if (times >= 5) {
            int temp = times / 5;
            id = MemberIdUtil.createMemberId() + 100000 * (temp + 1);
        }
        if (list.contains(id)) {
            getId(times);
        }
        list.add(id);
        if (id > 199999) {
            System.out.print("times==>>" + times + "\n");
        }
        System.out.print("生成的id为==>>" + id + "\n");
        return id;
    }
}
