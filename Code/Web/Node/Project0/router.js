var fs = require('fs')
var express = require('express')
var router = express.Router()
var cms = require('./commits')

router.get('/', function (req, res) {
    cms.find(function (err, commits) {
        if (err) {
            return res.status(500).send("Server Error!")
        }
        console.log(commits)
        res.render('index.html', {
            commits: commits
        })
    })
})

router.get('/index', function (req, res) {
    cms.find(function (err, commits) {
        if (err) {
            return res.status(500).send("Server Error!")
        }
        res.render('index.html', {
            commits: commits
        })
    })
})

router.get('/post', function (req, res) {
    res.render('post.html')
})
router.post('/index', function (req, res) {
    cms.add(req.body, function (err) {
        if (err) {
            console.log("File write failed!")
        } else {
            console.log("File write successfully!")
        }
    })
    res.redirect('/index')
})

router.get('/update',function(req,res){
    var path=req.originalUrl
    /* 这里是获取要修改的对象的id值 */
    var id=parseInt(req.query.id)
    fs.readFile('./data/test.json',function(err,data){
        if(err){
            return res.status(500).send("Server Error!")
        }
        /*注意此时commits已经是一个数组了*/
        commits=JSON.parse(data).commits
        var obj=commits.find(function(element){
            return element.id=id
        })
        /* 将path添加到对象中,方便渲染修改页面 */
        obj.path=path
        res.render('update.html',obj)
    })
})

router.post('/update',function(req,res){
    var obj={
        /* 因为是post方法,故这里没有用表单的中id,而是使用了url中的id 
        注意,这里query中id是一个String类型,还需要强类型转化一下*/
        id:parseInt(req.query.id),
        name:req.body.newname,
        message:req.body.newmessage
    }
    cms.update(obj,function(err){
        if(err){
            console.log('Sth is wrong!')
        }else{
            console.log("Update successfully!")
        }
    })
    res.redirect('/index')
})

router.get('/delete',function(req,res){
    var path=req.originalUrl
    /* 这里是获取要删除的对象的id值 */
    var id=parseInt(req.query.id)
    fs.readFile('./data/test.json',function(err,data){
        if(err){
            return res.status(500).send("Server Error!")
        }
        /*注意此时commits已经是一个数组了*/
        commits=JSON.parse(data).commits
        var obj=commits.find(function(element){
            return element.id=id
        })
        /* 将path添加到对象中,方便渲染修改页面 */
        obj.path=path
        res.render('delete.html',obj)
    })
})

router.post('/delete',function(req,res){
    var id=parseInt(req.query.id)
    cms.delete(id,function(err){
        if(err){
            res.status(500).send("Server Error!")
        }else{
            console.log("delete successfully!")
        }
    })
    res.redirect('/index')
})

module.exports = router
