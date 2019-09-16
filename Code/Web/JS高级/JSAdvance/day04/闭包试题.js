/* The First */
var name = 'The Global'
var obj = {
    name: 'The Obj',
    getName: function () {
        return function () {
            return this.name
        }
    }
}
var obj2 = {
    name: 'The Obj',
    getName: function () {
        var that = this
        return function () {
            return that.name
        }
    }
}
console.log(obj.getName()())//The Global 
console.log(obj2.getName()())//The Obj

/* The Second */
function fun(n, o) {
    console.log(o)
    return {
        fun: function (m) {
            return fun(m, n)
        }
    }
}
var a = fun(1)//undefined
/* 
    a = {
            fun: function(m) {
            return fun(m,1)
        }
    }
    a.fun(2) ===>>> fun(2,1)
*/
a.fun(2)//1
a.fun(3)//1
a.fun(4)//1
/* fun(1) ==> fun(2,1) ==> fun(3,2) ==> fun(4,3) */
var b = fun(1).fun(2).fun(3).fun(4)//undefined 1 2 3
var c = fun(1).fun(2)//undefined 1
/* 
    c = {
        fun: function(m) {
            return fun(m,2)
        }
    }
*/
c.fun(3)//2
c.fun(4)//2
