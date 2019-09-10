/* 
    Immediately-Invoked Function Expression
    立即调用函数表达式

    作用
        隐藏实现
        不会污染全局作用域
        用于JS模块封装,(模块化编程)

*/


(function (name, age) {
    console.log('The name is ' + name + ' and the age is ' + age)
})('Little', 18)


/* 
    对于JS代码到底结尾加不加分号的问题
    可以加,但是没有必要
    必须加分号的情况
        代码开头或者说行首以小括号(IIFE),中括号(数组)开始的
        然后还有一些不经常用到的,就是以反引号,正则表达式的\,加号+减号-
        总之会影响解析的一般都要加个引号以隔开

*/