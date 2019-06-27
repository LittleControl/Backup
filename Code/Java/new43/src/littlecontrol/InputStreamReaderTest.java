/**
 * Author: littlecontrol
 * Date: 6/27/19 9:22 PM
 */
package littlecontrol;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 转换流
 *   字节-->>字符 解码(看不懂到看得懂)
 *   字符-->>字节 编码(看得懂到看不懂)
 * */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("new43/hasname.md");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        char[] chars = new char[10];
        int read = isr.read();
        while (read != -1) {
            for (Object each : chars) {
                System.out.print(each);
            }
            read = isr.read(chars);
        }
        isr.close();
        fis.close();
    }
}
