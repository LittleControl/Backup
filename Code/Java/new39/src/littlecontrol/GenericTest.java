/**
 * Author: littlecontrol
 * Date: 6/22/19 9:23 AM
 */
package littlecontrol;

import java.util.*;

/*
*
* 集合中泛型的基本使用
*   使用泛型的好处
*       1. 添加数据时就进行了类型检查,防止装入脏数据
*       2. 避免了强制类型转换,进而避免了ClassCastException异常
*
*
* */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(258);
//        list.add("Tom");  //尝试添加其他类型数据时会报错
        list.add(789);
        for(Integer each : list){
            System.out.println(each);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"little");
        map.put(2,"Control");
//        map.put("Top",3); //类型不匹配时会报错
        map.put(3,".top");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, String> next = iterator1.next();
            Integer key = next.getKey();
            String value = next.getValue();
//            System.out.println(key+"--->>>"+value);
            System.out.print(value);
        }
    }
}
