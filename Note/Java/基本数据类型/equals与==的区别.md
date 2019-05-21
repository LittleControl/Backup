# equals与==的区别与联系

## equals比较的是堆中的内容，==比较的是栈中的内容

- 对于基本数据类型，在堆中是没有内容的，所以也不存在equals这个方法
- 对于引用数据类型
  - 栈中存储的是堆中的地址，故==比较的是堆中的地址
  - 堆中存储的才是具体内容，所以，可以简单说equals比较的是值

## 下面看一个奇怪的现象

```java
String str1="LittleControl";
String str2="LittleControl";
System.out.println(str1==str2);//true
System.out.println(str1.equals(str2));//true
String str3=new String("LittleControl");
String str4=new String("LittleControl");
System.out.println(str3==str4);//false
System.out.println(str3.equals(str4));//true
```

这是为什么呢？反正目前就这么记住
没有`new`关键字，就不会开辟堆空间

## 2019.5.12更新

- 对于`==`
  - 如果比较的是基本数据类型(除了`boolean`)，真的就是单纯的比较值  
    注意，基本数据类型之间会有一个隐式的自动变量提升
  - 如果比较的是引用数据类型，则比较的就是栈中存储的地址值  
    注意有`new`与没有`new`的区别
- 对于`equals`
  - `equals`只针对引用数据类型
  - `Object`类的`equals`方法默认返回的是`==`的结果，也就是地址值的比较
  - 对于String、Date、File以及包装类，都对`equals`方法进行了重写
  - 自己定义的类如果没有重写`equals`方法，则会使用`Object`的原始方法
  - 重写`equals`的几个原则
    - 对称性
    - 自反性
    - 传递性
    - 一致性