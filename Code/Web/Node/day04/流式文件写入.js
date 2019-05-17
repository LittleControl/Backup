var fs=require("fs");
// console.log(fs);
var cw=fs.createWriteStream("流式文件.txt");
// cw.on("open",function(){
//     console.log("写入成功!");
// })
cw.once("open",function(){
    console.log("打开成功");
});
cw.write("流式文件的写入");
cw.write("222222222");
// cw.close();
cw.end();