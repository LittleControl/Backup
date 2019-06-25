/**
 * Author: littlecontrol
 * Date: 6/24/19 7:19 PM
 */
package littlecontrol;

import java.io.File;
import java.io.IOException;

/*
* File类的判断功能
* isDirectory
* isFile
* exists
* canrRead
* canWrite
* isHidden
*
* File类的创建功能
* createNewFile
* mkdir
* mkdirs
* 注意事项:
*   如果你创建文件或者文件目录美欧写盘符路径,那么,默认咋项目路径下
*
* File类的删除功能
* delete
* 删除注意事项：
*   Java中删除不走回收站
*   要删除一个文件目录,请注意该文件目录内不能包含文件或者文件目录
*
*
* */
public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("/home/littlecontrol/Documents/Code/Java/Nothing");
        System.out.println(file);
        System.out.println(file.isDirectory());//false
        System.out.println(file.isFile());//true
        System.out.println(file.exists());//true
        System.out.println(file.canRead());//true
        System.out.println(file.canWrite());//true
        System.out.println(file.isHidden());//false
        System.out.println("****************************");
        File file1 = new File("Okay.txt");
        try {
            boolean newFile = file1.createNewFile();
            if(newFile){
                System.out.println("Create Successfully!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2 = new File("/Little/Control");
        File file3 = new File(file2,"Hi.txt");
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.exists());
//        System.out.println(file2.isDirectory());
//        boolean mkdirs = file2.mkdirs();
//        if(mkdirs){
//            System.out.println("Create dirs success!");
//        } else {
//            System.out.println("Failed!");
//        }
//        try {
//            boolean newFile = file3.createNewFile();
//            if(newFile){
//                System.out.println("Success");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
