/* 
    严格模式的要求
      必须使用var声明变量
      自定义函数的this禁止指向window
      eval函数具有自己的作用域,不会污染到全局
      一个对象不可以有重名的属性

*/

/* 'use strict'
name = 'LittleControl'
console.log(name) */
/* ====================== */
/* 'use strict'
function Person(name,age){
    this.name = name
    this.age = age
}
Person('Little',5) */
/* ================= */
/* 'use strict'
var str = 'Little'
eval('var str = "Control";')
console.log(str) */
/* =================== */
/* 这个一个对象的重名属性不会提示报错 */
'use strict'
var obj = {
    name:'Little',
    name:'Control'
}
console.log(obj.name)