package javaSE.oop.异常;

//异常就是程序运行时，发生了不被期望的事件，它阻碍了程序的正常运行。
public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //快捷键：选中，ctr+alt+t
        /**
         * try:监控范围
         * catch:捕捉异常
         * finally:等try_catch结束后的后续操作
         */
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            System.out.println("被除数不能为零！");
        }catch (Exception e) {
            System.out.println("Exception");
        }catch (Throwable throwable){           //可以捕获多个异常，必须从小到大！
            System.out.println("Throwable");
        }finally {
            System.out.println("finally");
        }

    }
}
