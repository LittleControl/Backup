let A = function () { }
A.prototype.n = 1
let b = new A()
A.prototype = {
    n: 2,
    m: 3
}
let c = new A()
console.log(b.n, b.m, c.n, c.m) //1, undefined, 2, 3

let F = function () { }
Object.prototype.a = () => {
    console.log('a()...')
}
Function.prototype.b = () => {
    console.log('b()...')
}
let f = new F()
f.a()
// f.b()        //报错
F.a()
F.b()
