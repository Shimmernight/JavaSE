package javaSE.zxl.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        printArray(a);
        System.out.println("===============");
        addArray(a);
        System.out.println("===============");
        maxArray(a);
    }

    //求最大值
    private static void maxArray(int[] arrays) {
        int res = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]>res){
                res=arrays[i];
            }
        }
        System.out.println("最大值为："+res);
    }

    //计算所有元素之和
    private static void addArray(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("总和为：" + sum);
    }

    //打印数组
    private static void printArray(int[] arrays) {
        System.out.print("数组：");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
        System.out.println();
    }
}
