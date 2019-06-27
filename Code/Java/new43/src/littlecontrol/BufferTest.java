/**
 * Author: littlecontrol
 * Date: 6/27/19 11:38 AM
 */
package littlecontrol;

import java.io.*;

/*
 * 使用缓冲流提高流的读取和写入速度
 *
 * 在缓冲流中的关闭顺序,先关闭外层的流(即缓冲流),在再关闭内层的流(及节点流)
 * 由于缓冲流的为我们做了包装,所以我们在关闭缓冲流的时候,会自动关闭节点流
 *
 *
 * 对于输出机制中,会存在一个flush方法,及刷新缓冲区,缓冲区大小为1024*8
 * 因为缓冲区满时会自动调用此方法,故不必手动调用
 *
 * */
public class BufferTest {
    public static void main(String[] args) {
        String srcPath = "/home/littlecontrol/Documents/Code/Java/new43/20.png";
        String desPath = "/home/littlecontrol/Documents/Code/Java/new43/20_copy1.png";
        BufferCopy.copy(srcPath,desPath);
    }
}

class BufferCopy {
    private BufferCopy() {
    }

    private static int count = 0;

    public static void copy(String srcpath, String despath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            long start = System.currentTimeMillis();
            File srcFile = new File(srcpath);
            File desFile = new File(despath);
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(desFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[1024];
            int read = bis.read(bytes);
            while (read != -1) {
                bos.write(bytes, 0, read);
                read = bis.read(bytes);
            }
            long end = System.currentTimeMillis();
            System.out.println("Copy Successfully! Waste Time: " + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
