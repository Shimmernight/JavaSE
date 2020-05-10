package Thread.Lambda;

/**
 * Lambda表达式 JDK1.8出现 利用Lambda表达式简化代码
 */

interface Happy {// 函数式接口（只有一个方法）
    public abstract void Say();
}

// 1.通过外部类实现
class toHappy implements Happy {
    @Override
    public void Say() {
        System.out.println("Hello,Lambda!");
    }
}

public class Test01 {
    // 2.静态内部类
    static class toHappy implements Happy {
        @Override
        public void Say() {
            System.out.println("Hello,Lambda!");
        }
    }

    public static void main(String[] args) {
        // 3.局部内部类
        class toHappy implements Happy {
            @Override
            public void Say() {
                System.out.println("Hello,Lambda!");
            }
        }

        // 4.匿名内部类
        Happy happy = new Happy() {
            @Override
            public void Say() {
                System.out.println("Hello,Lambda!");
            }
        };

        // 5.lambda表达式简化
        Happy happy1 = () -> System.out.println("Hello,Lambda!");

        happy1.Say();
    }
}
