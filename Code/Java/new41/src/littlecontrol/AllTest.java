/**
 * Author: littlecontrol
 * Date: 6/24/19 9:15 AM
 */
package littlecontrol;

import java.util.Iterator;
import java.util.List;

/*
 * 泛型中通配符的使用 <?>
 *   使用了泛型的结构的集合,除了null之外,不可以添加其他元素
 * 带限制字符的通配符
 *   <? extends A> 可以给A的父类赋值,可以被A及A的子类赋值
 *   <? super B>    可以被B及B的子类赋值,可以给B的父类赋值
 * */
public class AllTest {
    public static void main(String[] args) {
        List<?> list1 = null;
        List<String> list2 = null;
        list1.add(null);
//        list1.add(233);
        List<Object> list3 = null;
        List<People> list4 = null;
        List<Man> list5 = null;
        List<? extends People> list6 = null;
        List<? super People> list7 = null;
        /* 被A及A的子类赋值 */
        list6 = list4;
        list6 = list5;
        /* 给A及A的父类赋值 */
//        list4 = list6;    //不可以给A类赋值
        list1 = list6;
        /*  */
        list7 = list3;
        list7 = list4;
//        list4 = list7;
//        list5 = list7;
//        list3 = list7;

    }

    /* 通配符的应用 */
    public void print(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class People {

}

class Man extends People {

}
