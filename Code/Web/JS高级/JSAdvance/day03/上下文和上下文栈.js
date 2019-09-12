console.log('global start :' + i)
var i = 1
foo(i)
function foo(i) {
    if (i === 4) {
        return
    }
    console.log('foo begin :' + i)
    foo(i + 1)
    console.log('foo end :' + i)
}
console.log('global end :' + i)

/* 
    undefined
    foo 1
    foo 2
    foo 3
    foo 3
    foo 2 
    foo 1
    1
*/

var a = 2
function fn() {
    console.log(a)
}
fn()

let b = 2
function fn2() {
    b = 3
    console.log(b)
}
console.log(b)
fn2()
/* 
    执行上下文对象总是先把声明挂载到对象上.全局是window,函数是一个虚拟的对象,也就是变量提升和函数提升的本质

    对于全局执行上下文对象和函数执行上下文对象
    函数执行上下文对象是可以访问到全局变量并且可以修改

    对于执行上下文栈,全局执行上下文对象总是在底部的

*/
