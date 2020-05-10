package algo.数组;

import java.util.Arrays;

/**
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。
 * 请你设计一种算法，将图像旋转 90 度。
 * <p>
 * 不占用额外内存空间能否做到？
 */
public class 旋转矩阵 {
    public void rotate(int[][] matrix) {
        int sizeX = matrix.length;
        int sizeY = matrix[0].length;
        int[][] tmp = new int[sizeX][sizeY];

        // 1.输出数组
        // 2.横坐标变纵坐标，纵坐标变横坐标
        // 3.将纵坐标反过来读
        for (int i = 0; i < sizeX; i++) {
            for (int j = sizeY-1; j >= 0; j--) {
                tmp[i][sizeY-1-j]=matrix[j][i];
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            System.arraycopy(tmp[i], 0, matrix[i], 0, tmp[0].length);
        }
//        System.out.println(Arrays.toString(matrix[0]));
//        System.out.println(Arrays.toString(matrix[1]));
//        System.out.println(Arrays.toString(matrix[2]));

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        new 旋转矩阵().rotate(matrix);

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
    }
}
