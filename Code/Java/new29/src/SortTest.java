import java.util.Arrays;

/**
 * Author: littlecontrol
 * Date: 6/9/19 12:15 PM
 */

/*
 * 关于comparable(自然排序)
 *  要求某个类实现Comparable接口,这样就可以使用Arrays.sort()方法进行排序
 *
 * */
public class SortTest {
    public static void main(String[] args) {
        MyObj[] arr = new MyObj[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new MyObj();
        }
        arr[0].price = 10;
        arr[1].price = 30;
        arr[2].price = 20;
        arr[3].price = 15;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class MyObj implements Comparable {
    int price;

    @Override
    public String toString() {
        return "MyObj{" +
                "price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof MyObj) {
            MyObj obj = (MyObj) o;
            return this.price - obj.price;
        }
        throw new RuntimeException("输入格式有误!");
    }
}
