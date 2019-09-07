/* Array.from
    将一个伪数组或者可遍历对象转化为数组,
    即可以使用数组的专属方法
*/
function Test() {
    let arr = arguments
    // arr.forEach((value,index) => {
    //     console.log(value,index)
    // })
    Array.from(arr).forEach((value, index) => {
        console.log(value, index)
    })
}
Test('a', 'b', 'Nothing')
/* 
    Array.of
    将一串参数变为一个数组,即具有数组的性质
*/
console.log(Array.of('a', 'b', 'Little').indexOf('b'))
/* find 
    返回数组中满足条件的第一个元素的值
*/
let arr1 = [1, 2, 'Little', 'Control']
console.log(arr1.find((value, index) => value >= 0))
/* findIndex
    返回数组中满足条件的第一个元素的下表
*/
console.log(arr1.findIndex((value,index) => value >=0))

