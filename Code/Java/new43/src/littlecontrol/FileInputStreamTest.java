/**
 * Author: littlecontrol
 * Date: 6/27/19 10:55 AM
 */
package littlecontrol;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用字节流处理非文本文件
 *
 *
 * */
public class FileInputStreamTest {
    public static void main(String[] args) {
        File file = new File("new43/20.png");
        CopyImg.copyImg(file);
    }
}

class CopyImg {
    private CopyImg() {

    }

    private static int count = 0;

    public static void copyImg(File file) {
        if (file.isDirectory()) {
            System.out.println("该路径是一个目录,不是一个文件");
        } else {
            long start = System.currentTimeMillis();
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                String name = "Copy_" + count + file.getName();
                File desFile = new File(file.getParent(), name);
                fis = new FileInputStream(file);
                fos = new FileOutputStream(desFile);
                byte[] bytes = new byte[1024];
                int read = fis.read(bytes);
                while (read != -1) {
                    fos.write(bytes, 0, read);
                    read = fis.read(bytes);
                }
                long end = System.currentTimeMillis();
                System.out.println("Copy Successfully!,所用时间为: " + (end - start));

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fos != null)
                        fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (fis != null)
                        fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}






















