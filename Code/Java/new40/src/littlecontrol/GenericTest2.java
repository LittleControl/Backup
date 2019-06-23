/**
 * Author: littlecontrol
 * Date: 6/23/19 8:50 PM
 */
package littlecontrol;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/*
* 泛型在继承中的表现
* 假设类A是类B的子类,两个泛型结构,G<A>与G<B>之间是不可以直接赋值的,但是A<G>与B<G>可以直接赋值,注意都是子类给父类赋值
* 在有泛型结构的方法中要注意这个问题
* */
public class GenericTest2 {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
//        list1 = list2;// 这样是不可以直接赋值的
        AbstractList<String> list5 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list4 = list3;
        list5 = list3;
    }
}

