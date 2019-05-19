# 有关art-template模板引擎的一些入门使用点

- 基本用法
  - 在html页面中加入修改标示，一般变量如下

    ```HTML
    <!-- 假定该文件名为Test.html -->
    <!-- 基本替换变量用法 -->
    <p>Name:{{name}}<p>
    <!-- 变量为一个数组的情况 -->
    <p>Hobbies:{{each hobbies}}{{$value}}{{/each}}<p>
    <!-- 数组变量的元素为对象的情况 -->
    {{each Girl}}<p>Name:{{$value.name}} Age:{{$value.age}}<p>{{/each}}
    ```

    ```JavaScript
    var tlp=require('art-template')
    var fs=require('fs')
    fs.readFile('./Test.html',function(error,data){
        if(error){
            return 500
        }else{
            var data=tlp.render(data.toStirng(),{
                name:'LittleControl',
                hobbies:[
                    'Sing',
                    'Running',
                    'Programming'
                ],
                Girl:[
                    {
                        name:'Alice',
                        age:19
                    },
                    {
                        name:'Sailiya',
                        age:18
                    }
                ]
            })
        }
        res.end(data)
    })
    ```

- 以上代码输出如下

```HTML
Name:LittleControl
Hobbies:SingRunningProgramming
Name:Alice Age:19
Name:Sailiya Age:18
```

- 注意事项
  - `render`函数的第一个参数必须得是字符串,第二个参数必须是一个对象
  - `art-Template`模板引擎中,替换字符串中不可以罕有html标签,否则就算替换了也不生效
  - 或者说,不要试图用模板生成html标签(大坑!!!小控的泪水呀)