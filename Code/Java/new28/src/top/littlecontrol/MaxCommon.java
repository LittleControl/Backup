/**
 * Author: littlecontrol
 * Date: 6/8/19 10:46 AM
 */
package top.littlecontrol;

/*
 * 求两个字符串中的最大公共子串
 *
 * */
public class MaxCommon {
    public static void main(String[] args) {
        MaxCommon mc1 = new MaxCommon();
        String s1 = "Liittle";
        String s2 = "1Little";
        String common = mc1.common(s1, s2);
        System.out.println(common);
    }

    public String common(String s1, String s2) {
        /* 使s1为较短的串 */
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        String[] arr = new String[s1.length() * s2.length()];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                String str = "";
                if (s1.charAt(i) == s2.charAt(j)) {
                    for (int k = j, l = i; l < s1.length() && k < s2.length(); k++, l++) {
                        if (s1.charAt(l) == s2.charAt(k)) {
                            str += s1.charAt(l);
                        }
                        if (k == s2.length() - 1 || l == s1.length() - 1 || s1.charAt(l) != s2.charAt(k)) {
                            arr[count] = str;
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        int max = 0;
        for (int m = 0; m < count - 1; m++) {
            if (arr[max].length() < Math.max(arr[m].length(), arr[m + 1].length())) {
                max = arr[m].length() > arr[m + 1].length() ? m : m + 1;
            }
        }
        return arr[max];
    }
}
