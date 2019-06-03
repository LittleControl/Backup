# Express框架的复习

## express的基本使用

- 如何导入express模块
- 如何在Node中使用expres模块
- 如何在express框架中使用body-parser插件
- 如何在Express框架中使用art-template模板引擎
- 在Express框架中如何开放静态资源
- 如何使用Express的路由模块

```JavaScript
var express = require('express')
var path = require('path')
var app = express()
var router = require('./router')
var bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
app.engine('html',require('express-art-template'))
app.use('/pullic/',express.static(path.join(__dirname,'./public/')))
app.use('/node_modules'.express.static(path.join(__dirname,'./node_modules/')))
app.use(router)
app.listen(2333,function(){
    console.log('Server is running at port 2333 !')
})
```
