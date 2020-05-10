package javaSE.zxl.array;

//数组
public class ArrayDemo01 {
    public static void main(String[] args) {

        int[] a = null;//1.声明数组
        a = new int[10];//2.创建数组

        //3.给数组元素赋值
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //求和
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        System.out.println("数组之和为："+sum);

    }
}
