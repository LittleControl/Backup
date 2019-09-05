let foo = () => console.log('www.littlecontrol.top')
foo()

/* 箭头函数的左边 */

// 箭头函数没有形参的时候,()可以省略
let f1 = () => console.log('LittleControl')
f1()
// 箭头函数有一个形参的时候,()可以省略
let f2 = name => console.log(name)
f2('LittleControl')
//箭头函数左边有一个以上的形参时,()不可以省略
let f3 = (name, age) => console.log(name, age)
f3('Little', 18)

/* 箭头函数的右边 */

// 箭头函数的函数体只有一句代码时,{}可以省略
let f4 = () => console.log('Nothing to do !')
f4()
// 箭头函数的函数体只有一句代码并且省略了{}时,会自动返回那一句代码的执行结果,没有省略{}时,要想拿到返回值,必须使用return关键字
let f5 = (x, y) => x * y
console.log(f5(2, 3))
let f6 = (x, y) => { return x * y }
console.log(f6(2, 3))

/* 关于箭头函数的this */
/* 箭头函数没有自己的this,箭头函数的this不是调用的时候决定的,而是在定义的时候处在的对象就是它的this */
/* 简单来说, 箭头函数就是看它的外层是否有函数
    如果有,那么它的this与外层函数的this一致
    如果没有,那么箭头函数的this就是window
*/

let f7 = () => console.log(this)
f7()
let btn1 = document.getElementsByTagName('button')[0] 
let obj = {
    name:'Little',
    getName(){
        btn1.onclick = () => console.log(this)
    }
}
obj.getName()
let btn2 = document.getElementsByTagName('button')[1]
let obj2 = {
    name:'Control',
    getName:() =>{
        console.log(this)
    }
}
obj2.getName()
