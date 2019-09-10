/* 
    ES6中引入了块级作用域的概念,一般用{}表示一个块级作用域

*/
/* 
    只要块级作用域中存在let或者const关键词
    那么它们所声明的变量就会绑定这个区域,与外界无关
    所有在此作用域里未声明而使用的变量都会报错(即使外面已经声明过)
    这在语法上成为暂时性死区(TDZ)
*/
// var obj = {}
// {
//     console.log(obj)
//     let obj = {}
// }
// var obj = { name:'Little'}
// let obj = { name:'Little'}
// {
//     console.log(obj)
// }
/* 
    对于for循环而言,循环条件那一部分是一个父作用域,而循环体则又是一个单独的子作用域,与父作用域无关
*/
for (let i = 0; i < 3; i++) {
    // console.log(i)
    let i = 'Nothing'
    console.log(i)
}
