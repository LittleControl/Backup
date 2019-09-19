(function(){function r(e,n,t){function o(i,f){if(!n[i]){if(!e[i]){var c="function"==typeof require&&require;if(!f&&c)return c(i,!0);if(u)return u(i,!0);var a=new Error("Cannot find module '"+i+"'");throw a.code="MODULE_NOT_FOUND",a}var p=n[i]={exports:{}};e[i][0].call(p.exports,function(r){var n=e[i][1][r];return o(n||r)},p,p.exports,r,e,n,t)}return n[i].exports}for(var u="function"==typeof require&&require,i=0;i<t.length;i++)o(t[i]);return o}return r})()({1:[function(require,module,exports){
/* 
    Node就是基于commonJS来写的
*/

let module1 = require('./modules/module1')
//自定义模块不能省略'./'的相对路径标示
// let module1 = require('modules/module1')
let module2 = require('./modules/module2')

module1.getName()
module2.getWebsite()

/* 
    重点理解CommonJS的思想
    以及module.exports = value 与 exports = value 的区别与联系

*/

},{"./modules/module1":2,"./modules/module2":3}],2:[function(require,module,exports){
module.exports = {
    name: 'LittleControl',
    getName() {
        console.log(this.name)
    }
}
},{}],3:[function(require,module,exports){
exports.website = 'www.littlecontrol.top'
exports.getWebsite = function () {
    console.log(this.website)
}
},{}]},{},[1]);
