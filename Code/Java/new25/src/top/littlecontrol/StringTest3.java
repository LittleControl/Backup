/**
 * Author: littlecontrol
 * Date: 6/4/19 3:54 PM
 */
package top.littlecontrol;
/*
* 注意,对于方法中的参数,如果是基本数据类型传入的是值,而对于引用数据类型则传入的是地址值
* !!!不能简单的理解为传入地址值就可以修改原有数据
* 这里的String因为具有不可变性,当他把地址值传给方法中形参时,形参的重新赋值会失去对于对于原有字符串地址的引用,因而也不会堆原有地址做出修改
* 但是char[]型的数组因为没有不可变性,所以可以通过其他对象的引用修改
*
* */
public class StringTest3 {
    String str = "good";
    char[] arr = {'t','e','s','t'};
    public void exchange(String str,char[] arr){
        str = "Nothing";
        arr[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest3 st3 = new StringTest3();
        st3.exchange(st3.str,st3.arr);
        System.out.println(st3.str);//good
        System.out.println(st3.arr);//best
    }
}
