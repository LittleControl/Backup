/**
 * Author: littlecontrol
 * Date: 6/28/19 9:25 PM
 */
package littlecontrol;

import java.io.*;

/*
* 利用转换流把utf8文件转化为gbk文件
*
* */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("new44/noname.md");
        FileOutputStream fos = new FileOutputStream("new44/noname_gbk.md");
        InputStreamReader ist = new InputStreamReader(fis,"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        char[] chars = new char[10];
        int read = ist.read(chars);
        while(read != -1){
            osw.write(chars,0,read);
            read = ist.read(chars);
        }
        osw.close();
        ist.close();
    }
}
