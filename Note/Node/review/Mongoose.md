# 关于Mongoose的简单复习

## 如何在Node中使用mongoose

```JavaScript
var mongoose = require('mongoose')
mongoose.connect('mongodb://localhost/test',{ useNewUrlParser: true },function(err){
    if(err){
        console.log('Connect Failed !')
    } esle {
        console.log('Connect Successfully !')
    }
})
var mySchema = mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    message: {
        type: String,
        required: true
    }
})
/* 注意这里相当于创造了一个名字为Commit的集合(collection),但是在mongodb中存储的是集合commits */
var Commit = mongoose.module('Commit',mySchema)

```

## Mongoose的简单操作(CRUD)

### Create

```JavaScript
var newUser = new Commit({
    name: 'LittleControl',
    message: 'Noting To Do But Love'
})
newUser.save(function (err, data) {
    if (err) {
        console.log("File write failed!")
    } else {
        console.log("File write successfully!")
    }
})
```

### Retrieve

```JavaScript
Commit.deleteOne(obj,function(err,data))
Commit.deleteMany(obj,function(err,data))
/* 注意,这里的data是执行结果,不是文件数据 */
```

### Update

```JavaScript
Commit.updateeOne(obj1,obj2,function(err,data))
Commit.updateeMany(obj1,obj2,function(err,data))
/* 注意,这里的obj1是查询条件,obj2是修改的内容,data是修改之后的数据 */
```

### Delete

```JavaScript
Commit.find(obj,function(err,data))
Commit.findOne(obj,function(err,data))
/* 注意,这里的obj是查询条件,data是查询结果 */
```
