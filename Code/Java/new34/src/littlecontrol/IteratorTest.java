/**
 * Author: littlecontrol
 * Date: 6/15/19 11:18 AM
 */
package littlecontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * remove
 * Iterator的remove可以删除集合中的元素,但是如果在next方法之前或者next之后已经掉过一次remove方法时,会抛异常!!!
 * */
public class IteratorTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(true);
        coll.add("LittleControl");
        Iterator iterator = coll.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        /* 错误的使用方法一 */
        //每次调用iterator的next方法都会使指针移动
//        while ((iterator.next() != null)) {
//            System.out.println(iterator.next());
//        }
        /* 错误的使用方法二 */
        //每次调用coll.iterator方法都会生成一个新的iterator对象
//        while (coll.iterator().hasNext()) {
//            System.out.println(coll.iterator().hasNext());
//        }
        while (iterator.hasNext()){
//            iterator.remove();
            Object next = iterator.next();
            System.out.println(next);
            iterator.remove();
//            iterator.remove();
//            if("LittleControl".equals(next)){
//                iterator.remove();
//            }
        }
        System.out.println(coll);
    }
}
