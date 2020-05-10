package Thread;

/**
 * @静态代理 以结婚为例
 * 我：结婚，真实对象
 * 婚庆公司：代理对象
 * <p>
 * 总结：
 * 真实对象和代理对象要实现同一个接口
 * 代理对象要代理真实对象
 * <p>
 * 好处：
 * 代理对象可以做真实对象做不了的事
 * 真实对象能专注做自己的事情
 */
public class StaticProxy {
    public static void main(String[] args) {
        I me = new I();//真实对象

        new Thread(() -> System.out.println("我爱你")).start();

        new MarryCompany(me).HappyMarry();
    }
}

interface Marry {
    void HappyMarry();
}

class I implements Marry {

    @Override
    public void HappyMarry() {
        System.out.println("我结婚啦");
    }
}

class MarryCompany implements Marry {//实现同一个接口
    Marry client;

    public MarryCompany(Marry client) {
        this.client = client;
    }

    @Override
    public void HappyMarry() {
        after();
        this.client.HappyMarry();//代理真实对象
        before();
    }

    private void before() {
        System.out.println("婚礼结束，收尾款");
    }

    private void after() {
        System.out.println("布置现场，办婚礼");
    }
}

