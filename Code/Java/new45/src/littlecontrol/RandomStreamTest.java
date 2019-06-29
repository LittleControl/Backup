/**
 * Author: littlecontrol
 * Date: 6/29/19 12:07 PM
 */
package littlecontrol;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
* 随机读取文件流
*
* */
public class RandomStreamTest {
    /* 读取文件 */
    /*public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("new45/Static.md"),"r");
        String s = raf.readLine();
        while (s != null){
            System.out.println(s);
            s = raf.readLine();
        }
        raf.close();
    }*/
    /* 写文件 */
    /*public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("new45/random.txt","rw");
        raf.writeUTF("李小控(LittleControl)的博客");
        raf.writeChars("\n");
        raf.writeUTF("www.littlecontrol.top");
        raf.close();
    }*/
    /* 写文件2 */
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("new45/random.txt","rw");
        raf.writeChars("雨怅控");
        raf.close();
    }
}
