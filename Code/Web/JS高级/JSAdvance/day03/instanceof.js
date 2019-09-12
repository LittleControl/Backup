/* 
    目前个人认为,只要实例对象按照原型链走下去,能够走到构造对象那里,那么instanceof的判定就为true
    
*/

let arr = [1,2,3]
console.log(arr instanceof String)
