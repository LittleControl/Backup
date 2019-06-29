/**
 * Author: littlecontrol
 * Date: 6/29/19 9:47 AM
 */
package littlecontrol;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
 * 对象流
 * 序列化与反序列化
 *  - 不能序列化static和transient修饰的变量
 *  - 自定义类实现序列化除了实现Serializable接口为还有一下两点要求
 *      - 手动显示声明static final long serialVersionUID = 42L;
 *      - 该类的所有属性或方法也必须是可序列化的
 * */
public class ObjectStreamTest {
    /* 反序列化过程 */
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("new45/object.no"));
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /* 序列化过程 */
/*
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("new45/object.no"));
            oos.writeObject(new Person("LittleControl",19));
            oos.writeObject(new Person("RainSorrow",21));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
*/
}
class Person implements Serializable{
    static final long serialVersionUID = 23333L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
