/**
 * Author: littlecontrol
 * Date: 6/8/19 3:35 PM
 */
package top.littlecontrol;

import java.util.Date;

/*
* 1.System.currentTimeMillis 返回当前时间距离1970年1月1日的毫秒数
* 2.java.util.Date
*   toString    返回当前时间对象的年月日等
*   getTime     返回当前时间对象的时间戳(距离1970年1月1日的毫秒数)
* 3.java.sql.Date 是util.Date的子类
*   java.sql.Date   --->>>  java.util.Date
*   java.util.Date  --->>>  java.sql.Date
*
*
* */
public class DateTimeTest {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        System.out.println(l1);
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        java.sql.Date date2 = new java.sql.Date(1);
        System.out.println(date2);
        /* java.sql.Date   --->>>  java.util.Date */
        Date date3 = new java.sql.Date(1);
        System.out.println(date3);
        /* java.util.Date  --->>>  java.sql.Date */
        Date date4 = new Date(20000323);
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
        System.out.println(date4);
        System.out.println(date5);

    }
}
