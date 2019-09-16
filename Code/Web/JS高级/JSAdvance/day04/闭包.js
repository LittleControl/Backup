/* 
    闭包的定义
      嵌套函数
      嵌套函数引用了外层变量(函数)的值(变量)
    闭包的作用
      保存局部变量
      使得外部可以访问到函数内部的值
      自定义JS模块
*/
function fn1 () {
    var a = 2
    function fn2 () {
        a++
        console.log(a)
    }
    return fn2
}
/*  这里fn2就是fn1的闭包 */
var fn3 = fn1()
fn3()//3
fn3()//4
/* 注意这里总共只有一个闭包,因为fn1就被调用了一次,
    简单来说,外部函数被调用了几次就是会有几次闭包
*/
fn1()()//3
fn1()()//3
/* 必须要被闭包的函数的返回值赋值个一个变量保存,否则闭包不会发挥作用 */

/* 
    闭包的声明周期
        一般而言,在函数定义的时候闭包就已经存在了
        当一个闭包的不再被任何变量引用的时候,便可以称作死亡
*/
//想上文的fn3就是一个对于闭包的引用当执行一下代码的时候,fn2对于fn1的闭包便已经死亡
fn3 = null

/* 
    闭包的不好的地方
        使用闭包容易造成内存泄露,进而容易引发内存溢出
    解决方法
        及时释放内存
        尽量不适用闭包

    容易造成内存泄露的情况
     - 意外的全局变量
     - 没有及时清理的计时器或者回调函数
     - 闭包
*/
