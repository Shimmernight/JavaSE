package Thread;

/**
 * 多个线程操作同一个对象
 * 买火车票
 *
 * 问题：同时操作一个资源时，不安全，数据紊乱。
 */
public class TestThread04 implements Runnable{
    //票数
    int ticketNum = 10;
    @Override
    public void run() {
        while (ticketNum != 0) {
            System.out.println(Thread.currentThread().getName() + "拿到第" + ticketNum-- + "张票");
            //模拟延时
            try {
                Thread.sleep(200);//0.2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread04 t1 = new TestThread04();
        TestThread04 t2 = new TestThread04();
        TestThread04 t3 = new TestThread04();
        new Thread(t1,"小明").start();
        new Thread(t2,"老师").start();
        new Thread(t3,"黄牛党").start();
    }
}
