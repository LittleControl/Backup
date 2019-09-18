// 0 1 1 2 3 5

/* 
    经测试,postMessage互相传输的数据是不变的,原来是什么就是什么
    不会把Number类型变为String类型
    通信的基本要素?!!!
*/

console.log('has arrived here')
function getRes(num) {
    /* 因为event.data的类型为String,所以这里不能使用===,使用==自动做类型转化 */
    if (num == 1) {
        return 0
    }
    if (num == 2) {
        return 1
    }
    return getRes(num-1) + getRes(num-2)
}
onmessage = function(event) {
    console.log('have received the message')
    // var value = getRes(event.data)
    console.log(event.data)
    /* 注意这里event.data类型为String!!! */
    this.console.log(typeof event.data)
    // let value = 'LittleControl'
    let value = getRes(event.data)
    postMessage(value)
}
