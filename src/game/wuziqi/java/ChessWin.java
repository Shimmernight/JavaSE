package game.wuziqi.java;

public class ChessWin {
    //定义一个存储棋子的数组
    int array[][];

    /**
     * 构造函数
     * @param array 存储棋子的数组
     */
    public ChessWin(int[][] array) {
        this.array = array;
    }
    /**
     * 判断是否五子相连
     * @param r 表示棋子的所在的行数
     * @param c 表示棋子所在的列数
     * @return	如果五子相连返回true
     */
    public boolean Wingame(int r,int c){

        boolean flag = false;
        if(countX(r,c)>=5 || countY(r,c)>=5 || countXy(r,c)>=5 ||countYx(r,c)>=5){
            flag = true;
        }
        return flag;
    }
    /**
     * 判断水平方向上相连的棋子数
     * @param r 表示棋子的所在的行数
     * @param c 表示棋子所在的列数
     * @return 水平方向上相连的棋子个数
     */
    private int countX(int r,int c){
        int count =1;
        for(int i =c+1;i<array[r].length;i++){	//向右检查
            if(array[r][i] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        for(int i = c-1;i>=0;i--){	//向左检查
            if(array[r][i] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    /**
     * 判断竖直方向上相连的棋子数
     * @param r 表示棋子的所在的行数
     * @param c 表示棋子所在的列数
     * @return 竖直方向上相连的棋子个数
     */
    private int countY(int r,int c){
        int count = 1;

        //向上统计
        for(int i = r-1;i>=0;i--){
            if(array[i][c] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        //向下统计
        for(int i =r+1;i<array.length;i++){
            if(array[i][c] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    /**
     * 判断45度方向上相连的棋子数
     * @param r 表示棋子的所在的行数
     * @param c 表示棋子所在的列数
     * @return 45度方向上相连的棋子个数
     */
    private int countXy(int r,int c){
        int count =1;

        //向右上角统计
        for(int i = c+1,a = r-1;i<array.length && a>=0;i++,a--){
            if(array[a][i] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        //左下角统计
        for(int j = r+1, b = c-1;j<array.length && b>=0;j++,b--){
            if(array[j][b] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    /**
     * 判断135度方向上相连的棋子数
     * @param r 表示棋子的所在的行数
     * @param c 表示棋子所在的列数
     * @return 相连的棋子数
     */
    private int  countYx(int r,int c){
        int count=1;

        //左上角统计
        for(int i = c-1,a= r-1;i>=0 && a>=0;i--,a--){
            if(array[a][i] == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        //右下角统计
        for(int j = c+1,b = r+1;j<array.length && b<array.length;j++,b++){
            if(array[b][j]  == array[r][c]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

}