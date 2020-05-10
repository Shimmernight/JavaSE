package Thread;

/**
 * 创建线程方法2(推荐)： 实现Runnable,重写run()方法，通过new Thread(实现类).start调用
 * 优点：避免javaSE.oop单继承局限性
 */
public class TestThread03 implements Runnable {
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学多线程---" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看电影***" + i);
        }
        TestThread03 t3 = new TestThread03();
        new Thread(t3).start();
    }

}
