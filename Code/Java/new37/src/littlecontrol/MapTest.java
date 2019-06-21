/**
 * Author: littlecontrol
 * Date: 6/20/19 8:07 AM
 */
package littlecontrol;

/*
* Map(映射)   双列数据,存储key-value对数据 ----类似于高中中的函数,应该就是大学中的映射
*   --HashMap   效率高,线程不安全,可以存储值为null的键值对,key和value都可以为null
*       --LinkedHashMap 在HashMap的基础上为每一个键值对加入了一对指针,使得遍历的时候可以按照添加的顺序遍历
*   --TreeMap   保证按照添加的key-value进行排序,实现排序遍历,此此时考虑key的自然排序和定制排序,底层使用红黑树
*   --Hashtable 线程安全,效率低,存储的键值对中不能出现null
*       --propriees 常用作配置文件,key和value都是String
*
*
*   --hashMap的底层: jdk7及以前:数组+链表
*                   jdk8:数组+链表+红黑树
*
* */
public class MapTest {
}
