# try-catch-finally解决异常

## 基本结构

```Java
try{
    int[] arr=new int[10];
    System.out.println(arr[10]);
}catch(ArrayIndexOutOfBoundsException e){
    e.printStackTrace()
}finally{
    System.out.println("我一定会被执行");
}
```

## 关于`finally`的简单说明

### 基本说明

- `finally`为非必需结构
- `finally`中的代码一定会被执行,即使前面有`return`等语句
- `finally`中的代码常用于I/O流,socket等资源的回收机制中

### 代码示例

```Java
public int test1(){
    try{
        int[] arr=new int[10];
        System.out.println(arr[10]);
        return 1;
    }catch(ArrayIndexOutOfBoundsException e){
        // e.printStackTrace()
        return 2;
    }finally{
        System.out.println("我一定会被执行");
    }
}//代码最后输出结果为:2,"我一定会被执行"
public int test1(){
    try{
        int[] arr=new int[10];
        System.out.println(arr[10]);
        return 1;
    }catch(ArrayIndexOutOfBoundsException e){
        // e.printStackTrace()
        return 2;
    }finally{
        System.out.println("我一定会被执行");
        return 3;
    }
}//代码最后输出结果为:"我一定会被执行",3
```

## 开发中的问题

一般在开发中只处理编译时异常的问题,而对运行时异常不做处理  
或者说,try-catch-finally结构一般只用在编译时异常中
且可能只是吧异常出现的时机从编译时出现延迟到运行时出现