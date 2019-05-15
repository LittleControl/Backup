# `final`关键字的笔记

`final` 最终的，最后的
`final`可以修饰的内容：

- 类---->不可以被继承（`String`类、`System`类、`StringBuffer`类等）
- 方法--->不可以被重写（`Object`的`getClass`方法等）
- 变量--->不可以被修改（常量）
  - 属性--->可以考虑赋值的位置：显式初始化、代码块初始化、构造器初始化
  - 形参--->参数在方法中不可以被修改

native关键字表示调用底层的`C`或者`C++`代码

`final`修饰变量的代码示例

```Java
public class Final {
    final int age=18;//永远保持18岁
    final String name;
    {
        name="Heart";//初心用不变
    }
    final String Do;
    Final(){
        Do="Nothing to do but love";//除了爱别无所有
    }
}
```

有关final的两个小练习

```Java
class Test1{
    final int num=10;
    public int getNum() {
//        return ++num;//编译不通过，num为final修饰，不可修改
        return num+1;
    }
}
class Test2{
    int num=10;
    public void setNum(final int num){
        // num++;//编译不通过，num形参的值不可修改
        this.num=num;
    }
}
class Test3{
    int num=10;
}
public class Final_Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test3 obj=new Test3();
        Final_Test ft1=new Final_Test();
        ft1.setNum(obj);
    }
    public void setNum(final Test3 obj) {
        obj=new Test3();//不可以这么做，因为obj是一个final修饰的变量，不可以被更改
        obj.num=666;//可以这么做，因为obj的num并没有被final修饰
    }
}
```
