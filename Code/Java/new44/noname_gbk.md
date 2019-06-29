# �й�������һЩ�ʼ�����

## �������������

1. ������������ķ�������������Ĭ�ϵ������

    ```Java
    package top.littlecontrol;

    public class NoName {
        public static void main(String[] args) {
            Ab2 ab2=new Ab2();
            ab2.sayName();//��
        }
    }
    abstract class Ab1{
        String name="��";
        abstract void sayName();
    }
    class Ab2 extends Ab1{

        @Override
        void sayName() {
            // TODO Auto-generated method stub
            System.out.println(this.name);
        }
    }
    ```

2. ���������������������

    ```Java
        new Ab2().sayName();//��
    ```

3. ����������ķ���������

    ```Java
    Ab1 ab1=new Ab1() {
        @Override
        void sayName() {
            // TODO Auto-generated method stub
            System.out.println(this.name);
        }
    };
    ab1.sayName();//��
    ```

4. �������������������

    ```Java
    new Ab1() {
        @Override
        void sayName() {
            // TODO Auto-generated method stub
            System.out.println(this.name);
        }
    }.sayName();//��
    ```

## �ӿ��������

1. �������ӿڵķ���������

    ```Java
    package top.littlecontrol;
    public class NoName_interface {
        public static void main(String[] args) {
            Name n1=new ExName();
            n1.sayName();
        }
    }
    interface Name{
        String name="��";
        void sayName();
    }
    interface Age extends Name{
        int age=18;
        void sayAge();
    }
    class ExName implements Name,Age{

        @Override
        public void sayName() {
            System.out.println(name);
        }

        @Override
        public void sayAge() {
            System.out.println(age);
        }
    }
    ```

2. �������ӿڵ���������

    ```Java
    new Name() {
        @Override
        public void sayName() {
            System.out.println(name);
        }
    }.sayName();
    ```

3. �����ӿڵķ���������

    ```Java
    Age a1=new Age() {
        @Override
        public void sayName() {
            System.out.println(name);
        }
        @Override
        public void sayAge() {
            System.out.println(age);
        }
    };
    a1.sayName();//��
    a1.sayAge();//18
    ```

4. �����ӿڵ���������

    ```Java
    new Age() {//�����ӿڵ���������
        @Override
        public void sayName() {
            System.out.println(name);
        }
        @Override
        public void sayAge() {
            System.out.println(age);
        }
    }.sayName();//��
    ```
