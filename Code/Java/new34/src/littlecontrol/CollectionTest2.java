/**
 * Author: littlecontrol
 * Date: 6/15/19 10:34 AM
 */
package littlecontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
*   一般要使用集合的方法的自定义类要求重写equals方法
* contains
* containsAll
* remove
* removeAll 两个集合之间的差集
* retainAll 两个集合之间的交集
* boolean equals(obj) 判断集合与obj所含元素是否相同
* 集合--->>>数组 toArray() 返回值为Object
* 数组--->>>集合 Arrays.asList(obj) 将obj转化为一个List实例
*       注意,当obj为一个基本数据类型数组时,该数组会被解析成一个对象,for example
*       List list = Arrays.asList(new int[]{1,2,3}),list实际上这样子的,[[1,2,3]]及,list中只有一个元素
* hasCode   返回该对象的哈希值
* iterator 返回Iterator的示例,用于遍历数组元素
*
* */
public class CollectionTest2 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(true);
        coll.add(new String("LittleControl"));
        Collection coll2 = new ArrayList();
        coll2.add("LittleControl");
        coll2.add(true);
        coll.retainAll(coll2);
//        System.out.println(coll);
        Object[] array = coll.toArray();
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        List<String> list = Arrays.asList(new String[]{"Little", "Control"});
        System.out.println(list);
        List<boolean[]> booleans = Arrays.asList(new boolean[]{true, false});
        System.out.println(booleans.size());
        System.out.println(booleans);
        System.out.println(coll.hashCode());
//        coll.iterator();
    }
}
