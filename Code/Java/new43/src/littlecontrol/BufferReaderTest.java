/**
 * Author: littlecontrol
 * Date: 6/27/19 12:07 PM
 */
package littlecontrol;

import java.io.*;

/*
 * 使用缓冲流处理文本文件
 *
 * 多了一个方法,readLine()
 * 但是readLine()方法不会读取换行符,所以需要自己手动加"\n"或者调用newLine()方法
 *
 *
 * */
public class BufferReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("new43/noname.md")));
            bw = new BufferedWriter(new FileWriter(new File("new43/hasname.md")));
            String s = br.readLine();
            while (s != null) {
                /* 解决不能读取换行符问题 */
                //方法一
//                bw.write(s + "\n");
                //方法二
                bw.write(s);
                bw.newLine();
                s = br.readLine();

            }
            System.out.println("Copy Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
