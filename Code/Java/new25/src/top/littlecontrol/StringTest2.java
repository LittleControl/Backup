/**
 * Author: littlecontrol
 * Date: 6/4/19 3:45 PM
 */
package top.littlecontrol;
/*
* 对于字符串来说,纯字面量的运算是在常量池中进行的,可一旦出现了变量,运算便在堆空间中进行
* 而intern()方法会返回一个在常量池中的字符串
*
* */
public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "Little";
        String s2 = "Control";
        String s3 = "LittleControl";
        String s4 = "Little"+"Control";
        String s5 = s1 + "Control";
        String s6 = s1 + s2;
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false !!!注意,堆空间中是可以出现相同的内容的(区别与常量池)
        String s7 = s3.intern();
        String s8 = s5.intern();
        System.out.println(s3 == s7);//true
        System.out.println(s3 == s8);//true
    }
}
