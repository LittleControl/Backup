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
        post_data.id=data[0].id+1
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
exports.update=function(obj,callback){
    fs.readFile('./data/test.json','utf8',function(err,data){
        if(err){
            return callback(err)
        }
        data=JSON.parse(data).commits
        /* 这里遍历obj中的每一个属性值,并覆盖数组中的的原始值 */
        for(var key in obj){
            /* 因为id与数组的下表是对称的,所以这里用数组长度减去id值就是数组的下标 */
            data[data.length-obj.id][key]=obj[key]
        }
        var fileData={
            commits:data
        }
        fs.writeFile('./data/test.json',JSON.stringify(fileData),function(err){
            if(err){
                return callback(err)
            }
        })
    })
}
exports.delete=function(id,callback){
    fs.readFile('./data/test.json','utf8',function(err,data){
        if(err){
            return callback(err)
        }
        data=JSON.parse(data).commits
        /* 获取要删除的元素id对应的数组的下标值 */
        var position=data.length-id
        data.splice(position,1)
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
