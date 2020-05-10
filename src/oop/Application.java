package oop;

import javaSE.oop.异常.MyException;

public class Application {
    //2.继续向上抛出
    public void test(int a) throws MyException {
        System.out.println("输入的参数为："+a);
        //1.如果大于10，抛出异常
        if(a>10){
            throw new MyException(a);
        }else{
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {
        //3.调用时，try-catch捕获异常
        try {
            new Application().test(11);
        } catch (MyException e) {
            System.out.println("MyException==>"+e);
        }

    }
}
