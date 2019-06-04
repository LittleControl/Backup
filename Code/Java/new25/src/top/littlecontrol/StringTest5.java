/**
 * Author: littlecontrol
 * Date: 6/4/19 4:54 PM
 */
package top.littlecontrol;
/*
* String常用方法2
* boolean endsWith
* boolean startsWith
* int indexOf       返回要查找的字符或字符串的索引(从前往后查找)
* int lastIndexOf   (从后往前查找)
* boolean contains
*
* */
public class StringTest5 {
    public static void main(String[] args) {
        String s1 = "LittleControl";
        System.out.println(s1.endsWith("Control"));
        System.out.println(s1.startsWith("Control"));
        System.out.println(s1.startsWith("Control",6));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.indexOf(67));
        System.out.println(s1.indexOf("l",6));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.lastIndexOf("l",11));
        System.out.println(s1.contains("Control"));
    }
}
