function Fn(name = 'Little', age = 18) {
    this.name = name
    this.age = age
}
let fn = new Fn()
console.log(fn)
let fn2 = new Fn('Control', 19)
console.log(fn2)

/*
    fn.protptype == null
    fn.__proto__ == Fn.prototype
    Fn.prototype == {Funtion f1}
    Fn.__proto__ == Function.prototype
    Function.prototype == {}
    Function.__proto__ == Object.prototype
    Object.prototype == {}
    Object.__proto__ == null

    具体还是看目录下的`原型链.png`文件吧

*/

/*
    似乎只有函数才存在prototype属性
    而对于一个函数而言,他的__proto == 他的构造函数的prototype

    当调用一个函数的属性或方法时,会现在自身里寻找有没有该属性
    然后在想上看看自己的__proto__里面有没有
    然后再去自己的__proto__里的__proto__里
    直到最后的__prototype__为空
    然后就会给出没有该方法或属性的提示

    个人认为,类似于其他语言的继承


    再次更新补充

    函数有一个原型链,而对象也有一个原型链
    所以对于一个构造函数而言,不仅自己本身有一个自己的__proto__指向自己本身作为一个对象的构造函数,本身的prototype里的也会存在一个__proto__,指向自己作为一个实例
    对象的原型,也就是Function,因为函数都是Function的实例
    Object作为一个构造函数而言,也是一个Function的实例
    而Function本身作为一个构造函数而言,也是一个Function的实例

    再更新一下吧

    还有一种说法就是,对于自定义构造函数,其原型是一个对象,而这个空对象又是Object的实例,所以这个空对象的__proto__就是Object.prototype

*/
