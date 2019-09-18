/* 
    Node就是基于commonJS来写的
*/

let module1 = require('./modules/module1')
//自定义模块不能省略'./'的相对路径标示
// let module1 = require('modules/module1')
let module2 = require('./modules/modules2')

module1.getName()
module2.getWebsite()

/* 
    重点理解CommonJS的思想
    以及module.exports = value 与 exports = value 的区别与联系

*/
