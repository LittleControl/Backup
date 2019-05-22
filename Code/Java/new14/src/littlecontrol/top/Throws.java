package littlecontrol.top;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) {
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nothing To Do But Love !");
		}
	}
	public static void method2() throws IOException {
		method1();
		System.out.println("Rain Sorrow Control");
	}
	public static void method1() throws FileNotFoundException,IOException {
		File f1=new File("hello.txt");
		FileInputStream fis=new FileInputStream(f1);
		int text=fis.read();
		while(text!=-1) {
			System.out.print((char)text);
			text=fis.read();
		}
		System.out.println("LittleControl");
	}
}