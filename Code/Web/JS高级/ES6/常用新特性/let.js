/* 
    let关键字
        不会提前解析和声明
        不可以重复定义
        有自己的块作用域

    常用于循环遍历赋值

*/
// console.log(name)
// var name = 'Little'
let name = 'Little'
// var btns = document.getElementsByTagName('button')
/* for (var i = 0; i < btns.length; i++) {
    (function (i) {
        btns[i].onclick = function () {
            alert(i)
        }
    })(i)
} */
// for (let i = 0; i < btns.length; i++) {
//     btns[i].onclick = function(){
//         alert(i)
//     }
// }
/*  这里let有自己的作用域,每次循环的时候实际上都是重新定义一个变量
    而如果是用var定义的时候,每次都是给同一个i重新赋值
    
    至于既然let是每次都是重新定义一个变量,那为什么每次循环i的值都不一样呢?
        因为这是JS的内部引擎循环的一个机制,每次循环都会记录上一次循环i的那个值,
        所以每次let定义的时候优先给i赋值给上次循环i的值

    这里其实for循环也有一个需要注意的地方,for循环的循环条件是一个父作用域,而循环体又是一个子作用域,与父作用域无关
*/

/* 关于暂时性死区(TDZ)几个隐蔽的容易忽略的地方 */
function fn(x = y, y = 2) {
    console.log(x,y)
}
// fn()//报错
/* 因为fn函数参数的x的默认值y是未经申明就引用的 */
var x = x//没有报错
let y = y//这里也会报错,因为在y没有声明之前就赋值了


