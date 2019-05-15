package top.littlecontrol2;

public class Final_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 obj=new Test3();
		Final_Test ft1=new Final_Test();
		ft1.setNum(obj);
	}
	public void setNum(final Test3 obj) {
		obj=new Test3();
		obj.num=666;
	}
}
class Test1{
	final int num=10;
	public int getNum() {
//		return ++num;
		return num+1;
	}
}
class Test2{
    int num=10;
    public void setNum(final int num){
//        num++;
        this.num=num;
    }
}
class Test3{
	int num=10;
}