/**
 * Author: littlecontrol
 * Date: 6/7/19 9:44 PM
 */
package top.littlecontrol;

/*
 * 计算一个字符串在另一个字符串出现的次数
 *
 * */
public class ComputeTest {
    public static void main(String[] args) {
        Compute c1 = new Compute();
        String s1 = "0123";
        String s2 = "0123450120120123";
        System.out.println(c1.myCompute(s2, s1));
        System.out.println(c1.myCompute(s1, s2));
    }
}

class Compute {
    /*
     * 求str1 在 str2 中出现的次数
     * */
    public int myCompute(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return 0;
        }
        int count = 0;
        int tag1 = 0;
        while (str2.length() - tag1 >= str1.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(tag1 + i)) {
                    tag1 += (i + 1);
                    break;
                }
                if (i == str1.length() - 1) {
                    tag1 += (i+1);
                    count++;
                }
            }
        }
        return count;
    }
}