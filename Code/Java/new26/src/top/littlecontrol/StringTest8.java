/**
 * Author: littlecontrol
 * Date: 6/6/19 1:20 PM
 */
package top.littlecontrol;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
* String --->>> byte[]  getBytes()
* byte[] --->>> String  new String()
* 注意,这两个方法都可以跟第二个参数,第二个参数为编码集
* 汉字在utf-8中占用三个字节,在gbk中占用连个字节
* 解码译码过程中使用的编码集不一致,会造成乱码
* */
public class StringTest8 {
    public static void main(String[] args) {
        String s1 = "abc123小控制";
        byte[] b1 = s1.getBytes();
        byte[] b2 = new byte[0];
        try {
            b2 = s1.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(b1);
        for(byte i : b1){
            System.out.println(i);
        }
        System.out.println(b2);
        System.out.println(Arrays.toString(b1));
        String s2 = new String(b1);
        String s3 = null;
        try {
            s3 = new String(b1,"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(s2);
        System.out.println(s3);
    }
}
