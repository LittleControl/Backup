var fs=require('fs')
var http=require('http')
var tlp=require('art-template')
http
    .createServer(function(req,res){
        var url=req.url
        if(url==='/'){
            fs.readFile('./Test.html',function(error,data){
                if(error){
                    res.end(500)
                }else{
                    data=tlp.render(data.toString(),{
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
                    res.end(data)
                }
            })
        }
    })
    .listen(5678,function(){
        console.log("Server is running!")
    })