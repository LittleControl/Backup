var fs=require('fs')
var express=require('express')
var app=express()
var bodyParser=require('body-parser')
app.engine('html',require('express-art-template'))
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
app
    .get('/index',function(req,res){
        console.log(req.originalUrl)
    })
    .listen(3000,function(){
        console.log('Servet is runnint at port 3000')
    })
    