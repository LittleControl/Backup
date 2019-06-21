/**
 * Author: littlecontrol
 * Date: 6/21/19 12:27 PM
 */
package littlecontrol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map中的常用方法
* put
* putAll
* remove(key)
* clear
* get
* containsKey
* containsValue
* size
* isEmpty
* equals
* ========================元视图(遍历一个Map)
* keySet    //返回此map中所有key的一个set集合
* values    //返回此map中所有value的一个set集合
* entrySet  //返回此map中entry类型的一个set
*
*
* */
public class MapTest1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(123,"Little");
        map.put("Little",123);
        map.put(false,true);
        System.out.println(map);
        Map map2 = new HashMap();
        map2.put("Control","Nothing");
        map2.put("Nothing","Control");
        map.putAll(map2);
        map.putAll(map);//似乎不能我put我自己
        map.remove("Little");
//        map.clear();
        Set set1 = map.keySet();
        System.out.println(map.get("Control"));
        Collection values = map.values();
        System.out.println(values);
        Set set = map.entrySet();
        System.out.println(set1);
        System.out.println(set);
        System.out.println(map);
    }
}
