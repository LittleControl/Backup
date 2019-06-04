/**
 * Author: littlecontrol
 * Date: 6/4/19 5:34 PM
 */
package top.littlecontrol;
/*
* String replace        会替换掉所有符合条件
* 以下的方法都会用到正则表达式,然而Java中的正则表达式我还没有学(╯﹏╰)
* String replaceAll
* String replaceFirst
* boolean mathes
* String[] split
*
* */
public class StringTest6 {
    public static void main(String[] args) {
        String s1 = "LittleControl";
        System.out.println(s1.replace('L','D'));
        System.out.println(s1.replace("Little","Nothing"));
//        System.out.println(s1.matches("[A-Z]+"));
        s1 = "Little*Control*ya";
        String[] s2 = s1.split("[*]");
        for(String each : s2){
            System.out.println(each);
        }
    }
}
