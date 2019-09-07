console.log(0 == -0)//true
console.log(NaN == NaN)//false NaN与任何东西都不相等
/* Object.is
    判断两个对象是否相同
    如果两个对象类型不一致,则直接返回false
    否则应该就是转化成字符串来比较吧,目测是这样
*/
console.log(Object.is(0,-0))//false
console.log(Object.is(NaN,NaN))//true
console.log(Object.is('1',1))//false
/* Object.assign(target,source1,source2,...) 
    将指定的对象所具有的属性增加到目标对象上

*/
let obj1 = {
    name:'Little',
    showName(){
        console.log(this.name)
    }
}
let obj2 = {
    age:18,
    showAge(){
        console.log(this.age)
    }
}
let obj3 = {
    gender:'Boy',
    showGender(){
        console.log(this.gender)
    }
}
Object.assign(obj3,obj1,obj2)
console.log(obj3)
obj3.showAge()
obj3.showName()
/* [Object].__proto__ 
    直接修改一个对象的原型
*/
let obj4 = {
    name:'Little'
}
let obj5 = {
    website:'www.littlecontrol.top'
}
obj4.__proto__ = obj5
console.log(obj4.website)
