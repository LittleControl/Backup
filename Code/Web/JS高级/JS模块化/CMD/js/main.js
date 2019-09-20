define(function (require) {
    // let module3 = require('./modules/module3')
    // console.log(module3.web)
    require.async('./modules/module3', function (m3) {
        console.log(m3)
        console.log(typeof m3)
        console.log(m3.web)
    })
})