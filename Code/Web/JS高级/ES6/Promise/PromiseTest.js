var fs = require('fs')

var preadFile = function (filePath) {
    return new Promise(function (resolve,reject) {
        fs.readFile(filePath, 'utf8',function (err, data) {
            if (err) {
                reject(err)
            } else {
                resolve(data)
            }
        })
    })
}

preadFile('./data/a.txt')
    .then(function(data){
        console.log(data)
        return preadFile('./data/b.txt')
    },function(err){
        console.log(err)
    })
    .then(function(data){
        console.log(data)
        return preadFile('./data/c.txt')
    },function(err){
        console.log(err)
    })
    .then(function(data){
        console.log(data)
    },function(err){
        console.log(err)
    })