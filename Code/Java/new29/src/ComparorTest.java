import java.util.Arrays;
import java.util.Comparator;

/**
 * Author: littlecontrol
 * Date: 6/9/19 5:12 PM
 */

/*  Compartor(定制排序)的使用 */

/*
 * Comparable接口与Comparator接口的区别与联系
 * 相同点: 都是用来排序的(emmm...)
 * 不同之处:
 *   Comparable常常是永久性排序的,在任何地方都可以使用
 *   Comparator常常用于临时按照某个特定要求排序
 *
 * */
public class ComparorTest {
    public static void main(String[] args) {
        TestClass[] tc = new TestClass[5];
        tc[0] = new TestClass(25, "Little");
        tc[1] = new TestClass(25, "Control");
        tc[2] = new TestClass(35, "Little");
        tc[3] = new TestClass(45, "Control");
        tc[4] = new TestClass(50, "Nothing");
        Arrays.sort(tc, new MyCompareor());
        System.out.println(Arrays.toString(tc));
    }
}

class TestClass {
    int price;
    String name;

    public TestClass(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

class MyCompareor implements Comparator {

    /* 先按照价格排序,再按照名称排序 */
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof TestClass && o2 instanceof TestClass) {
            TestClass obj1 = (TestClass) o1;
            TestClass obj2 = (TestClass) o2;
            if (obj1.price == obj2.price) {
                return obj1.name.compareTo(obj2.name);
            } else {
                return obj1.price - obj2.price;
            }
        }
        throw new RuntimeException("输入类型有误!");
    }
}
