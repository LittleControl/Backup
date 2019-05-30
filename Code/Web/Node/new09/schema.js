var mongoose = require('mongoose')
mongoose.connect('mongodb://localhost/test', { useNewUrlParser: true }, function (err) {
    if (err) {
        console.log("Connection Failed !")
    } else {
        console.log("Connect Successfully !")
    }
})
var mySchema = mongoose.Schema({
    username: {
        type: String,
        required: true
    },
    password: {
        type: String,
        required: true
    },
    email: {
        type: String
    }
})
var User = mongoose.model("User", mySchema)
// var user0 = new User({
//     username:'LittleControl',
//     password:'Nothing',
//     email:'littlecontrol@qq.com'
// }) 
// user0.save(function(err,data){
//     if(err){
//         console.log("Something is wrong !")
//     }else{
//         console.log(data)
//     }
// })
// var user1 = new User({
//     username: '李小控',
//     password: 'LittleControl',
//     email: 'LittleControl@qq.com'
// })
// user1.save(function (err, data) {
//     if (err) {
//         console.log('Save Failed !')
//     } else {
//         console.log('Save Successfully !')
//     }
// })
// User.find({
//     username: 'LittleControl'
// }, function (err, data) {
//     if (err) {
//         console.log('Something is wrong !')
//     } else {
//         console.log(data)
//     }
// })
// User.findOne({
//     username: 'LittleControl'
// }, function (err, data) {
//     if (err) {
//         console.log('Something is wrong !')
//     } else {
//         console.log(data)
//     }
// })
// var user2 = new User({
//     username: '丿雨怅控',
//     password: '145.567',
//     email: 'rainsorrowcontrol@qq.com'
// })
// user2.save(function (err, data) {
//     if (err) {
//         // console.log("Save Failed !")
//         console.log(err)
//     } else {
//         console.log(data)
//     }
// })

User.updateOne({
    username:'LittleControl'
},{
    username:'原来是小控呀!'
},function(err,doc){
    if(err){
        console.log(err)
    }else{
        console.log(doc)
    }
})