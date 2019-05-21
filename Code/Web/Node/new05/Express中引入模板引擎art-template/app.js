var express=require('express')

var app=express()
app.use('/public/',express.static('../public/'))
app.engine('html',require('express-art-template'))
app.get('/',function(req,res){
    res.render('index.html',{
        name:'LittleControl'
    })
})
app.listen(2333,function(){
    console.log('App is running at port 2333')
})