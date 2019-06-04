/**
 * Author: littlecontrol
 * Date: 6/4/19 6:03 PM
 */
package top.littlecontrol;

/*
 * String与包装类的转换
 * String --->>>  Int    parseXxx(str)
 * Int    --->>>  String String.valueOf(xxx)
 * String与char[]的转换
 * String --->>> char[]  String.toCharArray()
 * char[] --->>> String  调用String构造器
 *
 * 例题,对于一个字符串"a321bcd"将其转化为"ab123cd",及把第一位到第四位反转(提示,可以把带反转字符串转化为char[])
 *
 * */
public class StringTest7 {
    public static void main(String[] args) {
        String s1 = "123";
        int num = Integer.parseInt(s1);
        System.out.println(s1);
        System.out.println(num);
        num = 789;
        String s2 = String.valueOf(num);
        System.out.println(s2);
        String s3 = "LittleControl";
        char[] arr1 = s3.toCharArray();
        System.out.println(arr1);
        String s4 = new String(arr1);
        System.out.println(s4);
        String s5 = "123654";
        StringTest7 st7 = new StringTest7();
        String s6 = st7.resolve(s5, 3, 3);
        System.out.println(s6);

    }

    public String resolve(String str, int start, int num) {
        if(start + num > str.length()){
            num = str.length()-start;
        }
        String temp_str = str.substring(start, start + num);
        char[] arr = temp_str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp_char = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp_char;
        }
        String str_mid = new String(arr);
        String str0;
        String str1;
        if (start <= 0) {
            str0 = "";
        } else {
            str0 = str.substring(0, start);
        }
        if (start + num == str.length()){
            str1 ="";
        } else {
            str1 = str.substring(num+start,str.length());
        }
        return str0 + str_mid + str1;
    }
}
