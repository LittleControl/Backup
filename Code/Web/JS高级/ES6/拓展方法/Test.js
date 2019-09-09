function checkType(obj) {
    return Object.prototype.toString.call(obj).slice(8, -1)
}
function deepClone(obj) {
    let res
    if (checkType(obj) === 'Array') {
        res = []
    } else if (checkType(obj) === 'Object') {
        res = {}
    } else {
        return obj
    }
    for (let i in obj) {
        let value = obj[i]
        if(checkType(obj[i]) === 'Array' || checkType(obj[i]) === 'Object'){
            res[i] = deepClone(obj[i])
        } else {
            res[i] = value
        }
    }
    return res
}

let arr = [1, 2, [3, 4]]
let arr1 = deepClone(arr)
console.log(arr1)
arr1[2][1] = 7
console.log(arr,arr1)
