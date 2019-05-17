var http=require("http");
var server=http.createServer();
// console.log(server);
server.on("request",function(req,res){
    var url=req.url;
    if(url=="/html"){
        res.setHeader("Content-Type","text/html;charset=utf-8");
        res.end("<h1>情若能自控,不知雨怅控!</h1>")
    }else{
        res.setHeader("Content-Type","text/plain;charset=utf-8");
        res.end("你好呀,小控");
    }
});
server.listen(2333,function(){
    console.log("Anything is good!");
});