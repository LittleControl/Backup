/* 基本数据类型
        Number String Boolean Null Undefined
   对象(引用)数据类型
        Object
            Array
            Function
*/
/* 
    目前可以检测数据类型或者具有数据类型性质的方法

    typeof
        返回值为String类型
        可以返回的值
            Number Boolean String Undefiend Object
            其中,Null,Array,Function数据类型会被归入Object
    instanceof
        检测某个对象是否是某个对象的实例
        一切引用数据类型都是Object的实例
    ===
        ==会自动做类型转换,而===不会
    
    Object.prototype.toString.call(obj).slice(8,-1)
        返回具体的数据类型
*/
let arr = [1, 2, 3]
console.log(typeof arr)
console.log(Object.prototype.toString.call(arr))
let str = 'little'
console.log(str instanceof Object)
let num = 0
str = '0'
console.log(num == str)//true
console.log(num === str)//false

