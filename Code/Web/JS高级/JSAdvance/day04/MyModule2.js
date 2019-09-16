(function (window) {
    var name = 'LittleControl'
    function fn3() {
        console.log('fn3()...' + name)
    }
    function fn4() {
        console.log('fn4()...' + name)
    }
    window.module2 = {
        fn3,
        fn4
    }
})(window)
