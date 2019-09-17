/* 原型链继承 为了得到方法 */
//原理就是让儿子的prototype等于父亲的一个实例
function Father() {
    this.name = 'Little'
    this.getName = function () {
        return this.name
    }
}
Father.prototype.setName = function (name) {
    this.name = name
}
function Son() {
    this.age = 18
}
Son.prototype = new Father()
let son = new Son()
// console.log(son)//Father { age: 18 }
// console.log(son.name)//Little
// console.log(son.getName())//Little
console.log()

/* 构造函数继承(伪继承) 为了得到属性 */
function Daughter() {
    Father.call(this)
    this.website = 'www.littlecontrol.top'
}
let daughter = new Daughter()
console.log(daughter)//Daughter {name: 'Little',getName: [Function],website: 'www.littlecontrol.top'}

/* 组合继承 原型链继承 + 构造函数继承 */
function Sister() {
    Father.call(this)
    this.age = 18
}
Sister.prototype = new Father()
Sister.prototype.constructor = Sister //修正constructor
let sis = new Sister()
console.log(sis)
sis.setName('LittleControl')
console.log(sis)

/* 
    总的来说,在ES5里要实现对于父亲函数的继承
        1 让儿子的prototype等于父亲的一个实例对象(这样就可以拿到父亲的方法)
        2 在儿子就构造函数里调用父亲的构造函数(通过apply或者call改变this)(这样就可以拿到父亲的属性)
        3 让儿子的prototype.constructor = 父亲(感觉这一步不是必须的)
*/
