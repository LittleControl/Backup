var fs = require('fs')
var express = require('express')
var router = express.Router()
var mongoose = require('mongoose')
mongoose.connect('mongodb://localhost/test', { useNewUrlParser: true }, function (err) {
    if (err) {
        console.log("MongoDB Connection Failed !")
    } else {
        console.log("MongoDB Connect Successfully !")
    }
})

var commitSchema = mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    message: {
        type: String,
        required: true
    }
})

var Commit = mongoose.model("Commit", commitSchema)

router.get('/', function (req, res) {
    Commit.find(function (err, data) {
        if (err) {
            return res.status(500).send("Server Error !")
        }
        /* 此时data也是一个数组 */
        res.render('index.html', {
            commits: data
        })
    })
})

router.get('/index', function (req, res) {
    Commit.find(function (err, data) {
        if (err) {
            return res.status(500).send("Server Error !")
        }
        res.render('index.html', {
            commits: data
        })
    })
})

router.get('/post', function (req, res) {
    res.render('post.html')
})
router.post('/index', function (req, res) {
    var newUser = new Commit(req.body)
    newUser.save(function (err, data) {
        if (err) {
            console.log("File write failed!")
        } else {
            console.log("File write successfully!")
        }
    })
    res.redirect('/index')
})

router.get('/update', function (req, res) {
    var path = req.originalUrl
    var id = req.query.id
    Commit.findOne({
        _id: id
    }, function (err, data) {
        if (err) {
            console.log("Nothing Can Be Find")
        } else {
            var obj = {}
            obj.id = data.id
            obj.name = data.name
            obj.message = data.message
            obj.path = path
            res.render('update.html', obj)
        }
    })
})

router.post('/update', function (req, res) {
    var obj = {
        id: req.query.id,
        name: req.body.newname,
        message: req.body.newmessage
    }
    Commit.updateOne({
        _id: obj.id
    }, obj, function (err, data) {
        if (err) {
            console.log("Something is wrong !")
        } else {
            console.log(data)
        }
    })
    res.redirect('/index')
})

router.get('/delete', function (req, res) {
    var path = req.originalUrl
    var id = req.query.id
    Commit.findOne({
        _id: id
    }, function (err, data) {
        if (err) {
            console.log("Nothing Can Be Find")
        } else {
            var obj = {}
            obj.id = data.id
            obj.name = data.name
            obj.message = data.message
            obj.path = path
            res.render('delete.html', obj)
        }
    })
})

router.post('/delete', function (req, res) {
    var id = req.query.id
    Commit.deleteOne({
        _id: id
    }, function (err) {
        if (err) {
            console.log("Nothing Can Be Find")
        } 
    })
    res.redirect('/index')
})

module.exports = router
