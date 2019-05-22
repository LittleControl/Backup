package littlecontrol.top;
/*
 * 可以在run congfigurations里配置命令行参数
 */
public class EcmDef {
	public static void main(String[] args) {
		try {
			int i=Integer.parseInt(args[0]);
			int j=Integer.parseInt(args[1]);
			int res=ecm(i,j);
			System.out.println(res);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不正确!");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
		}catch(ArithmeticException e) {
			System.out.println("除数不能为0");
		}
	}
	public static int ecm(int i,int j) throws MyException {
		if(i*j<0) {
			throw new MyException("分子或分母为负数了呀!");
		}
		return i/j;
	}
}
