package houseWork.处理游戏异常;

import java.io.*;
import java.util.Queue;

public class Gobang {
    // 定义棋盘的大小
    private static int BOARD_SIZE = 15;
    // 定义一个二维数组来充当棋盘
    private int[][] board;

    public void initBoard() {
        // 初始化棋盘数组
        board = new int[BOARD_SIZE][BOARD_SIZE];
        // 把每个元素赋为"╋"，用于在控制台画出棋盘
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }

    // 在控制台输出棋盘的方法
    public void printBoard() {
        // 打印每个数组元素
        System.out.println("  1 2 3 4 5 6 7 8 9 A B C D E F");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(Integer.toHexString(i + 1).toUpperCase()+" ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                switch (board[i][j]){
                    case 0:
                        System.out.print("╋-");
                        break;
                    case 1://白棋
                        System.out.print("○");
                        break;
                    case 2://黑棋
                        System.out.print("●");
                        break;
                }
            }
            // 每打印完一行数组元素后输出一个换行符
            System.out.print("\n");
        }
    }

    //x:行，y:列，object:当前对象
    boolean is_win(int x,int y,int object){
        int num = 1;
        //垂直方向
        //向上
        for (int i = x-2; i >=0; i--) {
            if (board[i][y-1]==object){
                num++;
            }else break;
        }
        //向下
        for (int i = x; i < 15; i++) {
            if (board[i][y-1]==object){
                num++;
            }else break;
        }
        if (num>=5) return true;
        else num=1;
        //水平方向
        //向左
        for (int i = y-2; i >=0; i--) {
            if (board[x-1][i]==object){
                num++;
            }else break;
        }
        //向右
        for (int i = y; i < 15; i++) {
            if (board[x-1][i]==object){
                num++;
            }else break;
        }
        if (num>=5) return true;
        else num=1;
        //左斜方向
        //左上
        for (int i = x-2,j=y-2; i >=0&&j>=0; i--,j--) {
            if (board[i][j]==object){
                num++;
            }else break;
        }
        //右下
        for (int i = x,j=y; i < 15&&j<15; i++,j++) {
            if (board[i][j]==object){
                num++;
            }else break;
        }
        if (num>=5) return true;
        else num=1;
        //右斜方向
        //右上
        for (int i = x-2,j=y; i >=0&&j<15; i--,j++) {
            if (board[i][j]==object){
                num++;
            }else break;
        }
        //左下
        for (int i = x,j=y-2; i < 15&&j>=0; i++,j--) {
            if (board[i][j]==object){
                num++;
            }else break;
        }
        if (num>=5) return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        boolean b = true;//白棋先手
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        System.out.print("请白手输入坐标，应以x,y的格式：");
        // 这是用于获取键盘输入的方法
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        // br.readLine()：每当在键盘上输入一行内容按回车，用户刚输入的内容将被br读取到。
        while ((inputStr = br.readLine()) != null) {
            // 将用户输入的字符串以逗号（,）作为分隔符，分隔成2个字符串
            String[] posStrArr = inputStr.split(",");
            if (posStrArr.length > 2) {
                System.out.print("输入格式不正确，请重新输入：");
                continue;
            }
            int xPos,yPos;
            try {
                // 将2个字符串转换成用户下棋的座标
                xPos = Integer.parseInt(posStrArr[0]);
                yPos = Integer.parseInt(posStrArr[1]);
            } catch (Exception e) {
                System.out.print("输入内容有误，请重新输入：");
                continue;
            }
            if ((xPos <= 0 | xPos > BOARD_SIZE) | (yPos <= 0 | yPos > BOARD_SIZE)) {
                System.out.print("输入的棋子坐标越界，请重新输入：");
                continue;
            }
            if (gb.board[yPos - 1][xPos - 1] != 0) {
                System.out.print("该位置已有棋子，请重新输入：");
                continue;
            }
            System.out.println("x:" + xPos + " y:" + yPos);
            // 把对应的数组元素赋。
            if (b) {
                gb.board[yPos - 1][xPos - 1] = 1;
                if (gb.is_win(yPos, xPos, 1)){
                    gb.printBoard();
                    System.out.println("白棋胜！");
                    break;
                }
                b = false;
            } else {
                gb.board[yPos - 1][xPos - 1] = 2;
                if (gb.is_win(yPos, xPos, 1)){
                    gb.printBoard();
                    System.out.println("黑棋胜！");
                    break;
                }
                b = true;
            }
            gb.printBoard();
            if (b)
                System.out.print("请白手输入坐标，应以x,y的格式：");
            else
                System.out.print("请黑手输入坐标，应以x,y的格式：");
        }
    }
}