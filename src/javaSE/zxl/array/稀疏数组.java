package javaSE.zxl.array;

public class 稀疏数组 {
    public static void main(String[] args) {
        //1.创建二维数组 11*11  0：没有棋子  1：黑棋    2：白棋
        int[][] arrays = new int[11][11];
        //2.赋值
        arrays[1][2] = 1;
        arrays[2][3] = 2;
        arrays[4][1] = 1;
        arrays[1][3] = 1;
        //3.查看
        print2Array(arrays);

        System.out.println("==========转换===========");
        //转为稀疏数组
        //1.获取有效值（不为零）个数
        int sum = 0;
        for (int[] array : arrays) {
            for (int i : array) {
                if (i!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数为："+sum);

        //2.创建稀疏数组
        int[][] array2 = new int[sum+1][3];//行为有效值加一，固定的三列
        array2[0][0] = arrays.length;
        array2[0][1] = arrays[0].length;
        array2[0][2] = sum;
        //print2Array(array2);

        //3.遍历数组，将有效值（非零值）存放到稀疏数组中
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                if (arrays[i][j]!=0){
                    count++;
                    array2[count][0] = i;//行
                    array2[count][1] = j;//列
                    array2[count][2] = arrays[i][j];//值
                }
            }
        }
        System.out.println("稀疏数组：");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]+"\t");
        }

        System.out.println("==========还原============");
        //还原稀疏数组
        //1.创建数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        //2.还原有效值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        //3.打印
        print2Array(array3);



    }

    //打印二维数组
    private static void print2Array(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
