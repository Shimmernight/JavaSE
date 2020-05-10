package Thread;

/**
 * 创建线程方法1(不推荐)：
 * 继承Thread类，重写run()方法，调用start开启线程
 */
public class TestThread01 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学多线程---"+i);
        }
    }

    //主线程
    public static void main(String[] args) {
        for (int i = 0; i < 800; i++) {
            System.out.println("我在学习java***"+i);
        }
        new TestThread01().start();
    }

    //两个线程随机运行，由CPU调度
}
