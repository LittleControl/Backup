/**
 * Author: littlecontrol
 * Date: 6/27/19 9:10 PM
 */
package littlecontrol;

import java.io.*;

/*
 * 实现图片的加密解密操作
 *
 * */
public class ImgScreat {
    /* 图片的加密操作 */
//    public static void main(String[] args) throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("new43/20.png"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("new43/20_lock.png"));
//        byte[] bytes = new byte[10];
//        int read = bis.read(bytes);
//        while (read != -1) {
//            for (int i = 0; i < read; i++) {
//                bytes[i] ^= 5;
//            }
//            bos.write(bytes, 0, read);
//            read = bis.read(bytes);
//        }
//        bos.close();
//        bis.close();
//    }
    /* 图片解密操作 */
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("new43/20_lock.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("new43/20_unlock.png"));
        byte[] bytes = new byte[10];
        int read = bis.read(bytes);
        while (read != -1) {
            for (int i = 0; i < read; i++) {
                bytes[i] ^= 5;
            }
            bos.write(bytes, 0, read);
            read = bis.read(bytes);
        }
        bos.close();
        bis.close();
    }
}
























