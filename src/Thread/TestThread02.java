package Thread;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 练习多线程，实现多线程同步下载
 * 导包：commons.io
 */
public class TestThread02 implements Runnable{
    private String url;
    private String name;

    public TestThread02( String url,String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader downloader = new WebDownloader();
        downloader.downloader(url,name);
        System.out.println("下载成功："+name);
    }

    public static void main(String[] args) {
        TestThread02 t1 = new TestThread02("http://t8.baidu.com/it/u=3571592872,3353494284&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1587886399&t=773fb2bc38a7f38540808fca3e9fd6da", "1.jpg");
        TestThread02 t2 = new TestThread02("http://t8.baidu.com/it/u=2247852322,986532796&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1587886399&t=26f39f2cda275cc88984f6f540f1e5ee", "2.jpg");
        TestThread02 t3 = new TestThread02("http://t7.baidu.com/it/u=3204887199,3790688592&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1587886399&t=5c0c634b7aca2da157ece5a2e84cecb5", "3.jpg");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }

}

//下载器
class WebDownloader{
    //下载方法
    public void  downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，download方法出现问题");
        }

    }
}