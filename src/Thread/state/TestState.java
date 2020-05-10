package Thread.state;

//TODO观察线程状态
public class TestState {
    static Thread.State state;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("///////");
        });
        getState(thread);

        thread.start();
        getState(thread);

        while (state != Thread.State.TERMINATED) {// 未结束
            try {
                Thread.sleep(500);//每500毫秒更新状态
                getState(thread);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getState(Thread thread) {
        // 获取线程状态
        state = thread.getState();
       System.out.println(state); //NEW
    }
}