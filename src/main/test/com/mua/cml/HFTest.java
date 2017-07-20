package com.mua.cml;

import java.io.IOException;
import java.util.Random;

/**
 * Created by King on 2017/7/20.
 */
public class HFTest {
    public static void main(String[] args) throws IOException {
//        MyHttpClient httpClient = MyHttpClient.getInstance();
//        String hostUrl = "https://ali-weather.showapi.com/area-to-weather?area=重庆";
//        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
//        HttpEntity entity = httpClient.doGet(hostUrl, params, true, null);
//        String result = EntityUtils.toString(entity);
//        System.out.print(result);
        int x;//定义两变量
        Random ne = new Random();//实例化一个random的对象ne
        x = ne.nextInt(99999 - 10000 + 1) + 10000;//为变量赋随机值1000-9999
        System.out.println("产生的随机数是:" + x);//输出
    }
}
