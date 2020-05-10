package javaSE.zxl.array;

//二维数组
public class Demo05 {
    static int[][] array = new int[][]{{2,1},{1,2}};

    public static void main(String[] args) {
        //printTwoArray(javaSE.zxl.array);

        //for循环
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("===========");
        //获取二维数组的长度
        System.out.println(array.length);
        System.out.println(array[0].length);
    }

    //打印二维数组
    private static void printTwoArray(int[][] array) {
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
