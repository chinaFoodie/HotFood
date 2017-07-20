package com.mua.cml;

import com.mua.cml.util.MyHttpClient;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by King on 2017/7/20.
 */
public class HFTest {
    public static void main(String[] args) throws IOException {
        MyHttpClient httpClient = MyHttpClient.getInstance();
        String hostUrl = "https://ali-weather.showapi.com/area-to-weather?area=重庆";
        List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
        HttpEntity entity = httpClient.doGet(hostUrl, params, true, null);
        String result = EntityUtils.toString(entity);
        System.out.print(result);
    }
}
