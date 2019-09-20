define([
    'module1',
    'module3'
], function(module1,module3) {
    let website = 'www.littlecontrol.top'
    function getWebsite() {
        return module1.getName() + '  ' + website
    }
    function reColor() {
        module3.jq('body').css('background-color', 'pink')
    }
    return {getWebsite, reColor}
});