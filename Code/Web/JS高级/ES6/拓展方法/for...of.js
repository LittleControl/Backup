/* for...of 可以遍历的对象
    数组
    伪数组
    Map容器
    Set容器
    arguments
*/

let arr = [1, 2, ['a', 'b']]
for (let i of arr) {
    console.log(i)
}
function nothing() {
    for (let i of arguments) {
        console.log(i)
    }
}
nothing(1, 2, 3)
/* 不可以使用forof遍历对象 */
let obj = {
    name: 'Little',
    age: 18
}
// for (let i of obj) {
//     console.log(i)
// }

let arr2 = [['name','Little'],['age',18]]
let map = new Map(arr2)
map.set('website','www.littlecontrol.top')
for ( let item of map) {
    console.log(item)
}


