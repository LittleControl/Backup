/**
 * Author: littlecontrol
 * Date: 6/27/19 10:03 AM
 */
package littlecontrol;

import java.io.*;

/*
* 简单的文件的度读和写
*
* */
public class FileCopyTest {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file = new File("new43/Hi.txt");
            File file1 = new File("new43/Hi_Copy.txt");
            fr = new FileReader(file);
            fw = new FileWriter(file1);
            char[] cbuf = new char[5];
            int data;
            while ((data = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
