var fs=require('fs')
var express=require('express')
var app=express()
// app
//     .get('/',function(req,res){
//         res.sendFile('./public/views/index.html',function(error){
//             if(error){
//                 console.log('file read failed!')
//             }
//         })
//     })
//     .get('/img',function(req,res){
//         res.sendFile('./public/img/25.png',function(error){
//             if(error){
//                 console.log('file read failed!')
//             }
//         })
//     })
//     .listen(2333,function(){
//         console.log('App is running at port 2333')
//     })
app.use('/public/',express.static('../public/'))
    // .get('/',function(req,res){
    //     res.send("hello!")
    // })
app.listen(2333,function(){
        console.log('App is running!~')
    })