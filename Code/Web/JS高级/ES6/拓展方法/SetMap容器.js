/* Set容器
    存放多个value互不相同的集合
    let set = new Set()
    Set(array)
    add
    get
    has
    clear
    size
*/
let set = new Set()
console.log(set)
set.add('s','name')//一次add操作只能添加一个值
console.log(set)
/* 不会添加重复的数据 */
set.add('s')
console.log(set)
let arr = [1,2,['a','b']]
let set2 = new Set(arr)
console.log(set2)
/* Map容器
    存放多个key-value的集合
    let map = new Map()
    Map(array)
    set
    get
    has
    clear
    size
*/
    let arr2 = [['name','Little'],['age',18]]
    let map = new Map(arr2)
    console.log(map)
    map.set('website','www.littlecontrol.top')
    /* has 方法检测map中是否具有某个key */
    console.log(map.has('name'))
    console.log(map)



