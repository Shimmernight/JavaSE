package Thread.state;

//TODO设置守护线程
//虚拟机不管守护线程是否在运行
public class TestDaemon {
    public static void main(String[] args) {
        Thread God = new Thread(() -> {
            while (true) {
                System.out.println("上帝守护你");
            }
        });
        God.setDaemon(true);// 设置守护线程
        God.start();

        You you = new You();
        new Thread(you).start();//用户线程
    }

    // 你
    static class You implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 365; i++) {
                System.out.println("你每天开心的活着");
            }
            System.out.println("你死了");
        }
    }
}