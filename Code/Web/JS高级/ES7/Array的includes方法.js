let arr = [1,2,['a','b'],'abc']
let arr2 = ['a','b']
console.log(arr.includes('a'))
console.log(arr.includes('abc'))
console.log(arr.includes(1))
/* 为什么不包含arr2就不晓得了  */
console.log(arr.includes(arr2))//flase
console.log(arr.includes(['a','b']))//false
