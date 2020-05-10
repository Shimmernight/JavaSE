package javaSE.zxl.sort;

import java.util.Arrays;

public class 冒泡排序 {
    //1.遍历数组，比较前后两个数大小，如果前大于后，将他们交换
    //2.全部遍历一遍后，此时已经选出一个最大值，继续进行下一次遍历，遍历次数减一(-j)
    //3.每遍历一次，选出一个最大值，所以需要遍历array.length次

    public static void main(String[] args) {
        int[] a = new int[]{1,2,33214,134,1234,123};
        System.out.println(Arrays.toString(a));

        int[] array = sort(a);

        System.out.println("------排序后-----");
        System.out.print(Arrays.toString(array));
    }


    //冒泡排序
    private static int[] sort(int[] arrays){
        int tmp = 0;
        for (int j = 0; j < arrays.length; j++) {
            for (int i = 0; i < arrays.length-1-j; i++) {
                if (arrays[i]>arrays[i+1]){
                    tmp = arrays[i];
                    arrays[i] = arrays[i+1];
                    arrays[i+1] = tmp;
                }
            }
        }
        return arrays;
    }
}
