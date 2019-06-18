/**
 * Author: littlecontrol
 * Date: 6/18/19 7:56 AM
 */
package littlecontrol;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Collection的三个实现类
 *   ArrayList 底层用数组实现 线程不安全,效率高
 *   LinkedList  底层用双向链表实现 对于需要大量增加和删除数据的集合常用此实现类
 *   Vector  底层用数组实现,线程安全,效率低
 *
 *   ArrayList
 *       JDK 7 类似于单例模式的饿汉式,创建时就分配了10个数组空间
 *       JDK 8 类似于单利模式的懒汉式,只有在add()时才会申请空间
 *       建议是:对于大致需要多少空间的,最好使用带参数的构造器
 *
 *
 *
 * List的常用方法
 *   void add(int index,Collection ele)//在指定位置插入一个元素
 *   void addAll(int index,Collection else)//在指定位置插入另一个几集合的所有元素
 *   Object get(int index)//返回指定位置的元素
 *   int indexOf(Object obj)//返回指定元素首次在集合中的位置,没有则返回-1
 *   int lastIndexOf(Object obj)//返回指定对象在集合中最后出现的位置
 *   Object remove(int index)//删除指定索引位置的元素
 *   Object set(int index,Object ele)//修改指定索引位置的元素
 *   List subList(int fromIndex,int toIndex)//返回从fromIndex到toIndex的子集合,左闭右开区间
 *
 * */
public class CollectionTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("LittleControl");
        list.add(false);
        System.out.println(list);
        list.add(1, 456);
        System.out.println(list);
        List list1 = list.subList(0, 1);
        System.out.println(list1);
        System.out.println("$$$$$$$$$$");
        /* 遍历List的方法 */
        //方法一 使用Iterator迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***********");
        //方法二,增强for循环
        for (Object each : list) {
            System.out.println(each);
        }
        System.out.println("############");
        //方法三,普通遍历方法
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /* 一个有关remove的小知识点 */
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        removeList(list2);
        System.out.println(list2);
    }
    public static void removeList(List list){
        /*
        * 因为List有两个remove方法
        * remove(Object obj)//Collection的方法
        * remove(int index)//List的方法
        * 对于remove(2),因为2你不知道是一个obj还是一个index,会默认认为是index(似乎是优先调用子类的方法)
        * 如果想要删除值为2而不是索引为2的元素,可以这么写
        * remove(new Integer(2))(但是new Integer()方法已经被弃用了,这个就有点搞不懂了,目前还没有想到好的解决方法)
        *
        * */
        list.remove(new Integer(2));
//        list.remove(2);
    }
}

