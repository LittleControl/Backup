/**
 * Author: littlecontrol
 * Date: 6/12/19 6:01 PM
 */
/*
* Enum类的常用方法
* values        返回该一个数组,包含该枚举类的所有示例
* valueOf       返回一个指定名称的枚举类实例,若该实例不存在,则抛异常
* toString      返回当前枚举类示例的名字
* 实现接口的有关知识点
*   1.为所有的示例都重写一个方法
*   2.单独为每个示例重写方法
*
* */
public class EnumTest2 {
    public static void main(String[] args) {
        MySeason1 spring = MySeason1.SPRING;
        System.out.println(MySeason1.class.getSuperclass());
        MySeason1[] values = MySeason1.values();
        for(MySeason1 each : values){
            System.out.println(each);
        }
        MySeason1 spring1 = MySeason1.valueOf("SPRING");
        System.out.println(spring1);
        spring1.show();


    }
}
interface Test{
    void show();
}
enum MySeason1 implements Test{
    SPRING("春天","万物复苏"){
        @Override
        public void show() {
            System.out.println("我是春天呀");
        }
    },
    SUMMER("夏天","骄阳似火"){
        @Override
        public void show() {
            System.out.println("我是夏天呀");
        }
    },
    AUTUMN("秋天","天高气爽"){
        @Override
        public void show() {
            System.out.println("我是秋天呀");
        }
    },
    WINTER("冬天","银装素裹"){
        @Override
        public void show() {
            System.out.println("我是冬天呀");
        }
    };
    private final String seasonname;
    private final String seasonchar;

    private MySeason1(String seasonname,String seasonchar){
        this.seasonname = seasonname;
        this.seasonchar = seasonchar;
    }

//    @Override
//    public void show() {
//        System.out.println("Nothing to do !");
//    }
}
