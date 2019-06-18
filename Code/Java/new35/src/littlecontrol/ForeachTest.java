/**
 * Author: littlecontrol
 * Date: 6/18/19 8:26 AM
 */
package littlecontrol;

import java.util.ArrayList;
import java.util.Collection;

/*
* foreach循环,或者称为增强for循环
*   foreach只是遍历一个数组或者集合
*   底层应用的仍然是迭代器Iterator
*   在foreach里不能对元素进行修改
*
* */
public class ForeachTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("LittleControl");
        coll.add(true);
        for(Object each : coll){
            System.out.println(each);

        }
    }
}
