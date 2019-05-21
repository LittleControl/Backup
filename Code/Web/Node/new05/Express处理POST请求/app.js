var express=require('express')
var app=express()
var bodyParser=require('body-parser')
app.use('/public/',express.static('../public/'))
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
app.engine('html',require('express-art-template'))
app.get('/',function(req,res){
    res.render('index.html',{
        name:'LittleControl'
    })
})
app.post('/post',function(req,res){
    res.render('post.html',req.body)
})
app.listen(2333,function(){
    console.log('App is running at port 2333')
})