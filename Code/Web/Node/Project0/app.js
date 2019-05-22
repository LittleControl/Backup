var express=require('express')
var app=express()
var bodyParser=require('body-parser')
var commits=[]
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
app.engine('html',require('express-art-template'))
app.use('/public/',express.static('./public/'))
app.use('/node_modules',express.static('./node_modules/'))
app.get('/',function(req,res){
    res.render('index.html')
})
app.get('/post',function(req,res){
    res.render('post.html')
})
app.post('/index',function(req,res){
    console.log(req.body)
    commits.unshift(req.body)
    res.render('index.html',{
        commits:commits
    })
})
app.listen(2333,function(){
    console.log('Server is running at port 2333')
})