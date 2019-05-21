# `exports`与`module.exports`的本质区别

`module.exports`是Node模块的一个内置对象
`exports`是`module.exports`的一个引用
而模块的最后都会默认返回`module.exports`
用代码简单说明一下
这个是`main.js`文件

```JavaScript
var exports=module.exports//这个是node的模块系统自动为我们加的
代码块
return module.exports
关于面向对象的知识
因为最后返回的是module.exports,故如果对exports这样赋值
exports=function add(x,y){
    return x + y
}
这样会失去module.exports的引用
故要想模块直接返回一个函数或者字符串啥的,必须得用`module.exports`进行赋值
```