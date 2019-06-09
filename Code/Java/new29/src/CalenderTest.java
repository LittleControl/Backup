import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Author: littlecontrol
 * Date: 6/9/19 9:50 AM
 */

/*
 * 使用Calendar日历类进行有关日期的操作
 *   两个实例化方法
 *   1.使用子类
 *   2.使用静态方法getInstance
 * 相关操作
 * get()
 * set()
 * add()
 *
 * Calendar --->>> Date
 * getTime()
 *
 * Date --->>> Calendar
 * setTime()
 *
 *
 * */
public class CalenderTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar calendar1 = new GregorianCalendar();
        /* get() */
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        /* set() */
        calendar.set(Calendar.DAY_OF_YEAR, 233);
        System.out.println(calendar.get((Calendar.DAY_OF_YEAR)));

        /* add */
        calendar.add(Calendar.DAY_OF_YEAR, 200);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        /* getTime() */
        Date date = calendar.getTime();
        System.out.println(date);

        /* setTime() */
        Date date1 = new Date(1000);
        calendar1.setTime(date1);
        System.out.println(calendar1.get(Calendar.DAY_OF_YEAR));
    }
}
