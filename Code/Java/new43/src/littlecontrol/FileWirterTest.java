/**
 * Author: littlecontrol
 * Date: 6/27/19 9:40 AM
 */
package littlecontrol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
*   FileWriter
*
*
* */
public class FileWirterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File file = new File("new43/Hi.txt");
            System.out.println(file.getAbsolutePath());
            fw = new FileWriter(file);
            fw.write("LittleControl\n");
            fw.write("www.littlecontrol.top\n");
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
        }
    }
}
