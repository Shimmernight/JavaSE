package Thread.state;

class TestYeid{
    public static void main(String[] args) {
        MyYield y1 = new MyYield();
        MyYield y2 = new MyYield();
        new Thread(y1,"a").start();
        new Thread(y2,"b").start();
    }
}

class MyYield implements Runnable{

	@Override
	public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"线程结束");
	}
}