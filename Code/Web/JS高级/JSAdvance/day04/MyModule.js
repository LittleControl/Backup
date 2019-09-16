function module1() {
    var website = 'www.littlecontrol.top'
    function fn1() {
        console.log('fn1()...' + website)
    }
    function fn2() {
        console.log('fn2()...' + website)
    }
    return {
        fn1,
        fn2
    }
}
