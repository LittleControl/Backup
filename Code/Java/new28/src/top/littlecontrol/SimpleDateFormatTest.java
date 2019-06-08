/**
 * Author: littlecontrol
 * Date: 6/8/19 4:42 PM
 */
package top.littlecontrol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
* SimpleDateFormate的两个功能,格式化与解析
* 格式化与解析共用一个模式,即解析时,数据格式必须与格式化的模式一致,否则就会抛异常
* 格式化:format
* 解析:parse
*
* */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s1 = sdf.format(date1);
        System.out.println(s1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf2.format(date1));
        try {
            System.out.println(sdf2.parse("2000-03-23 05:21:29"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}