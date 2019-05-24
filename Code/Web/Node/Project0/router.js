var fs = require('fs')
var express = require('express')
var router = express.Router()
var cms = require('./commits')
router.get('/', function (req, res) {
    cms.find(function (err, commits) {
        if (err) {
            return res.status(500).send("Server Error!")
        }
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
module.exports = router