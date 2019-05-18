var http = require("http")
var server = http.createServer()
server.on("request", function (request, response) {
    var url = request.url
    if (url == "/index") {
        var fs = require("fs")
        fs.readFile(wwwDir + '/html/index.html', function (error, data) {
            if (!error) {
                console.log("Read File Successfully!")
                response.setHeader("Content-Type", "text/html;charset=utf-8")
                response.end(data)
            }
        })
    } else {
        response.setHeader("Content-Type", "text/plain;charset=utf-8")
        response.end("404 NOT FOUNDED！")
    }

})
server.listen(2333, function () {
    console.log("Server in running!")
})