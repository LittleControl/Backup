var obj = {
    name:'LittleControl'
}
function foo(data,age){
    console.log(this.name + ' ' + data + age)
}
foo(8)
/* 
    当函数需要传入参数时,call从第二个参数时候,可以把需要的参数一次列举出来
    而使用apply方法时,则需要把参数放在一个数组中
    调用call与apply方法会立即执行该函数,而bind不会,会返回一个绑定对象的函数
*/
foo.call(obj,'Okay',18)
foo.apply(obj,['Okay',18])
var bar = foo.bind(obj)
bar('okay',18)
foo(4,4)
var bar2 = foo.bind(obj,'okay',18)
bar2()
/* 关于bind的常用场景 */
// 需要给一个定时器指定一个既定的对象时
setInterval(function(){
    console.log(this)//这里只能通过bind函数来使这个function的this指向obj
}.bind(obj),1000)