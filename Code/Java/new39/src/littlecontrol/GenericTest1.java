/**
 * Author: littlecontrol
 * Date: 6/22/19 10:04 AM
 */
package littlecontrol;

/*
* 自定义泛型类,泛型接口,泛型方法及其简单使用
*   自定义泛型类的子类可以继承指定泛型的父类,这时候子类就不再是一个泛型类了,父类有关泛型的方法等在子类中类型都已经确定
*   泛型类没有指定类型时,可以认为是Object类型的,但是不等价
*   基本数据类型不能作为泛型,如需使用基本数据额类型,可以使用基本数据类型的包装类
*   静态方法中不可以使用泛型
*   异常类不能是泛型的
*   如果想要new一个泛型的数组,这样 T[] arr = new T[]{};是错误的,需要这么写 T[] = (T[]) new Object[]{};
*   有关子类继承父类的泛型的问题
*       全部继承.部分继承,擦除,加入自己的泛型
* */
public class GenericTest1 {
    public static void main(String[] args) {
        Person<String> littleControl = new Person<>("LittleControl", 19, "www.littlecontrol.top");
        System.out.println(littleControl);
        Man man = new Man();
        System.out.println(man);
        System.out.println(man.getT1());
    }
}
class Person<T>{
    String name;
    int age;
    T t1;

    public Person() {
//        T[] arr = new T[]{};
        T[] arr = (T[]) new Object[]{};
    }

    public Person(String name, int age, T t1) {
        this.name = name;
        this.age = age;
        this.t1 = t1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", t1=" + t1 +
                '}';
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }
}
class Man extends Person<String>{
    public Man() {
        t1 = "Man";
    }
}
