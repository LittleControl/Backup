/**
 * Author: littlecontrol
 * Date: 6/12/19 5:27 PM
 */
/*
* JDK5.0之前
* 自定义一个枚举类
*
*
*
* */
public class DiyEnum {
    public static void main(String[] args) {
        MyEnum autumn = MyEnum.AUTUMN;
        System.out.println(autumn);
    }
}

class MyEnum {
    private final String seasonname;
    private final String seasonchar;

    private MyEnum(String seasonname,String seasonchar){
        this.seasonname = seasonname;
        this.seasonchar = seasonchar;
    }

    @Override
    public String toString() {
        return "MyEnum{" +
                "seasonname='" + seasonname + '\'' +
                ", seasonchar='" + seasonchar + '\'' +
                '}';
    }

    public static final MyEnum SPRING = new MyEnum("春天","万物复苏");
    public static final MyEnum SUMMER = new MyEnum("夏天","骄阳似火");
    public static final MyEnum AUTUMN = new MyEnum("秋天","天高气爽");
    public static final MyEnum WINTER = new MyEnum("冬天","银装素裹");
}
