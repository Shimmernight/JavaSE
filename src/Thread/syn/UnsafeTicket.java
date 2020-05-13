package Thread.syn;

//不安全的抢火车票
public class UnsafeTicket {

    static int ticketNum = 10;
    static boolean flag = true;

    public static void main(String[] args) {
        Person person = new Person();
        new Thread(person, "我").start();
        new Thread(person, "你").start();
        new Thread(person, "他").start();
    }

    static class Person implements Runnable {

        @Override
        public void run() {
            while (flag) {
                buy();
            }
        }

        //给方法加锁
        private synchronized void  buy() {
            // 判断是否有票
            if (ticketNum <= 0) {
                flag = false;
                return;
            }
            // 模拟延时
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 抢票
            System.out.println(Thread.currentThread().getName() + ticketNum--);
        }
    }
}
