package Thread.state;

public class TestJoin implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("vip插队中...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        // 主线程
        for (int i = 0; i < 200; i++) {
            if (i == 100) {//i<100:随机调度，i>=100:运行指定线程
                thread.join();// 插队
            }
            System.out.println("main" + i);
        }
    }

}