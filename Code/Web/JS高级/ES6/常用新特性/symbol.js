/* 
    Symbol 主要用于解决命名冲突问题
    Symbol属于原始数据类型(Number,String,Null,Boolean,Undefined,Object)
    只能通过Symbol()函数来得到一个Symbol,且得到的Symbol都不相同
    不能通过forin和forof方法来遍历对象中Symbol的属性
*/
let symbol = Symbol()
console.log(symbol)
let obj = {
    name: 'Little',
    age: 18
}
console.log(obj)
obj[symbol] = 'Control'
console.log(obj)
let symbol2 = Symbol()
console.log(symbol == symbol2)
let symbol3 = Symbol('Nothing')
console.log(symbol3)
const KEY = 'Nothing'
const OK = Symbol('Nothing')
console.log(KEY, OK)
for (let i in obj) {
    // console.log(i,obj[i])
    console.log(i)
}