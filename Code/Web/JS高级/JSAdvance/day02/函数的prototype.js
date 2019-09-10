// let fn = () => {
//     console.log('fn()...')
// }
// fn()
// fn.prototype.log = () => {
//     console.log('log()...')
// }
// let fn2 = new fn()
// fn2.log()

function fn3() {
    console.log('fn3()...')
}
fn3.prototype.log = () => {
    console.log('fn3log()...')
}
let fn4 = new fn3()
fn4.log()
/* 简单来说,函数的prototype就是一个空对象,但是里面存储了许多方法
    可以通过prototype属性往这个空对象中添加方法或者属性
    进而是她的实例对象们也可以使用这个方法,实现类似继承的效果
*/
/* 
    经检测,也可以往系统内置对象函数的prototype添加方法
*/
Date.prototype.log = () => {
    console.log('Date Log ...')
}
let date = new Date().log()

/* 
    函数的prototype里有一个constructor对象,该对象指向其函数本身
    即 fn3.prototype.constructor === fn3
    函数或者对象存在一个显式原型和一个隐式原型
    显式原型 prototype
    隐式原型 __proto__
    函数或者对象的隐式原型就是其构造函数的显式原型
    一般而言,一个实例对象是没有显式原型的,只有隐式原型
    在ES6之前,程序员只能操控显式原型,而不能操控隐式原型
*/
console.log(fn3.prototype.constructor === fn3)//true