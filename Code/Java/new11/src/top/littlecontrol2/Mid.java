package top.littlecontrol2;

public class Mid extends Root {
	static{
        System.out.println("我是mid的static代码块");
    }
    {
        System.out.println("我是mid的非static代码块");
    }
    public Mid(){
        System.out.println("我是mid的无参数构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("我是mid的带参数的构造器，参数值： "+msg);
    }
}
