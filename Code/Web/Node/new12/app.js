var fs = require('fs')
var path = require('path')
var express = require('express')
var app = express()
app.engine('html',require('express-art-template'))
app.get('/',function(req,res){
    res.render('index.html')
})
app.listen(2333,function(){
    console.log('Server is running at port 2333 !')
})