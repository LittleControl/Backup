/* 常用的几种克隆方式
    1.直接赋值                       浅拷贝
    2.Object.assign()               浅拷贝
    3.Array.prototype.slice()      浅拷贝
    4.Array.prototypee.concat()     浅拷贝
    5.JSON.parse(JSON.stringify())  深拷贝
    基本数据类型:
        String Number Undefined Null Boolean
    引用数据类型
        Object Array 
    
    对于基本数据类型而言是没有深拷贝和浅拷贝而言的

*/

/* ============== */
/* let obj = {
    name:'Little'
}
let obj1 = obj
console.log(obj1)
obj1.name = 'Control'
console.log(obj)//obj1会影响obj的值 */
/* ================= */
/* let obj = {
    name:'Little'
}
let obj1 = Object.assign(obj)
console.log(obj1)
obj1.name = 'Control'
console.log(obj) */
/* ======================== */
/* let arr = [1,2,[3,4]]
let arr1 = arr.concat()
console.log(arr1)
// 数组的cat对于数组或者对象仍然是浅拷贝
arr1[2][0] = 7
console.log(arr) */
/* ========================= */
/* 判断一个变量的数据类型
    typeof
        Number String Undefiend Object Function Boolean
        其中Null会被判断为Object

    Object.prototype.toString.call()

*/
/* let arr = []
console.log(typeof arr)//object
console.log(Object.prototype.toString.call(arr))//[object Array]
let no = null
console.log(typeof no)//[object]
console.log(Object.prototype.toString.call(no))//[object Null]
 */
/* =================================== */
/* 如何自己写一个深度克隆的方法
    当使用forin时,遍历数组,拿到的是数组下标,遍历对象,拿到的是对象的属性名

*/
function checkType(obj) {
    return Object.prototype.toString.call(obj).slice(8, -1)
}
function deepClone(obj) {
    let res
    if (checkType(obj) === 'Array') {
        res = []
    } else if (checkType(obj) === 'Object') {
        res = {}
    } else {
        return obj
    }
    for (let i in obj) {
        let value = obj[i]
        if(checkType(value) === 'Array' || checkType(value) === 'Object'){
            res[i] = deepClone(value)
        } else {
            res[i] = value
        }
    }
    return res
}

let arr = [1, 2, [3, 4]]
let arr1 = deepClone(arr)
console.log(arr1)
arr1[2][1] = 7
console.log(arr,arr1)
