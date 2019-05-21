var fs = require('fs')
fs.readdir('./',function(error,files){
    if(error){
        console.log('Some wrong!')
    }else{
        console.log(files)
    }
})
//readdir有两个参数
//第一个是文件目录,第二个是回调函数
//回调函数有连个参数,第一个是error第二个是files(即文件目录)