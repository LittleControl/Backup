/* 似乎现在还不支持do表达式,我目前的这个Node */
function fn() {
    return 5
}
let x = do {
    let t = fn();
    t * t + 5;
};
console.log(x)
