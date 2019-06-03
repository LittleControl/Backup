var fs = require('fs')
var path = require('path')
fs.readFile(path.join(__dirname,'./hello.txt'), 'utf8', function (err, data) {
    if (err) {
        console.log('Something is wrong !')
    } else {
        console.log(data)
    }
})
