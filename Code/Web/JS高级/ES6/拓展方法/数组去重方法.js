function checkType(obj) {
    return Object.prototype.toString.call(obj).slice(8, -1)
}
function checkArray(arr) {
    if (checkType(arr) != 'Array') {
        return arr
    } else {
        let set = new Set(arr)
        let newArr = []
        for (let i of set) {
            newArr.push(i)
        }
        return newArr
    }
}

let str = 'Nothing'
str = checkArray(str)
console.log(str)
let arr = [1, 2, 3, 3, 2, 1]
arr = checkArray(arr)
console.log(arr)
