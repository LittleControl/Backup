package littlecontrol.top;

public class DiyException {
	public static void main(String[] args) {
		try {
			int[] arr=new int[10];
			int i=10;
			if(i<10) {
				System.out.println(arr[i]);
			}else {
				throw new MyException("数组下表越界");
			}
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
class MyException extends Exception{
	static final long serialVersionUID = -3387516993124229966L;
	public MyException() {
	
	}
	public MyException(String msg) {
		super(msg);
	}
}
