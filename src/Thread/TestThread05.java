package Thread;

/**
 * 龟兔赛跑
 */
public class TestThread05 implements Runnable {
    String winner;
    @Override
    public void run() {
        for (int i = 0; ; i++) {
            if (gameOver(i)) { break; }
            if (Thread.currentThread().getName().equals("兔子")){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }
    //比赛结束
    private boolean gameOver(int step) {
        if (winner!=null){
            return true;
        } else if (step == 100) {
            winner = Thread.currentThread().getName();
            System.out.println("Winner is " + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TestThread05 race = new TestThread05();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }

}
