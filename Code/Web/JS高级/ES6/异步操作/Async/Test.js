function T1(){
    return new Promise(resolve => {
        setTimeout(resolve,2000)
    })
}
async function T2(){
    console.log('www.littlecontrol.top')
    await T1().then(() => {
        console.log('LittleControl')
    })
    console.log('Nothing')
}
T2()
