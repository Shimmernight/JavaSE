package javaSE.oop.构造器;

public class Person {
    public String name;

    //一个类即使什么都不写，也会自动生成构造器

    //用于初始化对象
    /*public Person(){
        this.name = "张三";
    }*/

    public Person() {}

    //有参构造器
    //写了有参构造器后，必须显式写出无参构造器！
    public Person(String a){
        this.name = a;
    }

    //快捷键：alt+insert，constructor
    //快捷生成构造器

}

