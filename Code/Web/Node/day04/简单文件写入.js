var fs=require("fs");
fs.writeFile("Simple.txt","简单文件写入\n",function(error){
    if(!error){
        console.log("写入成功！");
    }else{
        console.log("写入失败！");
        
    }
});
fs.writeFile("Simple.txt","追加内容",{flag:"r"},function(err){
    if(!err){
        console.log("写入成功！");
    }else{
        console.log("写入失败！");
    }
}) 