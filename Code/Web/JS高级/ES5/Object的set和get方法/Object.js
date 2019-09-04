/* var obj = {
    name:'Little'
}
var obj2 = Object.create(obj,{
    age:{
        value:18,
        writable:true,
        configurable:true,
        enumerable:true
    }
})
console.log(obj2)
obj2.age = 19
console.log(obj2) */
/* =================== */
/* var obj = {
    name:'Control'
}
obj.age = 18
console.log(obj.age)
Object.defineProperties(obj,{
    age:{
        get:function(){
            return '===' + this.name + '==='
        },
        set:function(data){
            this.name = data
            console.log('setting!')
        }
    }
})
obj.age = 18
console.log(obj.age) */
/* ====================== */
/* 
    注意这个get和set方法中设置的都是obj已经存在的值
    不要设置未存在的值
    否则就会掉入死循环
    (╯﹏╰)
*/
var obj = {
    name:'Control',
    max:18,
    get age(){
        console.log('Getting!')
        return this.max
    },
    set age(data){
        this.max = data
        console.log('Setting!')
    }
}
console.log(obj.age)
obj.age = 18
console.log(obj.age)