/**
 * Author: littlecontrol
 * Date: 6/24/19 6:39 PM
 */
package littlecontrol;

import java.io.File;

/*
* 我终于看到IO了,哈哈哈哈哈
* File类的获取功能
* getAbsolutePath
* getPath
* getName
* getParent
* length
* lastModified
*
* list          获取指定目录下的所有文件或者文件目录的名称数组             相对路径
* listFiles     获取指定目录下的所有文件或者或者文件目录的Filename数组     绝对路径
*
* File的重命名功能
* public boolean renameTo(File dest)    把文件重命名为指定的文件路径
*
* */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        File file1 = new File("/home/littlecontrol/Documents/Code/Java");
        File file2 = new File("/home/littlecontrol","Docuemnts/Code/Java/Hi.txt");
        File file3 = new File(file1,"Nothing.txt");
        System.out.println(file);
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println("!@#$%^&*()_+");
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getName());
        System.out.println(file3.getParent());
        System.out.println(file3.length());
        System.out.println(file3.lastModified());
        for(Object each : file1.listFiles()){
            System.out.println(each);
        }
        File file4 = new File("LittleControl.top");
        System.out.println(file4.getParent());
        file3.renameTo(file4);
    }
}
