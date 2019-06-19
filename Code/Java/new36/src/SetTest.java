import java.util.HashSet;
import java.util.Objects;

/**
 * Author: littlecontrol
 * Date: 6/19/19 9:17 PM
 */
/*
*
* 有关Set存储方法理解的小练习
*
* */
public class SetTest {
    public static void main(String[] args) {
        People p1 = new People(19,"AA");
        People p2 = new People(20,"BB");
        HashSet set = new HashSet();
        set.add(p1);
        set.add(p2);
        System.out.println(set);//AA,BB
        p1.name = "CC";
        System.out.println(set);//CC,BB
        set.remove(p1);//BB.CC
        System.out.println(set);
        set.add(new People(19,"CC"));
        System.out.println(set);//BB,CC,CC
        set.add(new People(19,"AA"));
        System.out.println(set);//AA,BB,CC,CC
    }
}
class People{
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
