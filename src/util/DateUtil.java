/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author moulaYounes
 */
public class DateUtil {

    public static java.sql.Date getSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    public static java.sql.Timestamp convertFromDateToTimestamp(java.util.Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    public static java.sql.Timestamp getSqlDateTime(java.util.Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    public static String getYearOfCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        return simpleDateFormat.format(new Date());
    }

    public static String formateDate(String pattern, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

}
