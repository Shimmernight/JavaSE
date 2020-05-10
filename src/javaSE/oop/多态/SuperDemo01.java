package javaSE.oop.多态;

public class SuperDemo01 {
    public static void main(String[] args) {
        new student(20);
    }
}

class Person{
    String name = "李四";
    public Person(int a){
        System.out.println("Person");
    }
}

class student extends Person{
    String name = "张三";
    int age = 0;
    //默认先执行父类构造器
    public student(int age){
        //隐藏方法：super()
        //super();
        super(age);//必须先执行父类的构造函数
        this.put();//调用当前对象的方法
    }
    public void put(){
        System.out.println(this.name);//this:指的是当前对象
        System.out.println(super.name);//super：父类对象
    }

}