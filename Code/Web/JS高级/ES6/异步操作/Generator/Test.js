function T1(){
    console.log('www.littlecontrol.top')
}
function* T2(){
    let res = yield console.log('Nothing')
    console.log(res)
    res = yield T1()
    console.log(res)
    res = yield console.log('LittleControl')
    yield data => console.log(data)
    console.log(res)
}
let T3 = T2()
T3.next()
T3.next('Cool')
