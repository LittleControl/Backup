let name = 'Little'
let age = 18
let obj = {
    name,
    age,
    getName(){
        return this.name
    }
}
console.log(obj)
console.log(obj.getName())
/* 
    当一个对象中的属性与外面的可以访问到的变量重名时,可以简写
    写一个function时候可以省略':function'

*/