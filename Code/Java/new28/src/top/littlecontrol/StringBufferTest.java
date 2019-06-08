/**
 * Author: littlecontrol
 * Date: 6/8/19 11:18 AM
 */
package top.littlecontrol;
/*
* StringBuffer 常用方法,StringBuilder与其类似,只不过就是没有synchronized
* append        向末尾添加一个东西
* delete        删除指定位置的字符串(左闭右开)
* replace       用指定的字符串替换指定位置的字符串
* insert        向指定位置插入指定的字符或字符串
* reverse       反转字符串
* charAt        返回索引位置的单个字符
* compareTo     按照Unicode编码比较,遇到一个不相同的就返回第一个的编码与第二个编码值的差值
* indexOf       返回字符串中第一次出现指定字符的索引
* subString     从指定的位置截取字符串并作为新串返回
* capacity      返回当前StringBuffer的底层数组的大小(空间长度)
* */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("LittleControl");
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer("Control");
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.indexOf("C"));
//        s1.replace(0,4,"Test");
//        System.out.println(s1.capacity());
//        String s3 = s1.substring(3);
//        System.out.println(s3);
//        s1.insert(1,"S");
//        s1.reverse();
//        char[] s4 = new char[];
        String s5 = (String) s1.subSequence(1,3);
        System.out.println(s5);
        System.out.println(s1);



    }
}
