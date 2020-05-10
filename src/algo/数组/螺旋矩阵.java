package algo.数组;

import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {
    public enum Status {//设置枚举类型的四种状态
        UP, DOWN, LEFT, RIGHT
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length==0){return res;}
        Status status = Status.RIGHT;//初始化向右
        int x = 0, y = 0;
        res.add(matrix[0][0]);
        for (int i = 1;res.size() != matrix.length * matrix[0].length;) {
            switch (status) {
                case UP:
                    if (x == i) {
                        status = Status.RIGHT;
                        i++;
                        continue;
                    }
                    x--;
                    res.add(matrix[x][y]);
                    break;
                case DOWN:
                    if (x == matrix.length -i) {
                        status = Status.LEFT;
                        continue;
                    }
                    x++;
                    res.add(matrix[x][y]);
                    break;
                case LEFT:
                    if (y == i-1) {
                        status = Status.UP;
                        continue;
                    }
                    y--;
                    res.add(matrix[x][y]);
                    break;
                case RIGHT:
                    if (y == matrix[0].length- i) {
                        status = Status.DOWN;
                        continue;
                    }
                    y++;
                    res.add(matrix[x][y]);
                    break;
                default:
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> integers = new 螺旋矩阵().spiralOrder(matrix);
        System.out.println(integers);
    }
}
