# exports与module.exports的区别与联系

- 首先两个都可以使对象暴露给要引用的js文件中，如果都是没有设计返会一个对象啥的操作两者的是没有区别的
- 然后就是对于如果直接exports一个对象的话，两者就有区别了
  - 代码示例

    ```javascipt
    //这个是待引入的Module.js文件
    exports={
        name:"LittleControl",
        age:18
    }
    //这个是待引入的Module2.js文件
    module.exports={
        name:"LittleControl",
        age:18
    }
    //这个是测试引用文件ModuleTest.js
    var m1=require("./Module.js");
    console.log(m1.name);//undefined
    var m2=require("./Module2.js");
    console.log(m2.name);//LittleControl
    ```

  - 这样exports与module.exports的区别就显然易见了

- 如果真的区分不了这两个的话，建议以后只用module.exports(嘿嘿)