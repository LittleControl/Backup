# art-template模板引擎的使用

- 模板引擎的基本使用方法
  - 单个变量(variable),{{variable}}
  - 单个对象(object),{{obj.name}}{{obj.message}}
  - 一个数组(array),{{each array}}{{$value}}{{/each}}
  - 一个对象数组(objArray),{{each objArray}}{{$value.name}}{{$value.message}}{{/each}}
- 使用模板引擎替换一个数组变量
  - 见上
- 如何在Express框架中使用模板引擎
  - 直接上代码吧

    ```JavaScript
    var express = require('express')
    var app = express()
    app.engine('html',require('express-art-template'))
    ```
