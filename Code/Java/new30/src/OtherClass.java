import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Author: littlecontrol
 * Date: 6/11/19 8:55 PM
 */
/*
*
* System
*   System.err   Sysetm.in   System.out
* Math
* abs sqrt 三角函数 random round pow
* BigInteger
*
* BigDecimal
* */
public class OtherClass {
    public static void main(String[] args) {
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
        BigInteger bi = new BigInteger("54646541651651651313130");
        System.out.println(bi);
        BigDecimal bd0 = new BigDecimal("55156161631631361361361361");
        System.out.println(bd0);

    }
}
