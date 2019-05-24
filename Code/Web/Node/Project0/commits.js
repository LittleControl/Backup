var fs=require('fs')

exports.find=function(callback){
    fs.readFile('./data/test.json','utf8',function(err,data){
        if(err){
            return callback(err)
        }
        callback(null,JSON.parse(data).commits)
    })
}
exports.add=function(post_data,callback){
    fs.readFile('./data/test.json','utf8',function(err,data){
        if(err){
            return callback(err)
        }
        data=JSON.parse(data).commits
        post_data.id=data[data.length-1]+1
        data.unshift(post_data)
        var obj={
            commits:data
        }
        fs.writeFile('./data/test.json',JSON.stringify(obj),function(err){
            if(err){
                return callback(err)
            }
        })
    })
}
exports.update
exports.delete