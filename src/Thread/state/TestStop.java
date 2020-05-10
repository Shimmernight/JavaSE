package Thread.state;

/*TODO结束线程
   1.建议线程正常停止 --> 利用次数，不建议死循环
   2.建议使用标志位 --> 设置一个标志
   3.不要使用stop或者destroy等JDK不建议的方法
*/
public class TestStop implements Runnable {

    // 1.设置一个标志位
    boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run Thread..." + i++);
        }
    }

    // 2.设置公共的stop方法
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop test = new TestStop();
        new Thread(test).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            // 3.调用线程方法，让线程停止
            if (i == 900) {
                test.stop();
                System.out.println("线程停止！");
            }
        }
    }

}