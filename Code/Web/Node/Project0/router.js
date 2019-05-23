var fs=require('fs')
var express=require('express')
var router=express.Router()
router.get('/',function(req,res){
    fs.readFile('./data/test.json','utf8',function(err,data){
        if(err){
            res.status(500).send("Server Error !")
        }else{
            res.render('index.html',{
                commits:JSON.parse(data).commits
            })
        }
    })
})
router.get('/post',function(req,res){
    res.render('post.html')
})
router.post('/index',function(req,res){
    console.log(req.body)
    commits.unshift(req.body)
    res.render('index.html',{
        commits:commits
    })
})
module.exports=router