package Thread.state;

//TODO设置线程优先级
//优先级只是线程被CPU调度的概率大小
public class TestPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " -> "
        + Thread.currentThread().getPriority());
        MyPriority myPriority = new MyPriority();
        Thread t0 = new Thread(myPriority);
        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);

        //先设置优先级，再启动
        t0.setPriority(3);
        t0.start();

        t1.setPriority(8);
        t1.start();

        t2.setPriority(5);
        t2.start();

        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
    }


    static class MyPriority implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "->" 
            + Thread.currentThread().getPriority());
        }

    }
}