var fs = require('fs')
var http = require('http')
var art=require('art-template-cli');
console.log(art)
var server = http.createServer()
server.on("request", function (req, res) {
    var url = req.url
    var rootDir = '/home/littlecontrol/Documents/Code/Web/Node/new03'
    if (url === '/' || url === '/index') {
        var dir = rootDir + url + 'views/index.html'
        fs.readFile(dir, function (err, data) {
            if (err) {
                console.log("Can't read the file: " + dir)
            } else {
                res.end(data)
            }
        })
    } else if (url === '/public/css/index') {
        var dir = rootDir + url + '.css'
        fs.readFile(dir, function (err, data) {
            if (err) {
                console.log("Can't read the file: " + dir)
            } else {
                res.setHeader("Content-Type", "text/css,utf-8")
                res.end(data)
            }
        })
    } else if (url === '/public/js/index') {
        var dir = rootDir + url + '.js'
        fs.readFile(dir, function (err, data) {
            if (err) {
                console.log("Can't read the file: " + dir)
            } else {
                res.end(data)
            }
        })
    } else if (url === '/public/img/index') {
        var dir = rootDir + url + '.png'
        fs.readFile(dir, function (err, data) {
            if (err) {
                console.log("Can't read the file: " + dir)
            } else {
                res.end(data)
            }
        })
    } else {
        var dir = rootDir + '/views/404.html'
        console.log(dir)
        fs.readFile(dir, function (err, data) {
            if (err) {
                console.log("Can't read the file: " + dir)
                res.end("404 NOT FOUND.")
            } else {
                res.end(data)
            }
        })
    }
})
server.listen(2333, function () {
    console.log("Server is running!")
})