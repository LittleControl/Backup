# Java8中关于接口增加的新特性

- Java8中接口中可以定义静态方法和默认方法

```Java
interface Infa1{
    static void sayHello() {//静态方法
        System.out.println("Hello,Java8!");
    }
    default void sayBye() {//默认方法
        System.out.println("Goodbye,Yesterday!");
    }
}
```

- Java8接口中定义的静态方法只能有接口本身调用
- Java8接口中定义的默认方法可以被实现类调用，且可以被实现类重写

```Java
public class Interface_New {
    public static void main(String[] args) {
        Infa1.sayHello();
        Say s1=new Say();
        s1.sayBye();
    }
}
```

- 如果一个子类（实现类）的父类与实现的接口存在同名方法，且此方法  
  没有被子类（实现类）重写，则子类（实现类）调用此方法时，以父类  
  的方法为主----类优先原则

```Java
class Say0{
    public void sayHello() {
        System.out.println("Say0");
    }
}
class Say1 extends Say0 implements Infa1{

}
Say1 s11=new Say1();
s11.sayHello();//say0
```

- 如果一个实现类实现的多个接口中存在同名的默认方法,且实习类没有  
  对该方法进行重写,则会报错---接口冲突
- 在实现类中调用实现接口的默认方法可以这么调用

```Java
class Im1 extends Say2 implements Infa3,Infa2{
    public void Say() {
        super.Say();//调用父类Say2的方法
        Infa2.super.Say();//调用接口Infa2的默认方法
        Infa3.super.Say();//调用接口Infa3的默认方法
    }
}
```