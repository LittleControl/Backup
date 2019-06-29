/**
 * Author: littlecontrol
 * Date: 6/29/19 9:20 AM
 */
package littlecontrol;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
* 数据流
*
* */
public class DateStreamTest {
    /* 写数据 */
    /*public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("new45/Data.txt");
        DataOutputStream dos = new DataOutputStream(fw);
        dos.writeUTF("李小控(LittleControl)的博客\n");
        dos.flush();
        dos.writeUTF("www.littlecontrol.top");
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();
        dos.writeDouble(23.333);
        dos.close();
    }*/
    /* 读数据 */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("new45/Data.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        dis.close();
    }
}
