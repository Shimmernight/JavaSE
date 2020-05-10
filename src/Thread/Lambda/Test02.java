package Thread.Lambda;

/**
 * 使用Lambda表达式前提：
 * 实现的接口只有一个方法（函数式接口）
 */

interface ILove {
    void Love(int a);
}

public class Test02 {

    public static void main(String[] args) {
        ILove love = null;

        love = (int a) -> {
            System.out.println("love->" + a);
        };

        //简化1：简化参数
        love = (a) -> {
            System.out.println("love->" + a);
        };

        //简化2：简化括号（只有一个参数时）
        love = a -> {
            System.out.println("love->" + a);
        };

        //简化3：简化花括号（只有一条语句时）
        love = a -> System.out.println("love->" + a);

        love.Love(520);
    }

}
