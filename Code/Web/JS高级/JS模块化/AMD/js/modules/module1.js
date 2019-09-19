define([], function () {
    let name = 'LittleControl'
    function getName() {
        return name
        //注意,这里不可以使用 return this.name,否则会出现一些奇奇怪怪的BUG
    }
    return {getName}
});