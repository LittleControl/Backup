# 解决JQuery的冲突问题

说明:因为`$`是JQuery的标识符,但是我们有可能在一个页面中不只引入一个JQuery模块,其他的模块可能也会占用`$`这个符号位,这个就是来说明怎么解决这种问题

- JQuery主动释放`$`的使用权
  在使用JQuery函数之前,调用`JQuery.noConflict()`,这样以后就只能用`JQuery`关键字代替`$`
- 使用自定义的关键词
  在使用JQuery函数之前,调用`var myImp = JQuery.noConflict()`,这样以后就可以使用`myImp`关键字代替`$  
