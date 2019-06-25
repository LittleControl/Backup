/**
 * Author: littlecontrol
 * Date: 6/25/19 7:38 PM
 */
package littlecontrol;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 常见流的分类
 *
 * 流的流向  输入流/输出流
 * 处理单位  字符流/字节流
 * 流的角色  节点流/处理流
 *
 *
 * */
public class IOTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new File("new42/Hi.txt");
            fr = new FileReader(file);
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr == null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
