/* var str = 'littlecontrol.top/day12/Cookie.html'
var tag = str.lastIndexOf('/')
console.log(tag)
var test = str.slice(tag)
console.log(test)
var test2 = str.split(tag)
console.log(test2)
var tag2 = str.indexOf('/')
test = str.slice(0,tag2)
console.log(typeof test)
console.log(test) */
/* ======================================== */
/* var obj = {}
var nothing = obj[nothing] || 'str'
console.log(nothing)
var obj = {
    key:18
}
console.log(obj.key) */
/* =========================================== */
/* var date = new Date()
console.log(typeof (date.getDate()+1)) */
/* ============================================ */
var str = 'nothing=1;otto=2;bigdeath=3;'
var test = str.split(';')
for(let i = 0; i < test.length; i++){
    temp = test[i].split('=')
    console.log(temp)
}
console.log(test)