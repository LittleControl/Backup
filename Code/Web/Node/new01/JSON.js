var obj={
    name:"LittleControl",
    age:18,
    saying:"Nothing To Do But Love !"
}
console.log(typeof obj)
console.log(obj);
obj=JSON.stringify(obj);
console.log(typeof obj)
console.log(obj)
console.log(JSON.parse(obj))