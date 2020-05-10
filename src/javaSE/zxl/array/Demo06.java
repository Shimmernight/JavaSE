package javaSE.zxl.array;

import java.util.Arrays;

//Array类：数组工具类
public class Demo06 {
    public static void main(String[] args) {
        int[] array = new int[]{1,23,5432,3245,12,1,23};

        System.out.println(Arrays.toString(array));
        //printArray(javaSE.zxl.array);

        System.out.println("排序后...");
        Arrays.sort(array);//排序:升序
        System.out.println(Arrays.toString(array));

        Arrays.fill(array,5,6,1);//填充
        System.out.println(Arrays.toString(array));
    }

    //模仿toString（）
    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i == array.length-1) {
                System.out.print(array[i]+"]");
            }else {
                System.out.print(array[i]+", ");
            }
        }
    }
}
