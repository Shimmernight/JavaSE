package houseWork.写一个print接口;

interface Printer{
    void print();
}

public class A {
    public static void main(String[] args) {
        Printer printIF = new Printer() {
            @Override
            public void print() {
                System.out.println("hello world");
            }
        };

        printIF.print();
    }
}
