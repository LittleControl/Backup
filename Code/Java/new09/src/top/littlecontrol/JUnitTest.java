package top.littlecontrol;

import java.util.Scanner;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class JUnitTest {
	@Test
	public void student() {
		Scanner read=new Scanner(System.in);
		System.out.println("Please input the Id");
		int id=read.nextInt();
		System.out.println("Please input the Score");
		int score=read.nextInt();
		Vector v1=new Vector();
		while(id!=-1) {
			v1.addElement(new Student(id,score));
			System.out.println("Please input the Id");
			id=read.nextInt();
			System.out.println("Please input the Score");
			score=read.nextInt();
		}
		read.close();
		Student[] ss=new Student[v1.size()];
		for(int i=0;i<ss.length;i++) {
			ss[i]=(Student)v1.elementAt(i);
		}
		int maxId=ss[0].id;
		int maxScore=ss[0].score;
		for(int i=1;i<ss.length;i++) {
			if(maxScore<ss[i].score) {
				maxId=i;
				maxScore=ss[i].score;
			}
		}
		System.out.println("The max score is : "+maxScore);
		System.out.println("And it's id is : "+maxId);
		for(int i=0;i<ss.length;i++) {
			if(ss[i].score>=90) {
				System.out.println("Id: "+ss[i].id+"\tScore: "+ss[i].score+" Rank: A");
			}else if(ss[i].score>=80) {
				System.out.println("Id: "+ss[i].id+"\tScore: "+ss[i].score+" Rank: B");
			}else if(ss[i].score>=70) {
				System.out.println("Id: "+ss[i].id+"\tScore: "+ss[i].score+" Rank: C");
			}else {
				System.out.println("Id: "+ss[i].id+"\tScore: "+ss[i].score+" Rank: D");
			}
		}
	}
}










