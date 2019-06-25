/**
 * Author: littlecontrol
 * Date: 6/25/19 8:22 PM
 */
package littlecontrol;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new File("new42/Hi.txt");
            fr = new FileReader(file);
            char[] cbuf = new char[5];
            int len = fr.read(cbuf);
            while (len != -1) {
                for(int i = 0;i<len;i++) {
                    System.out.print(cbuf[i]);
                }
                len = fr.read(cbuf);
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
