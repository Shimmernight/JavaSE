package Thread.syn;

//不安全的取钱
class UnsafeBank {
    public static void main(String[] args) {
        Accout mAccout = new Accout(100, "me");
        new Drawing(mAccout, 100, "女朋友").start();
        new Drawing(mAccout, 50, "我").start();
    }
}

// 账户
class Accout {
    int money;
    String name;

    Accout(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

// 取钱
class Drawing extends Thread {
    // 账户
    Accout accout;
    // 取多少钱
    int drawMoney;
    // 手里有多少钱
    int nowMoney;

    Drawing(Accout accout, int drawMoney, String name) {
        super(name);
        this.accout = accout;
        this.drawMoney = drawMoney;
    }

    @Override
    public void run() {
        //创建同步块：synchronized(obj){}
        //obj为同步监视器（需要保护的对象，默认为this）
        synchronized (accout) {
            if (accout.money - drawMoney < 0) {
                System.out.println("抱歉，您的账户余额不足！\n当前余额：" + accout.money);
                return;
            }
            // 放大问题发生性
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            accout.money -= drawMoney;
            nowMoney += drawMoney;
            System.out.println(accout.name + "的账户余额为：" + accout.money);
            System.out.println(this.getName() + "手里有" + nowMoney);
        }

    }
}