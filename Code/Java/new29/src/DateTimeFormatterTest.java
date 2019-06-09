import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Author: littlecontrol
 * Date: 6/9/19 11:30 AM
 */

/*
 * DateTimematter 对时间进行格式化和解析
 *
 * ISO_DATE_TIME
 * ofLocalizedDateTime()
 * format()
 * parse()
 *
 * */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateFormat.format(dateTime));
//        System.out.println(dateFormat.parse("20190358"));
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        /* 这里用FormatStyle.LONG抛异常,但是SHORT和MEDIUM没问题 */
        System.out.println(formatter.format(dateTime));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(formatter1.format(dateTime));
    }
}
