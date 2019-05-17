var http=require("http")
var server=http.createServer();
server.on("request",function(request,response){
    // console.log(request.url)
    // response.write("Hello,Server!")
    // response.end();
    var url=request.url
    var data={
        name:"LittleControl",
        age:19,
        saying:"Hello,Node.js!"   
    }
    data=JSON.stringify(data)
    if(url=="/"||url=="/index"){
        response.end("您的请求地址是 "+url+"\nIndex Page")
    }else if(url=="/login"){
        response.end("您的请求地址是 "+url+"\nLogin Page")
    }else if(url=='/test'){
        response.end(data)
    }else{
        response.end("404 NOT FOUND!!!")
    }
})
server.listen(2333,function(){
    console.log("2333 start successfully!")
})