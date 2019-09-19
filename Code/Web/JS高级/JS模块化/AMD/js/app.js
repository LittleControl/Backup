(function () {
    requirejs.config({
        // baseUrl: './js/libs/',
        path: {
            module1: './modules/module1',
            module2: './modules/module2',
            jquery: './libs/jquery'
        }

    })
    // requirejs(['module2','jquery'],function (module2,$) {
    //     console.log(module2.getWebsite())
    //     $('body').css('backgroundcolor','deeppink')
    // })
    // requirejs(['module2', 'jquery'], function (module2, $) {
    //     console.log(module2.getWebsite())
    //     console.log($)
    // })
    requirejs(['jquery'], function ($) {
        $('body').css('backgroundColor', 'skyblue')
    })

})()