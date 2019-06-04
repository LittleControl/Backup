/**
 * Author: littlecontrol
 * Date: 6/4/19 4:27 PM
 */
package top.littlecontrol;
/*
* String类的常用方法1
* int length
* char charAt   返回字符串索引值处的字符
* string toLowerCase
* string toUpperCase
* boolean equals
* boolean equalsIgnoreCase
* string supString  返回一个子串
* int compareTo     返回字符Unicode编码的差(一个一个比较,若不为0则继续比较)
* string concat     相当于"+"
* boolean isEmpty   return value.length == 0
* string trim       去除串两边的空白,并返回一个新串
* !!!注意以上方法都不会对原串做修改
* */
public class StringTest4 {
    public static void main(String[] args) {
        String s1 = "Little";
        String s2 = "Control";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        String s3 = "";
        System.out.println(s1.isEmpty());
        System.out.println(s3.isEmpty());
        String s4 = "  Little  Control   ";
        System.out.println("---"+s4+"---");
        System.out.println("---"+s4.trim()+"---");

    }
}
