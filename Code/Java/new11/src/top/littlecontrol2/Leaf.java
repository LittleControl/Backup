package top.littlecontrol2;

public class Leaf extends Mid {
	static{
        System.out.println("我是leaf的static代码块");
    }
    {
        System.out.println("我是leaf的非static代码块");
    }
    public Leaf(){
        super("LittleControl");
        System.out.println("我是leaf的空参构造器");
    }
}
