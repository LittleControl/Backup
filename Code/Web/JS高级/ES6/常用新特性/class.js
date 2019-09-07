class MyMethod {
    constructor(age, name) {
        this.age = age
        this.name = name
    }
    /* 这里showAge方法只能使用对象的简写方式 */
    showAge() {
        console.log(this.age)
    }
    showName(){
        console.log(this.name)
    }
}
let t1 = new MyMethod(18, 'LittleControl')
console.log(t1)
t1.showAge()
class SecMethod extends MyMethod{
    constructor(age,name,gender){
        super(age,name)
        this.gender = gender
    }
    showAge(){
        console.log('My age is '+this.age)
    }
    show(){
        console.log(this.age,this.name,this.gender)
    }
}
let t2 = new SecMethod(19,'RainSorrow','Female')
console.log(t2)
t2.showAge()
t2.showName()
t2.show()
