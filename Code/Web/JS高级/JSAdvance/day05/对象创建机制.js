/* 通过Object构造函数创建对象 */
/* 
    使用场景,起始时不确定对象内部数据
    弊端: 语句太多

*/
var obj = new Object()
console.log(obj)
obj.name = 'Little'
obj.age = 18
obj.setName = function (name) {
    this.name = name
}

/* 通过对象的字面量 */
/* 
    适用场景: 起始时对象内部的数据是确定的
    弊端: 如果创建多个对象,则会有重复代码

*/
var obj2 = {
    name: 'Little',
    age: 18,
    setName(name) {
        this.name = name
    }
}
console.log(obj2)


/* 工厂函数 */
//简单说返回值为一个对象的函数就是一个工厂函数
/* 
    适用场景: 需要创建多个对象
    弊端:: 创建的对象没有一个具体的类型,无法区分

*/
function createObj(name, age) {
    var obj = {
        name,
        age,
        setName(name) {
            this.name = name
        }
    }
    return obj
}
var obj3 = createObj('Little', 18)
console.log(obj3)

/* 构造函数 */
/* 
    适用场景: 需要创建多个具有确定类型的对象
    弊端: 每个对象都有相同的数据,浪费内存
        类型于setName这个方法,每个对象都是一样的方法,都占用着一定的空间

*/
function Little(name, age) {
    this.name = name
    this.age = age
    this.setName = function (name) {
        this.name = name
    }
}
var obj4 = new Little('Little', 18)
console.log(obj4)

/* 构造函数+原型 */

function Control(name, age) {
    this.name = name
    this.age = age
}
Control.prototype.setName = function (name) {
    this.name = name
}
var obj5 = new Control('Little', 18)
console.log(obj5)
obj5.setName('Control')
console.log(obj5)
