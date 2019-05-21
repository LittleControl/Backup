# throws关键字的使用

## 基本用法

### 代码示例

```Java
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Nothing To Do But Love !");
        }
    }
    public static void method2() throws IOException {
        method1();
        System.out.println("Rain Sorrow Control");
    }
    public static void method1() throws FileNotFoundException,IOException {
        File f1=new File("hello.txt");
        FileInputStream fis=new FileInputStream(f1);
        int text=fis.read();
        while(text!=-1) {
            System.out.print((char)text);
            text=fis.read();
        }
        System.out.println("LittleControl");
    }
}
```

```shell
//代码执行结果
java.io.FileNotFoundException: hello.txt (No such file or directory)
    at java.base/java.io.FileInputStream.open0(Native Method)
    at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
    at littlecontrol.top.Throws.method1(Throws.java:25)
    at littlecontrol.top.Throws.method2(Throws.java:20)
    at littlecontrol.top.Throws.main(Throws.java:12)
Nothing To Do But Love !
```

### 代码说明

1. `method1`编译时,可能会出现`FileNotFoundException`的异常,但是它没有处理,而是选择`throws`
   也就是说自己不解决这个异常,而把这个异常交给他的上一级`method2`处理,而`method2`也选择不处理,
   交给他的上一级.`main`方法处理,`main`方法不能再往上抛出了,因为他的上一级是`JVM`,所以`main`
   方法只能`try-catch-finally`结构处理异常了
2. `throws`方法处理异常就是交个他的上级处理,而自己不处理,值得注意的是,与`try-catch-finally`结构  
   不同的是,出现异常的后面的代码,不能执行!