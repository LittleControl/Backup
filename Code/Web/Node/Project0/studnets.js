var fs=require('fs')
function find(callback){
    fs.readFile('./data/test.json','utf8',function(err,data){
        if(err){
            return callback(err)
        }
        callback(null,data)
    })
}
// find(function(err,data){
//     if(err){
//         res.status(500).send("Server Error !")
//     }
//     console.log(JSON.parse(data).commits)    

// })
exports.find