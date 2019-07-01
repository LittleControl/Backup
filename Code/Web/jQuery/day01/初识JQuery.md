# 初识JQuery

## 关于JQuery的版本

JQuery1.x兼容IE678,所以一般大公司的网站用的都是JQuery1.x

## 关于JQuery的入口函数

JQuery的入口函数写法

```JavaScript
$(document).ready(function(){

})
```

### 原生JS与JQuery入口函数的加载规则

- 原生JS会等到DOM元素加载完毕,并且图片也加载完毕才会执行
- JQuery会等到DOM元素加载完毕,但是不会等待图片也加载完毕就会执行,故,该入口函数一般获取不到元素的width和height

### JQuery的入口函数可以有多个入口函数,且会依次执行,但是原生JS只能有一个入口函数,有多个的话,后面的会覆盖前面的

### 入口函数的几种写法

```JavaScript
/* First */
$(document).ready(function(){})
/* Second */
jQuery(document).ready(funcion(){})
/* Third */
$(function(){})
/* Fourth */
jQuery(function(){})
```
