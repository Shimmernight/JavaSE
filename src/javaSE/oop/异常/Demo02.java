package javaSE.oop.异常;

public class Demo02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //throw可以抛出异常
        if (b==0){
            throw new ArithmeticException();
        }

        System.out.println(a/b);
    }
}
