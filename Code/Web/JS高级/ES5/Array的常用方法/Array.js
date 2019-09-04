/* 
    Array.prototype.indexOf
    Array.prototype.lastIndexOf
    Array.prototype.forEach
    Array.prototype.map
    Array.prototype.filter
*/
var arr = [1,2,3,4,5,5,4,3,2,1]
console.log(arr.indexOf(2))
console.log(arr.lastIndexOf(2))
arr.forEach(function(item,index){
    console.log(item,index)
})
var arr1 = arr.map(function(item,index){
    return item+5
})
console.log(arr1)
var arr2 = arr.filter(function(item,index){
    return item > 2
})
console.log(arr2)
