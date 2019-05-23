var express=require('express')
var app=express()
var router=require('./router')
var bodyParser=require('body-parser')
var commits=[]
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
app.engine('html',require('express-art-template'))
app.use('/public/',express.static('./public/'))
app.use('/node_modules',express.static('./node_modules/'))
app.use(router)
app.listen(2333,function(){
    console.log('Server is running at port 2333')
})