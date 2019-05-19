var fs = require('fs')
var http = require('http')
var urlMo = require('url')
var tlp = require('art-template')
var commits = []
http
    .createServer(function (req, res) {
        var urlObj = urlMo.parse(req.url, true)
        var url = urlObj.pathname
        var rootDir = '/home/littlecontrol/Documents/Code/Web/Node/new03'
        if (url === '/') {
            fs.readFile('./views/post.html', function (error, data) {
                if (error) {
                    console.log("Error!!!")
                } else {
                    res.end(data)
                }
            })
        } else if (url === '/post/css/bootstrap') {
            fs.readFile('./public/css/bootstrap.min.css', function (error, data) {
                if (error) {
                    console.log("Error!!!")
                } else {
                    res.setHeader("Content-Type", "text/css;utf-8")
                    res.end(data)
                }
            })
        } else if (url === '/public/js/jquery') {
            fs.readFile('./public/lib/jQuery.js', function (error, data) {
                if (error) {
                    console.log("Error!!!")
                } else {
                    res.setHeader("Content-Type", "text/css;utf-8")
                    res.end(data)
                }
            })
        } else if (url === '/public/js/bootstrap') {
            fs.readFile('./public/js/bootstrap.js', function (error, data) {
                if (error) {
                    console.log("Error!!!")
                } else {
                    res.setHeader("Content-Type", "text/css;utf-8")
                    res.end(data)
                }
            })
        } else if (url === '/post') {
            var commit = urlObj.query
            console.log(commit)
            commits.unshift(commit)
            console.log(commits)
            res.statusCode = 302
            res.setHeader("Location", "/index")
            res.end('Okay')
        } else if (url === '/index') {
            fs.readFile('./views/index.html', function (error, data) {
                if (error) {
                    return 404
                } else {
                    console.log(commits)
                    data = tlp.render(data.toString(),{
                        commits:commits
                    })
                    res.end(data)
                }
            })
        }else if (url === '/public/css/index') {
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
    .listen(2333, function () {
        console.log("Server is runnning!")
    })