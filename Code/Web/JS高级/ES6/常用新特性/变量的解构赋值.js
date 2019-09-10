let obj = {
    name: 'Little',
    age: 18
}
/* 注意对象的解构赋值只能赋值给对象中已经存在的属性的同名变量 */
let { age, name } = obj
console.log(age, name)
let { nothing } = obj
console.log(nothing)
let arr = [1, 2, 3, 4, 5]
let [a, b] = arr
console.log(a, b)
let [, , c, d] = arr
console.log(c, d)
/*
    变量的结构赋值一些注意事项
        对于对象的解构赋值
        let obj = { name:'Little', age:18}
        let {name,age} = obj //这句代码实际上等同于这句代码 let { name:name, age:age }
*/
let obj2 = { name2: 'Little', age2: 18 }
// let { name2, age2 } = obj2
let { name2: name2, age2: age2 } = obj2
console.log(name2, age2)
/* 当变量名与对象的属性名不一致时,必须写成下面这样 */
let { name2: aaa, age2: bbb } = obj2
console.log(aaa, bbb)
/* 所以对象的结构赋值实际上是给属性名对应的变量赋值,刚开始的方式只是一种简写方式 */
