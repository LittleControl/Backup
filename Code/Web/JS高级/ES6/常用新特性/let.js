/* 
    let关键字
        不会提前解析和声明
        不可以重复定义
        有自己的块作用域

    常用于循环遍历赋值

*/
// console.log(name)
// var name = 'Little'
let name = 'Little'
var btns = document.getElementsByTagName('button')
/* for (var i = 0; i < btns.length; i++) {
    (function (i) {
        btns[i].onclick = function () {
            alert(i)
        }
    })(i)
} */
for (let i = 0; i < btns.length; i++) {
    btns[i].onclick = function(){
        alert(i)
    }
}
