import java.util.Comparator;
import java.util.TreeSet;

/**
 * Author: littlecontrol
 * Date: 6/19/19 8:26 PM
 */

public class TreeSetTest3 {
    public static void main(String[] args) {
        Employee em1 = new Employee("Jack", 19, new MyDate(2019, 5, 21));
        Employee em2 = new Employee("Mark", 20, new MyDate(2018, 5, 21));
        Employee em3 = new Employee("Jerry", 17, new MyDate(2019, 8, 21));
        Employee em4 = new Employee("Lose", 21, new MyDate(2017, 5, 20));
        Employee em5 = new Employee("Okay", 23, new MyDate(2000, 3, 23));
        /* 自然排序,正常按照重写的compareTo方法排序,即按照name排序 */
        TreeSet treeSet = new TreeSet();
        treeSet.add(em1);
        treeSet.add(em2);
        treeSet.add(em3);
        treeSet.add(em4);
        treeSet.add(em5);
        System.out.println(treeSet);
        /* 定制排序,按照生日的大小排序 */
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee obj1 = (Employee)o1;
                    Employee obj2 = (Employee)o2;
                    if(obj1.getBirthday().getYear() != obj2.getBirthday().getYear()){
                        return obj1.getBirthday().getYear() - obj2.getBirthday().getYear();
                    } else if (obj1.getBirthday().getMonth() != obj2.getBirthday().getMonth()) {
                        return obj1.getBirthday().getMonth() - obj2.getBirthday().getMonth();
                    } else {
                        return obj1.getBirthday().getDay() - obj2.getBirthday().getDay();
                    }
                } else {
                    throw  new RuntimeException("输入的输入数据类型不匹配!!!");
                }
            }
        };
        TreeSet treeSet1 = new TreeSet(com);
        treeSet1.add(em1);
        treeSet1.add(em2);
        treeSet1.add(em3);
        treeSet1.add(em4);
        treeSet1.add(em5);
        System.out.println(treeSet1);

    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                year + "." +
                month +
                "." + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee obj = (Employee) o;
            return this.name.compareTo(obj.name);
        } else {
            throw new RuntimeException("输入的数据类型不匹配!!!");
        }
    }
}
