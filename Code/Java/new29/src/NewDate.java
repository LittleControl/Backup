import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Author: littlecontrol
 * Date: 6/9/19 10:25 AM
 */
/*
 * JDK8 新增的有关时间的类
 * LocalDate LocalTime LocalDateTime
 * 1. now()
 * 2. of()
 * 3. getXxx()
 * 4. setXxx()
 *
 * */
public class NewDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
        LocalDateTime ldt1 = LocalDateTime.of(2000, 03, 23, 05, 21, 29);
        System.out.println(ldt1);
        System.out.println(ldt.getDayOfYear());
        ldt1 = ldt1.withDayOfYear(233);
        System.out.println(ldt1);

    }
}
