package javaSE.oop.异常;

public class MyException extends Exception {
    //自定义异常
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    //打印异常信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
