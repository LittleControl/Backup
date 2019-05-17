console.log("test.js模块正在加载");
var add=function(a,b){
    return a+b;
};
var name="LittleControl";
exports.add=add;
exports.name=name;
console.log("test.js模块加载完毕");