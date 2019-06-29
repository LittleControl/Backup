/**
 * Author: littlecontrol
 * Date: 6/29/19 8:15 AM
 */
package littlecontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 标准输入输出流
 * System.in
 * System.out
 *
 *利用System.in将从控制台读入的一行数据全部转化为大写
 *
 * */
public class SystemTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true) {
                System.out.println("Please input ");
                String s = br.readLine();
                if ("exit".equalsIgnoreCase(s) || "e".equalsIgnoreCase(s)) {
                    System.out.println("Exit Successfully !");
                    break;
                }
                System.out.println(s.toUpperCase());
            }
            System.out.println("Nothing");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}











