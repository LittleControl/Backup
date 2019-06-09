import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Author: littlecontrol
 * Date: 6/9/19 11:04 AM
 */

/*
 * Instant类操作时间的方法
 * now()     返回一个Instant实例
 * atOffset  设置时区,返回一个OffsetDateTime对象
 * toEpochMilli  返回当前Instant对象对应的时间戳
 * ofEpochMilli  返回一个通过时间创建的Instant对象
 *
 * */
public class InstantTest {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        Instant instant1 = Instant.ofEpochMilli(457896547L);
        System.out.println(instant1);
    }
}
