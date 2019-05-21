# NoSuchElementException解决方法

最近刚学Java，昨天遇到一个异常`NoSuchElementException`，结果看了半天也没有看出来
不过经过基友的帮忙，终于解决了，今天记录一下这个踩过的坑
具体的异常如下：

```java
java.util.NoSuchElementException
    at java.base/java.util.Scanner.throwFor(Scanner.java:937)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at com.littlecontrol.top.View.main(View.java:19)
```

相关的代码:

```java
package com.littlecontrol.top;

import java.util.Scanner;

public class View {
    public static void main(String[] args){
        int choice=0;
        Operate o1=new Operate();
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner read=new Scanner(System.in);
        while(choice!=5) {
            System.out.println("\t\t欢迎光临银行流水管理系统");
            System.out.println("\t\t请选择您要执行的操作");
            System.out.println("\t\t    1.增加客户");
            System.out.println("\t\t    2.删除客户");
            System.out.println("\t\t    3.客户列表");
            System.out.println("\t\t    4.修改客户");
            System.out.println("\t\t    5.退出");
            choice=read.nextInt();
            if(choice==1) {
                o1.add();
            }
            if(choice==2) {
                o1.delCus();
            }
            if(choice==3) {
                o1.showCus();
            }

            if(choice==4) {
                o1.modeify();
            }
            if(choice==5) {
                read.close();
            }
        }
    }
}

```

我用的是`Scanner`类读入数据，异常提示的信息是没有`Scanner`的相关方法
经查阅资料，原来Java里输入输出都是同一个流，你只要关闭了一个流，其他的该流的
实例化对象也就没有效果了，而我恰恰在`add`方法里也`new`了一个`Scanner`类
并且进行了`read.close()`操作，导致循环里的`read`流被关闭，所以就会抛出该异常
因为`I\O`还没有学呢，所以对于Java中流的概念还很模糊，暂时就这么记录一下，
以后学到`I\O`的时候再回来看，或许能够会理解的更深一点