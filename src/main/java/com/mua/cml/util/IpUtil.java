package com.mua.cml.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by yan on 2017/4/16.
 */
public class IpUtil {

    /**
     * ip转换成数字
     *
     * @param ip
     * @return
     * @throws Exception
     */
    public static long parse(String ip) throws UnknownHostException {
        byte[] ips = InetAddress.getByName(ip).getAddress();
        long addr = ips[3] & 0xFF;
        addr |= ((ips[2] << 8) & 0xFF00);
        addr |= ((ips[1] << 16) & 0xFF0000);
        addr |= ((ips[0] << 24) & 0xFF000000);
        return addr;
    }

    /**
     * ip的某一字节转换成数字
     *
     * @param ip
     * @param index ip字节位置，ipv4范围0-3，高位为0，低位为3
     * @return
     * @throws Exception
     */
    public static long parseIndex(String ip, int index) throws UnknownHostException {
        byte[] ips = InetAddress.getByName(ip).getAddress();
        return ips[index];
    }

    /**
     * 获取本机hostname
     * @return
     */
    public static String getLocalHostName() {
        String hostName;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            hostName = addr.getHostName();
        } catch (Exception ex) {
            hostName = "";
        }
        return hostName;
    }

    /**
     * 获取本机所有ip
     * @return
     */
    public static String[] getAllLocalHostIP() {
        String[] ret = null;
        try {
            String hostName = getLocalHostName();
            if (hostName.length() > 0) {
                InetAddress[] addrs = InetAddress.getAllByName(hostName);
                if (addrs.length > 0) {
                    ret = new String[addrs.length];
                    for (int i = 0; i < addrs.length; i++) {
                        ret[i] = addrs[i].getHostAddress();
                    }
                }
            }
        } catch (Exception ex) {
            ret = null;
        }
        return ret;
    }

    /**
     * 获取本机10段的内网ip
     * @return
     */
    public static String getInsideIp(){
        String[] ips = getAllLocalHostIP();
        for(String ip : ips){
            if(ip.startsWith("10.")){
                return ip;
            }
        }
        return null;
    }
}
