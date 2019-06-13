/**
 * Author: littlecontrol
 * Date: 6/13/19 5:04 PM
 */
/*
* Annoatation(注解的使用)
* JDK5.0之后
*
* 常用的三个注解
*   @Override     重写方法
*   @Desperate    已过时或被弃用
*   @SuppressWarnings 抑制编译检查
* 自定义一个注解@interface
*
* 四种元注解
*   Retention   指定注解的生命周期(SOURCE,CLASS.RUNTIME)只有注解为runtime时才能被反射读取
*   Target      指定注解可以作用的范围{TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE}等
*   Documented  指定注解被javadoc解析时保留下来
*   Inherited   指定子类同时也继承父类的注解
*
* JDK8 新特性
*   可重复注解(Repeatable)
*       1.声明一个注解的注解类
*       2.加入Repeatable关键字以及调整作用域和生命周期
*   类型注解@Target({ElementType.TYPE_USE,ElementType.TYPE_PARAMETER})
*       TYPE_PARMETER   使注解可以用于所有变量类型的声明中
*       TYPE_USE        使注解以用于所有类型的使用中
*
* */
public class AnnotationTest {
    public static void main(String[] args) {
       @SuppressWarnings("unused")
       int num = 0;
//       @MyAnnotation(value = {"control","little"})
       int[] arr = new int[6];
    }
    @MyAnnotation(value = "Little")
    @MyAnnotation(value = "Control")
    public void test(@Nothing int num) throws @Nothing InterruptedException {
        Thread.sleep(30);
    }
}
