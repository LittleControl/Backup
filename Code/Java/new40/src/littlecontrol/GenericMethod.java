/**
 * Author: littlecontrol
 * Date: 6/23/19 8:17 PM
 */
package littlecontrol;

/*
 * 泛型方法是指方法中含有与类无关的泛型结构
 * 也就是说,泛型方法是针对与方法本身而言的,不是针对于类的,即方法所属的类是泛型类或者非泛型类都可以
 * 注意!!! 泛型方法是可以声明诶静态的
 * 理论上,只要方法中不具有与类相关的结构,都可以声明为泛型,昨天提到的泛型类的方法中因为包含了所属类的泛型结构,所以不能声明为静态的
 *
 * */
public class GenericMethod {
    public static void main(String[] args) {
        Man.Nothing(new Integer[]{1,2,3,4});
    }
}

class Man<E> {
    String name;
    int age;
    E gen;

    public void getAll() {
        System.out.print(name + " " + age + " " + gen);
    }

    public Man(String name, int age, E gen) {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }
    public static <T> void Nothing(T[] arr){
        for(T each : arr){
            System.out.println(each);
        }
    }
}
