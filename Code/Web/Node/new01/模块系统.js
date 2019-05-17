console.log("我们开始吧");
var test=require("./test");//引入的模块名可以不加类型后缀(.js)
console.log(test.name);
console.log(test.add(70,30));
console.log("结束");
/**
 * Node中的模块有三类
 * 1 具名的系统模块,类似fs、os、http等
 * 2 用户自定义的模块（JS文件），类型test.js
 * 3 第三方模块库里下载的模块(npm)
 * 
 * 
 * **/