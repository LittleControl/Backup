/**
 * Author: littlecontrol
 * Date: 6/21/19 2:46 PM
 */
package littlecontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Collections工具类的常用方法
 *
 * reverse(List) 反转List中元素的顺序
 * shuffle(List) 对List中的集合元素进行随机排序
 * sort(List)    根据元素的自然排序对指定 List和元素按升序排序
 * sort(List,Comparator) 根据指定的Comparator产生的顺序对List集合元素进行排序
 * swap(List,int i,int j)    将指定List集合中的i处元素和j处元素进行交换
 *
 * Object max(Collection)            //根据自然排序返回最大值
 * Object max(Collection,Comparator) //根据定制排序返回最大值
 * Object min(Collection)            //根据自然排序返回最小值
 * Object min(Collection,Comparator) //根据定制排序返回最小值
 * int frequency(Collection,Object)  //返回指定集合中指定元素的的出现次数
 * void copy(List dest,int src)      //将src中的内容复制到dest中 要求dest.size() >= src.size(),否则会抛异常
 * boolean replaceAll(List list, Object oldVal,Object newVal)    //使用新值替换List对象的所有旧值
 *
 * Collections.synchronizedCollection()  //将一个Collection变为线程安全的
 *
 *
 * */
public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(145);
        list.add(569);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.shuffle(list);
        System.out.println(list);
        Collections.swap(list, 0, 1);
        System.out.println(list);
        /* 关于copy方法的正确使用 */
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest);
        Collections.copy(dest,list);
        System.out.println(dest);
        /* 或者这样应该也可以吧 */
        List dest2 = new ArrayList();
        System.out.println(dest2);
        for(int i = 0; i < list.size();i++){
            dest2.add(null);
        }
        System.out.println(dest2);
        Collections.copy(dest2,list);
        System.out.println(dest2);
    }
}
