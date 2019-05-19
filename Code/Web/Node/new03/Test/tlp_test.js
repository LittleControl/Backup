var fs = require('fs')
var http = require('http')
var tlp = require('art-template')
http
    .createServer(function (req, res) {
        var url = req.url
        if (url === '/') {
            fs.readFile('./tlp.html', function (error, data) {
                if (error) {
                    return '500'
                } else {
                    hobbies=['Sing','Song','Dance']
                    commits=['Name','Age']
                    data = tlp.render(data.toString(), {
                        name:'LittleControl',
                        age:19,
                        hobbies:hobbies,
                        commits:commits
                    })
                    console.log(data)
                    res.end(data)
                }
            })
        }
    })
    .listen(3000, function () {
        console.log("Server is running!")
    })