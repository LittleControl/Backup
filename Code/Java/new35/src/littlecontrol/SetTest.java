/**
 * Author: littlecontrol
 * Date: 6/18/19 7:33 PM
 */
package littlecontrol;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* Set集合示例   无序的,不可重复的数据
*   无序性:是指元素在存储空间上的无序性,并不是指按照添加的顺序
*   不可重复性: 指调用元素的equals方法返回值不为true的情况
*   hashSet     hashSet实现类没有提供额外的方法
*       在底层是会首先创建一个长度为16的数组(JDK7为饿汉式,JDK8为懒汉式)
*       linkedHashSet
*       hashSet的add方法的操作过程
*           当执行add方法时,会先按照某种算法计算出元素在在底层数组的存储位置.
*               若该位置为空,则元素添加成功
*               若元素不为空,则判断该位置元素(或链表)的hash值与待增元素的hash值
*               若hash值不相同,则元素添加成功
*               若hash值不同,则调用待添加元素的equals方法
*                   返回false,则添加成功
*                   返回true,则添加失败
*           对于元素不为空的添加成功的情况,
*               在JDK7中,由带添加元素指向已有元素
*               在JDK8中,由已有元素指向带添加元素
*               (七上八下)
*   对于使用hashSet存储的对象,要求其所在类重写equals和hashCode方法,并要尽可能的保持一致性,即:相等的对象具有相等的散列值
*   重写equals方法和hashCode的小技巧,在对象的equals方法中用作比较的属性或值,也应在hashCode方法中用到
*   treeSet
*       treeSet集合中只能存放相同类型的数据
*           treeSet中不能存放相同的数据,用来比较的方法是compareTo
*           某种意义上,treeSet中存放的数据,需要实现Comparable接口
*           treeSet存放数据的数据结构是红黑树
*
*
* */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add("LittleControl");
        set.add(false);
        set.add("LittleControl");
        System.out.println(set);
        Set set2 = new LinkedHashSet();
        set2.add(123);
        set2.add("LittleControl");
        set2.add(false);
        System.out.println(set2);

    }
}
