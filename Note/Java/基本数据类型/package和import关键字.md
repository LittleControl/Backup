# package和import关键字的使用

## package

- 一个`.`表示一级目录
- 同一个包里不可以有同名的类
- 不同的包可以有同名的类

## import

- 使用"*"表示当前目录下的所有结构
- 同一个包的类不用导入
- 同一个包的子包的类仍然需要导入
- 如果从不同的包里导入了同名的类，则至少有一个类需要使用全类名声明使用
- 对于java.lang里的类不用导入，直接使用即可