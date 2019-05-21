# 选择throws还是try-catch-finally

## 一个小知识点

- 子类的`throws`的异常类型不能大于父类的`throws`类型(多态性的语法要求)

## 两个基本原则

- 如若父类没有`throws`,则子类只能用`try-catch-finally`解决异常
- 假设方法a中调用了三个方法,且这个三个方法是层层递进的关系,我们建议三个方法都用`throws`
  在a方法中可以考虑用`try-catch-finally`