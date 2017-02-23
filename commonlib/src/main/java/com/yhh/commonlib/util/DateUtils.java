package com.yhh.commonlib.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author YangKai
 * @Email yk_200842135@163.com
 * @Date 2016-12-21
 * @Description
 */
public class DateUtils {
    private static final String DATE_SHORT_FORMAT = "yyyy-MM-dd";
    private static final String DATE_WEEK_FORMAT = "yyyy-MM-dd EEEE";

    public static String getWeekDay(String dateStr) {
        String result = "";
        try {
            Date date = new SimpleDateFormat(DATE_SHORT_FORMAT).parse(dateStr);
            result = getWeekDate(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String getWeekDate(Date date) {
        SimpleDateFormat dateFm = new SimpleDateFormat(DATE_WEEK_FORMAT);
        return dateFm.format(date);
    }
}
