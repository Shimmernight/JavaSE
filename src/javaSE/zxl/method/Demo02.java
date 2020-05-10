package javaSE.zxl.method;

/**
 * 可变参数(不定参数)
 * 格式：数据类型 + ...
 * 一个方法只能指定一个可变参数，且必须放在最后！
 * 本质就是一个数组！！！
 */
public class Demo02 {
    public static void main(String[] args) {

        printMax(1, 2, 3, 4, 5);
        printMax(new int[]{1,2,3,4,5});

    }

    //输入任意个数，返回最大值
    private static void printMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("输入的数不够！");
            return;
        }

        //定义最大值位置
        int result = numbers[0];

        //取最大值
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > result) {
                result = numbers[j];
            }
        }
        System.out.println("最大值为："+result);

    }
}
