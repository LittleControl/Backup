var express=require('express')
var app=express()
app.get('/',function(req,res){
    res.send("Hello,Express!")
})
app.get('/index',function(req,res){
    res.send('Welcome to index page!')
})
app.get('/login',function(req,res){
    res.send(`
        <!DOCTYPE html>
        <html>
            <head>
                <meta charset='utf-8'>
            </head>
            <body>
                <h1>
                    RainSorrowControl
                    丿雨怅控
                </h1>
            </body>
        </html>
    `)
})
app.get('/nothing',function(req,res){
    res.send("Nothing To Do But Love !")
})
app.listen(2333,function(){
    console.log('App is running at port 2333')
})