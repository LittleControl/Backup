/**
 * Author: littlecontrol
 * Date: 6/12/19 5:44 PM
 */
/*
* JDK5.0以后
* 使用enum创建枚举类
*
* */
public class EnumTest {
    public static void main(String[] args) {
        MySeason spring = MySeason.SPRING;
        System.out.println(spring);
        System.out.println(MySeason.class.getSuperclass());
    }
}
enum MySeason{
    SPRING("春天","万物复苏"),
    SUMMER("夏天","骄阳似火"),
    AUTUMN("秋天","天高气爽"),
    WINTER("冬天","银装素裹");
    private final String seasonname;
    private final String seasonchar;

    private MySeason(String seasonname,String seasonchar){
        this.seasonname = seasonname;
        this.seasonchar = seasonchar;
    }

//    @Override
//    public String toString() {
//        return "MySeason{" +
//                "seasonname='" + seasonname + '\'' +
//                ", seasonchar='" + seasonchar + '\'' +
//                '}';
//    }

}
