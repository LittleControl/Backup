let obj = {
    name:'Little',
    age:18
}
/* 注意对象的解构赋值只能赋值给对象中已经存在的属性的同名变量 */
let {age,name} = obj
console.log(age,name)
let {nothing} = obj
console.log(nothing)
let arr = [1,2,3,4,5]
let [a,b] = arr
console.log(a,b)
let [,,c,d] = arr
console.log(c,d)
