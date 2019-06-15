/**
 * Author: littlecontrol
 * Date: 6/14/19 6:22 PM
 */
package littlecontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
* 容器的两种分类
* Collection集合    (类似数组)
*   -List   可以装有序,可重复的对象
*   -Set    可以装无序,不可重复的对象(类似高中数学的集合)
*
* Map映射   键值对构成(key->value)
*
*
* */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll  = new ArrayList();
        /* add(Object e) */
        coll.add("AA");
        coll.add(123);//自动装箱
        coll.add(new Date());
        /* size() 返回集合中元素个数 */
        System.out.println(coll.size());
        System.out.println(coll);
        Collection coll2 = new ArrayList();
        coll2.add("BB");
        coll2.add(true);
        /* addAll(Collection C) 集合C中的元素全部加入该集合中 */
        coll.addAll(coll2);
        coll.add(coll2);
        System.out.println(coll.size());
        System.out.println(coll);
        /* isEmpty() 判断集合的size()是否为0 */
        System.out.println(coll.isEmpty());
        /* clear() 清空集合中的所有元素 */
        coll.clear();
        System.out.println(coll.isEmpty());
    }
}
