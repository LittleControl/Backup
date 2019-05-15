package top.littlecontrol2;

public class Root {
	static{
        System.out.println("我是root的static代码块");
    }
    {
        System.out.println("我是root的非static代码块");
    }
    public Root(){
        System.out.println("我是root的无参数构造方法");
    }
}
