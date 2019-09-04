var obj = {
    name:'Little'
}
var json = {'name':'Little'}
var t1 = JSON.stringify(obj)
console.log(typeof t1)
console.log('==='+t1+'===')
var t2 = JSON.parse(json)
console.log(typeof t2)
console.log(t2)
// console.log('==='+t2+'===')