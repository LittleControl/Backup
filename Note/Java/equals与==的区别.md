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