# instanceof相关知识点

- instanceof常用于类之间的的向下转型是否可行的判断条件
- 只有存在父类与子类关系的类之间才能转型

代码实例

```java
//我们这里定义了一个Person父类，Male和Female是Person的两个子类
class Test{
    public static void main(String[] args) {
        // 编译可以通过，运行不通过
        Person p1=new Male();
        Female f1=(Female)p1;
        f1.shopping();//java.lang.ClassCastException:
        Object o1=new Person();
        Male m1=(Male)o1;
        m1.Fly();//java.lang.ClassCastException:
        //编译可以通过，运行也可以通过
        Object o2=new Female();
        Person p2=(Person)o2;
        p2.say();
        //编译和运行都不能通过
        Male m2=new Male();
        Female f2=(Female)m2;
    }
}
```

总的来说，子类可以转父类，父类不可以转子类