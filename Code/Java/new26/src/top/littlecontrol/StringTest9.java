/**
 * Author: littlecontrol
 * Date: 6/6/19 1:42 PM
 */
package top.littlecontrol;

public class StringTest9 {
    public static void main(String[] args) {
        String s1 = "LittleControl";
        String s2 = "Little";
//        String s3 = "Control";
        String s4 = s2 + "Control";
        System.out.println(s1 == s4);//false
        /* 当s5被final修饰时,可以认为他已经是一个常量了,故运算(s5+Control)在常量池中进行 */
        final String s5 = "Little";
        String s6 = s5 + "Control";
        System.out.println(s1 == s6);//true
    }
}
