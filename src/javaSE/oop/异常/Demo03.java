package javaSE.oop.异常;

public class Demo03 {
    //throws方法异常向上抛出
    //抛出后，在调用处用try-catch捕获异常

    public void test (int a,int b)throws Exception{//向上抛出异常
        System.out.println(a/b);
    }

    public static void main(String[] args) {

        //调用时，捕获异常
        try {
            new Demo03().test(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
