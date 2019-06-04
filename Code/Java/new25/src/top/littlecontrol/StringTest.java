/**
 * Author: littlecontrol
 * Date: 6/4/19 8:42 AM
 */
package top.littlecontrol;

/*
 * String底层用的是一个char[]来存储字符串
 * string 序列化的,同时也具有不可变性
 * 字符串常量池(位于方法区)
 * 实际上,所有的字符串都位于常量池中
 * 类似这样使用new的方法造了一个String对象,实际上在内存中造了两个对象,一个是堆中对象的存储结构,一个是常量池中的char[]数组
 * 常量池不会存在相同的字符串
 *
 * */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false
        Test0 t01 = new Test0("abc");
        System.out.println(t01.name == s1);//true,因为s1和to1.name引用的都是常量池中的变量

    }
}

class Test0 {
    String name;

    Test0(String name) {
        this.name = name;
    }
}
