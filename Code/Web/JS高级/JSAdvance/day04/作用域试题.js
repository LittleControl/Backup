/* The First */
var a = 10
function fn1() {
    console.log(a)
}
function fn2() {
    var a = 20
    fn1()
}
fn2()
/* 
    因为对于作用域而言,是在代码写的时候确定的,与函数的调用位置无关
*/

/* The Second */
var fn3 = function () {
    console.log(fn1)
}
fn3()
var obj = {
    fn4: function () {
        console.log(fn4)
    }
}
// obj.fn4()//ReferenceError : fn4 is not defined
/*
    对于obj中的那个fn4而言,fn4的函数体中并不存在fn4这个变量,便就会向上寻找,上面就是全局作用域了,而全局作用域中不存在fn4这个变量
    按照我的理解,对于obj而言,整个全局作用域中,obj里的属性是对外封闭的,只能通过obj来访问.
    对于fn4函数作用域而言,本来也是在obj的属性空间中,但是由于作用域链的访问机制,
    fn4函数作用域内没有fn4这个变量,便直接跳到了全局作用域,而全局作用域不能直接访问fn4这个变量,便直接返回not defined了
    或者也可以简单理解为,作用域的访问机制,直接跳过了obj的属性空间,可以出去,但是再也回不来了
*/
var obj2 = {
    fn5 : function () {
        console.log(this.fn5)
    }
}
obj2.fn5()//function
obj2.fn5.call(globalThis)//undefined
/* function Te() {
    console.log(this)
}
Te() */

