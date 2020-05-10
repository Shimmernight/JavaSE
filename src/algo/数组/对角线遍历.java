package algo.数组;

import java.util.Arrays;

/**
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），
 * 请以对角线遍历的顺序返回这个矩阵中的所有元素
 */
public class 对角线遍历 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int[] res;
        int x = matrix.length;
        if (x==0){
            return res=new int[0];
        }
        int y = matrix[0].length;
        res = new int[x * matrix[0].length];//定义大小
        boolean status = true;                  //箭头状态值，初始值为右上
        res[0] = matrix[0][0];
        for (int l = 1, i = 0, j = 0; i < x - 1 || j < y - 1; l++) {
            if (status) {//右上
                if (j == y - 1) {
                    i++;
                    status = false;
                    res[l] = matrix[i][j];
                    continue;
                }
                if (i == 0) {
                    j++;
                    status = false;
                    res[l] = matrix[i][j];
                    continue;
                }
                i--;
                j++;
            } else {//左下
                if (i == x - 1) {
                    j++;
                    status = true;
                    res[l] = matrix[i][j];
                    continue;
                }
                if (j == 0) {
                    i++;
                    status = true;
                    res[l] = matrix[i][j];
                    continue;
                }
                i++;
                j--;
            }
            res[l] = matrix[i][j];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,3}};
        int[] diagonalOrder = new 对角线遍历().findDiagonalOrder(matrix);
        System.out.println(Arrays.toString(diagonalOrder));
    }

}
