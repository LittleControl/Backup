/* 
    Buffer 缓冲区
    类似于数组，但是可以存储二进制文件
*/
// var str="I am a little str";
// var str="你好呀，小控!";
// var buf=Buffer.from("str");
// console.log(buf);
// console.log(str.length);
// console.log(buf.length);
// var buf2=Buffer.alloc(4);//申请一个4字节的缓冲区，并同时初始化缓冲区
// console.log(buf2);
// var buf3=Buffer.allocUnsafe(4);//申请一个4字节的缓冲区，但不会初始化，可能会含有敏感数据，所以是unsafe
// console.log(buf3);
// var buf4=Buffer.alloc(4);
// // buf4[0]='w';
// buf4[1]=15;
// buf4[2]=0x23;
// buf4[3]="小控呀";
// // console.log(buf4);
// for(var i=0;i<buf4.length;i++){
//     console.log(buf4[i].toString(2));
// }
// console.log(buf4.toString());
var buf5=Buffer.from("我真的是宁采臣呀！！！！");
console.log(buf5);
console.log(buf5.toString());