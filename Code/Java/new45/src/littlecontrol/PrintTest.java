/**
 * Author: littlecontrol
 * Date: 6/29/19 8:55 AM
 */
package littlecontrol;

import java.io.*;

/*
 * 打印流
 *
 *
 * */
public class PrintTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        PrintStream ps = new PrintStream("new45/PrintStream.txt");
        BufferedReader br = new BufferedReader(isr);
        while (true){
            System.out.println("Please input");
            String s = br.readLine();
            ps.println(s);
            if("exit".equalsIgnoreCase(s)){
                System.out.println("Exit");
                break;
            }
        }
        System.out.println("Nothing");
    }
//    public static void main(String[] args) {
//        PrintWriter pw = null;
//        try {
//            FileWriter fos = new FileWriter("new45/print.txt");
//            pw = new PrintWriter(fos);
//            pw.write("李小控(LittleControl)的博客\n");
//            pw.write("www.littlecontrol.top");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (pw != null)
//                pw.close();
//        }
//    }
}

