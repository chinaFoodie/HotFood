package com.mua.cml.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by hanhaiwen on 04/03/2016.
 */
public class DateUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);
    public static final String FORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_YYYYMMDDHH00 = "yyyy-MM-dd HH:00:00";
    public static final String FORMAT_YYYYMMDD = "yyyy-MM-dd";
    public static final String FORMAT_YYYYMMDD00 = "yyyy-MM-dd 00:00:00";
    public static final String FORMAT_YYYYMMDD59 = "yyyy-MM-dd 23:59:59";
    public static final String FORMAT_YYYYMMDDHHMMSS_CLOSELY = "yyyyMMddHHmmss";

    /**
     * 日期转换成字符串
     * @param date
     * @param format
     * @return
     */
    public static String format(Date date, String format) {
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 字符串转换成日期
     * @param strDate
     * @param format
     * @return
     * @throws ParseException
     */
    public static Date parse(String strDate, String format) throws ParseException {
        if(strDate == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(strDate);
    }

    /**
     * 将日期转换成指定格式，返回日期
     * @param date
     * @param format
     * @return
     * @throws Exception
     */
    public static Date parse(Date date, String format) throws Exception {
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return parse(sdf.format(date), format);
    }

    /**
     * 日期增加分钟
     * @param date
     * @param minutes
     * @return
     */
    public static Timestamp currentTimeAddMinutes(Date date, Integer minutes) {
        if(date == null){
            return null;
        }
        Date afterAddingMins = new Date(date.getTime() + minutes * 60 * 1000);
        return Timestamp.valueOf(format(afterAddingMins, FORMAT_YYYYMMDDHHMMSS));
    }

    /**
     * 日期减少分钟
     * @param date
     * @param minutes
     * @return
     */
    public static Timestamp currentTimeMinusMinutes(Date date, Integer minutes) {
        if(date == null){
            return null;
        }
        Date afterAddingMins = new Date(date.getTime() - minutes * 60 * 1000);
        return Timestamp.valueOf(format(afterAddingMins, FORMAT_YYYYMMDDHHMMSS));
    }

    /**
     * date 转化为 timestamp
     *
     * @return
     */
    public static Timestamp dateToTimestamp(Date date) {
        if(date == null){
            return null;
        }
        return Timestamp.valueOf(format(date, FORMAT_YYYYMMDDHHMMSS));
    }

    /**
     * 将当前时间的 时分秒 归零
     * @return
     * @throws ParseException
     */
    public static Date zeroCurrentTime(Date date) throws ParseException {
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YYYYMMDD00);
        return parse(sdf.format(date), FORMAT_YYYYMMDDHHMMSS);
    }

    /**
     * 将当前时间的时分秒改为59
     * @param date
     * @return
     * @throws Exception
     */
    public static Date maxCurrentTime(Date date) throws  ParseException {
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YYYYMMDD59);
        return parse(sdf.format(date), FORMAT_YYYYMMDDHHMMSS);
    }

    /**
     * 日期减少天数
     * @param date
     * @param days
     * @return
     */
    public static Date minusDays(Date date, int days) {
        if(date == null){
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);
        return cal.getTime();
    }

    /**
     * 日期增加天数
     * @param date
     * @param days
     * @return
     */
    public static Date addDays(Date date, int days) {
        if(date == null){
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    /**
     * 在date基础上调整日期，增加+或减少-
     * @param date
     * @param num
     * @param calendarType 如 Calendar.HOUR
     * @return
     */
    public static Date addTime(Date date, int num, int calendarType) {
        if(date == null){
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(calendarType, num);
        return cal.getTime();
    }

    /**
     * 判断一个date 是否只是yyyy-MM-dd类型的date
     *
     * @param date
     * @return
     */
    public static boolean isYYYYMMDDDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date == null)
            return false;
        calendar.setTime(date);
        if (calendar.get(Calendar.HOUR) == 0 && calendar.get(Calendar.MINUTE) == 0 && calendar.get(Calendar.SECOND) == 0 && calendar.get(Calendar.MILLISECOND) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断时间是否在区间内(兼容临界值为null的情况)
     * @param judgeDate
     * @param startDate
     * @param endDate
     * @return
     */
    public static boolean timeBetween(Date judgeDate, Date startDate, Date endDate) {
        if(judgeDate == null) {
            return false;
        }
        if(startDate == null && endDate == null) {
            return true;
        }else if(startDate == null && judgeDate.getTime() <= endDate.getTime()) {
            return true;
        }else if(endDate == null && judgeDate.getTime() >= startDate.getTime()) {
            return true;
        }else if(judgeDate.getTime() >= startDate.getTime() && judgeDate.getTime() <= endDate.getTime()) {
            return true;
        }
        return false;
    }


    /**
     * 计算两个日期之间相差的天数
     * @param smallDate 较小的时间
     * @param bigDate  较大的时间
     * @return 相差天数
     * @throws ParseException
     */
    public static int daysBetween(Date smallDate,Date bigDate) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            smallDate=sdf.parse(sdf.format(smallDate));
            bigDate=sdf.parse(sdf.format(bigDate));
        } catch (ParseException e) {
            LOGGER.error("解析日期异常。[smallDate:{},bigDate:{}]",smallDate,bigDate);
            throw new RuntimeException("解析日期异常。");
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(smallDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bigDate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 获取某日期指定位置的值
     * @param date
     * @param target
     * @return
     */
    public static int getValue(Date date, int target){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(target);
    }

    /**
     * 延长时间
     * @param date
     * @param num
     * @param calendarType
     * @return
     */
    public static Date extendDate(Date date, int num, int calendarType){
        return addTime(date, num, calendarType);
    }

    /**
     * 获取当前日期字符串
     * @param separator
     * @return
     */
    public static String getNowDateStr(String separator){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DATE);

        return year + separator + month + separator + day;
    }

    //生成唯一的文件名
    public static String getUniqueFileName(){
        String str = UUID.randomUUID().toString();
        return str.replace("-", "");
    }

}
