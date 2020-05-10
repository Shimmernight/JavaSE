package Thread.state;

import java.sql.Date;
import java.text.SimpleDateFormat;

//模拟网络延时
//做倒计时
class TestSleep {
    public static void main(String[] args) {
        // 打印系统当前时间
        Date startDate = new Date(System.currentTimeMillis());

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startDate));
                startDate = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    //模拟倒计时
    public static void timeDown(int num) throws InterruptedException {
        while(true){
            Thread.sleep(1000);//1000毫秒等于1秒
            System.out.println(num--);
            if(num<=0){
                break;
            }
        }
    }
}