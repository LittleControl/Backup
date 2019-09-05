/* 
    ... 运算符 类似与函数中的默认argument是参数
    但是...是一个数组,argument是一个伪数组,所以...运算符的变量可以使用数组的所有方法
*/
function f1(x, y) {
    console.log(arguments)
}
/* 注意arguments中的callee就是该函数本身,常用于递归调用 */
f1(1,2)
/* 
    Arguments(2) [1, 2, callee: ƒ, Symbol(Symbol.iterator): ƒ]
    0: 1
    1: 2
    callee: ƒ f1(x, y)
    length: 2
    Symbol(Symbol.iterator): ƒ values()
    __proto__: Object
*/
function f2(...value){
    console.log(value)
}
f2(1,2)
/* 
    (2) [1, 2]
    0: 1
    1: 2
    length: 2
    __proto__: Array(0)
*/
function f3(a,...value){
    console.log(value)
}
f3(1,2,3)
/* 注意...运算符只能用于参数的最后部分,并且只能接管没有形参的参数 */