/**
 * Author: littlecontrol
 * Date: 6/24/19 8:10 PM
 */
package littlecontrol;

import java.io.File;
import java.io.IOException;

/*
 * 1.利用Filename构造器,new一个文件目录file
 *   1) 在其中创建多个文件和目录
 *   2) 编写方法,实现删除file中指定文件的操作
 * 2.判断指定目录下是否有后缀名为.jpg的文件,如果有,就输出该文件名称
 * 3.遍历指定目录所有文件名称,包括子文件目录中的文件
 * 拓展一:并计算指定目录占用空间的大小
 * 拓展二:删除指定文件目录及其下的所有文件
 *
 *
 *
 * */
public class FileTest3 {
    public static void main(String[] args) {
        File dir = FileExer.getDir();
        System.out.println(dir.exists());
        System.out.println(dir.getAbsolutePath());
        String path = "little.txt";
        String path2 = "control";
        FileExer.createpPath(path);
        FileExer.createpPath(path2);
    }
}

class FileExer {
    /* 写一个单例模式 */
    private FileExer(){

    }

    private static File file = new File("/home/littlecontrol/Test/file");

    public static File getDir() {
        file.mkdir();
        return file;
    }

    public static void createpPath(String path) {
        File newDir = new File(file, path);
        if (newDir.isDirectory()) {
            if (newDir.exists()) {
                System.out.println("创建成功!");
            } else {
                boolean mkdir = newDir.mkdir();
                if (mkdir) {
                    System.out.println("创建成功!");
                } else {
                    System.out.println("创建失败!");
                }
            }
        } else {
            try {
                boolean newFile = newDir.createNewFile();
                if (newFile) {
                    System.out.println("创建成功!");
                } else {
                    System.out.println("创建失败!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
