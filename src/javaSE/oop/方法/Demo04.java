package javaSE.oop.方法;

//引用传递：对象，本质还是值传递
public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person();//实例化
        System.out.println(person.name);
        change(person);
        System.out.println(person.name);
    }

    private static void change(Person person) {
        person.name = "javaSE/zxl";
    }

}

//定义一个Person类
class Person{
    String name;//null
}