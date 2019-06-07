/**
 * Author: littlecontrol
 * Date: 6/6/19 2:18 PM
 */
package top.littlecontrol;
/*
* String StringBuffer StringBuilder的区别与联系
* 相同点:
*   这三者底层都是用的 char[]
* 不同点:
* String            不可变的字符序列
* StringBuffer      可变的字符序列,线程安全,效率低
* StringBuilder     可变的字符序列,线程不安全,效率高
* Buffer与Builder默认的空参构造器都会创建一个长度为16的char[],使用append方法时会检查容量是否足够,不够时会扩容,原来的容量*2+2
* 一般开发中可以使用重载的构造器,来指定创建的容量
* 对于Buffer和Builder来说,this.length返回的是已有元素的数量,而不是容量的大小
* */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("LittleControl");
        sb1.append(",hello");
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());
    }
}
