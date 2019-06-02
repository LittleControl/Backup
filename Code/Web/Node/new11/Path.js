var fs = require('fs')
var path = require('path')

console.log(__dirname)
console.log(__filename)
fs.readFile(path.join(__dirname,'data/a.txt'),'utf8',function(err,data){
    if(err){
        console.log('Something is wrong !')
    }else{
        console.log(data)
    }
})
console.log(path.parse(__filename))
/* 
    对于文件系统中的`./data/a.txt`
    其相对的不是当前文件所在路径,而是node实行命令的路径
    即执行node的命令的那个路径
    这个不是node的BUG,是node的特性

*/

/* 
    一般而言,相对路径在node中是不可靠的,
    所以一般fs模块与path模块像一对连体婴儿一般,经常一起导入
    __dirname是node中的固有属性,表示当前文件的所在目录的绝对路径
    __filename也是node中的固有属性,表示当前文件的的绝对路径
    path模块中的join方法用来链接两个路径,得到一个新的路径,一般第一个参数都是__filename,
    第二个参数是要引用文件的相对路径,然后经过join方法,就得到了要引用文件的绝对路径

*/
