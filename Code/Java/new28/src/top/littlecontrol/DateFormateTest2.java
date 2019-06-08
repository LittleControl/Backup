/**
 * Author: littlecontrol
 * Date: 6/8/19 5:03 PM
 */
package top.littlecontrol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1. 将2000-03-23转换为java.sql.Date对象
 * 2. 三天打鱼两天晒网 1990-01-01起,问2000-03-23那一天是在打渔还是晒网
 *      思路一:通过毫秒数
 *      思路二:1990-01-01  --->>>  1999-12-31  --->>>  2000-01-01  --->>>  2000-03-23
 *
 * */
public class DateFormateTest2 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = sdf.parse("2000-03-23");
            java.sql.Date date2 = new java.sql.Date(date1.getTime());
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date oriDate = sdf2.parse("1990-01-01");
            Date curDate = sdf2.parse("1990-01-11");
            int result = (int) ((curDate.getTime() - oriDate.getTime() + (1000 * 60 * 60 * 24)) / (1000 * 60 * 60 * 24) % 5);
//            System.out.println(result);
            if(result == 4 || result == 0){
                System.out.println("正在晒网");
            } else {
                System.out.println("正在打渔");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
