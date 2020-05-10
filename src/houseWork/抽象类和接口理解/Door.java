package houseWork.抽象类和接口理解;

/**
 * 抽象类：abstract
 * 将具有共同特性的事物抽象出来作为一个类，
 * 子类通过继承这个抽象类获得共同的属性。
 *
 * 抽象方法：
 * 就是将某个类特有的行为(方法)进行抽象
 *
 * 接口：interface
 * 将全局变量和抽象方法当作一种规则抽象出来。
 */
interface Alarm{
    void alarm();//等同于public abstract
}

public abstract class Door {
     void open(){
        System.out.println("开门");
    }
     void close(){
        System.out.println("关门");
    }
    //abstract void alarm();
}

class 消防门 extends Door implements Alarm{
    @Override
    public void alarm() {
        System.out.println("报警");
    }
}

class Test {
    public static void main(String[] args) {
        new 消防门().open();
        new 消防门().close();
        new 消防门().alarm();
    }
}