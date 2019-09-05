/* 部署了Iterator接口的数据类型可以使用for of循环遍历 */
// 目前已知的部署了数据类型有:数组,字符串,arguments,set容器,map容器
let arr = [1, 'b', 11]
for (let i of arr) {
    console.log(i)
}
/* 注意,普通的对象类型并没有部署Iterator接口 */
// 模拟实现Iterator接口

function myIterator(arr) {
    let count = 0;
    //这里应该是用到了闭包吧,在内存中保存了这个count的值
    return {
        next: function () {
            return count < arr.length
                ? { value: arr[count++], done: false }
                : { value: undefined, done: true }
        }
    }
}
var test = myIterator(arr)
console.log(test.next())
console.log(test.next())
console.log(test.next())
console.log(test.next())

// 关于Symbol.iterator
/* 
    像forof ... 以及 解构赋值的过程中都会用到Iterator(迭代器),都会寻找这个Symbol.Iterator的属性
*/
