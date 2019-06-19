import java.util.Comparator;
import java.util.TreeSet;

/**
 * Author: littlecontrol
 * Date: 6/19/19 8:08 PM
 */
/*
* TreeSet 只能存放相同数据类型的数据
* 比较数据用是实现了Comparable接口的对象的compareTo方法
*
* 当TreeSetnew的时候为空参构造器,则排序默认使用存储对象的实现的compareTo方法,即自然排序
* 当使用带参数的构造器时,可以传入一个Comparator的实现类,从而使TreeSet对象按照此实现类的重写的compare方法排序,即定制排序
*
* */
public class TreeSetTest2 {
    public static void main(String[] args) {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person obj1 = (Person) o1;
                    Person obj2 = (Person) o2;
                    return obj1.age - obj2.age;
                } else {
                    throw new RuntimeException("输入的类型有误");
                }
            }
        };
        TreeSet ts1 = new TreeSet(com);
        ts1.add(new Person("Mark",19));
        ts1.add(new Person("Jack",19));
        ts1.add(new Person("Jack",21));
        ts1.add(new Person("Alice",18));
        System.out.println(ts1);
    }
}
class Person implements Comparable{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person obj = (Person)o;
            return this.name.compareTo(obj.name);
        } else {
            throw new RuntimeException("输入的类型有误!!!");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
