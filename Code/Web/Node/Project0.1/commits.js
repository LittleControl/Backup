var fs = require('fs')
var mongoose = require('mongoose')
mongoose.connect('mongodb://localhost/test', { useNewUrlParser: true }, function (err) {
    if (err) {
        console.log("Connection Failed !")
    } else {
        console.log("Connect Successfully !")
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

Commit.find(function(err,data){
    if(err){
        console.log(err)
    }else{
        console.log(data)
    }
})
