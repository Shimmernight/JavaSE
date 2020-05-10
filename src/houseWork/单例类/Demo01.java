package houseWork.单例类;

//使用目的：想控制实例数目，节省系统资源的时候。
public class Demo01 {
    //1. 构造方法私有化
    private Demo01() {}
    //2. 静态属性指向实例
    private static final Demo01 demo01 = new Demo01();

    //3. public static的 getInstance（）方法，返回第二步的静态属性
    public static Demo01 getInstance(){
        return demo01;
    }

    public static void doSomething(){
    }


}

class Test{
    public static void main(String[] args) {
        //Demo01 demo01 = new Demo01();无法构造对象
        Demo01 demo01 = Demo01.getInstance();
    }
}
