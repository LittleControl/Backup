# `abstract`关键字的学习

## `abstract`基本要点

- `abstract`：抽象的
- `abstract`可以用来修饰类和方法`
- `abstract`修饰类不能被实例化，但可以有方法，有构造器
- `abstract`的子类只有将父类（包括间接父类）的所有方法重写后，才可以实例化
- 抽象方法只有声明，没有方法体
- 一个类中如果有抽象方法，那这个了类一定是抽象类，但抽象类中不一定有抽象方法

## 使用`abstract`的注意事项

- `abstract`不能用来修饰属性，构造器等结构
- `abstract`不能用来修饰`private`的方法，final的类，final的方法，静态方法