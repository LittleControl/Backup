# Node复习

## Node中的模块化

- `exports`与`module.exports`的区别与联系
  - `exports`是`module.exports`的一个引用,可以简单这么认为,在每一个模块的结尾都会有一个`return module.exports`语句,因为返回的是`module.exports`,所以如果出现了想`exports=obj`一类的语句,会让`exports`失去对`module.exports`的引用(面向对象基础),故二者的主要区别是如果想要只返回一个值,则必须使用`module.exports=obj`一类的语句,其他的则两者都可以.简单就是说,如果正常使用(返回一个exports对象)两者都可以,如果只想返回一个值(函数,基本数据类型等)必须使用`module.exports`语句
- 模块的三种分类
  - `Node`的自带模块,类似`fs`,`path`等
  - 第三方模块,即通过`npm`安装的模块,像`express`,`mongoose`等
  - 用户自定义模块
  - **注意**
    - 使用`Node`或者第三方模块时导入时直接用模块名字即可,类似这样`var fs = require('fs')`
    - 而使用用户自定义模块时,必须加路径,如果是相对路径,则`./`不可省略,类似这样`var hello = require('./js/hello')`,`var hi = require('/home/littlecontrol/js/hi')`,但是文件的后缀名即`.js`可以省略
- npm的使用及常用命令
  - 基本安装 `npm install mongoose`
  - 全局安装 `npm install mongoose -g`
  - 基本知识
    - 引用第三方模块时,会现在当前目录`node_modules`文件夹下找到相应的模块文件夹
    - 然后在该文件下找到`package.json`文件
    - 然后在`package.json`文件中找到`main`对应的内容
    - 加载`main`对应的文件
    - 如果`package.json`文件丢失或者`main`属性丢失会默认加载对应模块下的`index.js`文件中的内容
    - 如果当前目录没有`node_modules`文件夹则会逐级向上寻找,重复以上过程
    - 直到根目录下没有相应的文件,则报错
- `package.json`与`package-lock.json`的作用
  - `package.json`用于记录当前目录安装的模块及版本,但不会记录其依赖的包,当执行`npm install`命令时,会自动下载记录的模块的最新版本
  - `package-lock.json`可以理解为是`package.json`的升级版本,里面记录了所有的工程需要的模块及其依赖模块以及他们的当前版本对应的下载地址,进而执行`npm install`命令时会直接下载,不用搜索模块的依赖关系,比`package.json`更快,而且下载的都是记录的版本,不会自动升级版本,防止版本升级带来的不兼容问题
- 关于回调函数的问题(怎么获得一个异步操作的执行结果)
  - 在`Node`中,要想获得一个异步操作的执行结果,只能通过回调函数(callback),别无他法
  - 在异步函数中,似乎不可以调用`redirect`函数(血的教训),这个以后应该会看到的

## 关于后台静态资源的访问

- 前端的一切要求都是请求
  - 在前端想要后端的文件数据等只能通过请求来获取
  - 一般的请求都是`get`(直接在地址栏输入网址也是get),表单可以用`post`
- get和post方法的区别与联系,以及各自的使用场景
- 如何在前端页面中访问到其所需要的资源(css文件,js文件等)
  - 在后端返回的html文件中,含有堆css文件等的引用路径,而前端会把这个路径当成url向后端发送请求,即如果前端页面要拿到页面所引用的内容,必须在后端处理这些资源引用路径的请求(一般都是get)
- 如何搭建一个本地服务器
  - 直接上代码吧(这里用Express框架示例)

    ```JavaScript
    var express = require('express')
    var app = express()
    app.get('/',function(req,res){
        res.send('Hello,Express !')
    })
    app.listen(3000,function(){
        console.log('Server is running at port 3000')
    })

    ```

## 补充

### 关于`path`在`Node`中的应用问题

#### `Node`中的固有属性（类似于动态的全局变量）

| 属性名     | 作用                       |
| ---------- | -------------------------- |
| __dirname  | 当前文件所在目录的绝对路径 |
| __filename | 当前文件的绝对路径         |
![Node中的固有属性](https://s2.ax1x.com/2019/06/03/VYSxRs.png "__filename和__dirname")

#### 关于`path`模块中的常用API

|方法名|作用|
|---|---|
|parse|将一个路径解析|
|join|将两个路径拼接为一个路径(常用于动态获取绝对路径)|

![path常用API示例](https://s2.ax1x.com/2019/06/03/VYpHp9.png "path中的常用的两个模块")
值得注意的是,对于`Node`文件系统中`./`表示的位置不是当前文件所在目录的相对位置,而是执行`Node`命令所在目录的相对位置,故一般相对路径在`Node`中是不可靠的,常常利用`path`模块将相对路径转化为动态的绝对路径
![Node中的相对路径问题](https://s2.ax1x.com/2019/06/03/VY9Qcn.png "Node中相对路径问题")
更改之后的代码
![更改之后的代码](https://s2.ax1x.com/2019/06/03/VY96AO.png "利用path将相对路径转化为绝对路径")
