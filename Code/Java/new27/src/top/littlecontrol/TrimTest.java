/**
 * Author: littlecontrol
 * Date: 6/7/19 9:21 PM
 */
package top.littlecontrol;
/*
* 手写String类的trim方法
*
* */
public class TrimTest {
    public static void main(String[] args) {
        Trim t1 = new Trim();
        String s1 = " 我得 5 ";
        String s2 = t1.myTrim(s1);
        System.out.println("----"+s1+"---");
        System.out.println("++++"+s2+"+++");
    }
}

class Trim {
    public String myTrim(String str) {
        if (str.isBlank()) {
            return "";
        }
        char[] arr = str.toCharArray();
        int head = 0;
        int tail = arr.length-1;
        while(arr[head] == ' '){
            head++;
        }
        while (arr[tail] == ' '){
            tail--;
        }
        char[] arr2 = new char[tail-head+1];
        for(int i = head,j =0; i < tail+1; i++,j++){
            arr2[j] = arr[i];
        }
        String str2 = new String(arr2);
        return str2;
    }
}
