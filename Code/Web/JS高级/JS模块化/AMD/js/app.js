(function () {
    require.config({
        // baseUrl: './js/libs/',
        // baseUrl: './',
        baseUrl: 'js/modules',
        path: {
            // module1: './modules/module1',
            // module2: './modules/module2',
            // jquery: './libs/jquery'
        }

    })
    require(['module2'], function (m2) {
        console.log(m2.getWebsite())
        // m2.reColor()
    })
    // require(['module2'],function (module2) {
    //     console.log(module2.getWebsite())
    // })
    // require(['module2', 'jquery'], function (module2, $) {
    //     console.log(module2.getWebsite())
    //     console.log($)
    // })
    require(['jquery'], function ($) {
        $('body').css('backgroundColor', 'skyblue')
    })

})()