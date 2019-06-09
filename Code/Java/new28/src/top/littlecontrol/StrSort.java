/**
 * Author: littlecontrol
 * Date: 6/8/19 10:47 AM
 */
package top.littlecontrol;

/*
 * 对字符串数组中的内容进行自然排序
 *
 * */
public class StrSort {
    public static void main(String[] args) {
        StrSort ss = new StrSort();
        String[] str = new String[]{"EE", "DD", "AA", "CC", "BB"};
        ss.mySort(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    /* 我我我我连冒泡排序都不会写了,(╯﹏╰) */
    public String[] mySort(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                int isExchange = 0;
                char[] arr1 = str[j].toCharArray();
                char[] arr2 = str[j + 1].toCharArray();
                int tail = Math.min(arr1.length, arr2.length);
                for (int k = 0; k < tail; k++) {
                    if (arr1[k] > arr2[k]) {
                        isExchange = 1;
                        break;
                    }
                }
                if (isExchange == 1) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        return str;
    }
}
