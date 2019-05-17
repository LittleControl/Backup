var fs=require("fs");
// console.log(fs);
//同步写入
/*var fo=fs.openSync("Hello.txt","w");
console.log(fo);
fs.writeSync(fo,"Hello,Fs",4);
fs.closeSync(fo);*/
//异步读写
fs.open("Hello3.txt","r",function(error,fd){
    if(error){
        console.log("Segmentation fault!")
    }else{
        console.log("Open Successfully!");
        fs.write(fd,"www.littlecontrol.top",function(error,fd){
            if(error){
                console.log("Write Failly!")
            }else{
                console.log(fd);
            }
        })
    }
})
console.log("down down down !");