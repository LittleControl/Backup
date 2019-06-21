/**
 * Author: littlecontrol
 * Date: 6/21/19 2:07 PM
 */
package littlecontrol;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * TreeMap中要求key的值必须为同一个类创建的对象
 *
 * */
public class TreeMapTest {
    public static void main(String[] args) {
        /* 自然排序 */
        TreeMap tm = new TreeMap();
        tm.put(new Person("Little",18),100);
        tm.put(new Person("Control",19),99);
        tm.put(new Person("Rain",20),98);
        tm.put(new Person("Sorrow",21),97);
        System.out.println(tm);
        /* 定制排序 */
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if( o1 instanceof Person && o2 instanceof  Person){
                    Person obj1 = (Person)o1;
                    Person obj2 = (Person)o2;
                    return obj1.age - obj2.age;
                } else {
                    throw new RuntimeException("输入的数据类型不匹配!!!");
                }
            }
        };
        TreeMap tm2 = new TreeMap(com);
        tm2.put(new Person("Little",18),100);
        tm2.put(new Person("Control",19),99);
        tm2.put(new Person("Rain",20),98);
        tm2.put(new Person("Sorrow",21),97);
        System.out.println(tm2);
    }
}

class Person implements Comparable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person obj = (Person) o;
            return this.name.compareTo(obj.name);
        } else {
            throw new RuntimeException("输入数据类型不一致!!!");
        }
    }
}