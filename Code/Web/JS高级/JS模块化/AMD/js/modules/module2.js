define([
    'module1'
], function(module1) {
    let website = 'www.littlecontrol.top'
    function getWebsite() {
        return module1.getName() + '  ' + website
    }
    return {getWebsite}
});