package javaSE.zxl.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};

        printArray(a);
        int[] b = reverseArray(a);
        System.out.println();
        System.out.println("倒序后...");
        printArray(b);
    }

    //打印数组
    private static void printArray(int[] arrays) {
        System.out.print("数组元素为：");
        //JDK1.5,没有下标（不能操作元素,适用于遍历数组）
        for (int i : arrays) {
            System.out.print(i+"");
        }
    }


    //数组倒序
    private static int[] reverseArray(int[] arrays) {
        int[] result = new int[arrays.length];

        for (int i = arrays.length-1; i >=0 ; i--) {//反着读
            result[(arrays.length-1)-i] = arrays[i];
        }

       /* //反转操作
        for (int i = 0,j = result.length-1; i <arrays.length ; i++,j--) {
            result[j] = arrays[i];
        }*/
        return result;
    }
}
