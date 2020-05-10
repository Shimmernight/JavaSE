package game.wuziqi.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;


public class GameListener extends MouseAdapter implements ActionListener {

    // 设置一个画笔
    private Graphics g;


    // 记录棋子的数量的计数器
    private	int count = 0;

    // 棋子位于棋盘上的行和列数
    private	int r, c;

    //设置记录棋子横坐标和纵坐标的2个数组
    private	int[] setX = new int[Config.ROWS*Config.COUMNS+1];
    private	int[] setY = new int[Config.ROWS*Config.COUMNS+1];

    //创建一个JPane对象
    private JPanel jp;

    //创建一个标志
    private boolean flag;

    //创建一个字符串
    private	String s = "人人对战";

    private int x1=0,y1=0;

    // 设置一个二维数组存储棋子的位置
    private	int array[][] = new int[Config.ROWS][Config.COUMNS];

    //创建一个电脑AI对象
    //private ComputerAI ca;

    //创建一个权值数组
    private int[][] weightArray ;


    public GameListener(Graphics g,JPanel jp,boolean flag) {
        this.g = g;
        this.jp = jp;
        this.flag = flag;
    }

    public void mouseClicked(MouseEvent e) {
        // 获取点击的时候x，y的坐标值
        int x = e.getX();
        int y = e.getY();

        if(flag){
            if(x>= Config.X0 && y >= Config.X0 && x<=Config.X0+(Config.ROWS-1)*Config.SIZE &&
                    y<=Config.Y0+(Config.ROWS-1)*Config.SIZE ){
                // 算出棋子的行数和列数
                r = (y - Config.Y0 + Config.CHESS_SIZE/2) /Config.SIZE;
                c = (x - Config.X0 + Config.CHESS_SIZE/2) /Config.SIZE;

                if(s.equals("人人对战")){
                    playerPk(r,c);
                }else if(s.equals("人机对战")){
                    //pkComputer(r,c);
                }
            }
        }
    }

    /**
     * 添加动作事件
     */
    public void actionPerformed(ActionEvent e){

        String str =e.getActionCommand();
        if(str.equals("开始")){
            flag = true;
        }else if(str.equals("悔棋")){
            if(count> 0){
                int x = setX[count];
                int y = setY[count];

                array[x][y] = 0;
                count--;
                jp.repaint();
            }
        }else if(str.equals("重新开始")){
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    array[i][j] = 0;
                }
            }
            //计数器归0
            count = 0;
            jp.repaint();
        }else if(str.equals("结束游戏")){
            //将保存棋子的数组归0
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    array[i][j] = 0;
                }
            }
            if(s.equals("人人对战")){

            }else if(s.equals("人机对战")){
                //将权值数组归0
                for(int i=0;i<weightArray.length;i++){
                    for(int j=0;j<weightArray[i].length;j++){
                        weightArray[i][j] = 0;
                    }
                }
            }
            //计数器归0
            count = 0;
            jp.repaint();
            flag =false;
        }else if(str.equals("人机对战")){
            s = "人机对战";
            //ca = new ComputerAI(array);
            //weightArray = ca.getWeightArray();
        }

    }

    /**
     * 判断输赢得一方
     * @param r 当前棋子所在的行数
     * @param c 当前棋子所在的列数
     */
    private void gameWin(int r,int c){
        ChessWin cw = new ChessWin(array);
        if(array[r][c] == 1){
            if(cw.Wingame(r, c)){
                winJF("黑棋获胜");
                flag = false;
            }
        }else if(array[r][c] == 2){
            if(cw.Wingame(r, c)){
                winJF("白棋获胜");
                flag = false;
            }
        }
    }
    /**
     * 赢棋的时候弹出的提示框
     */
    private void winJF(String str){
        //创建一个新的提示框体
        JFrame jf = new JFrame();
        //设置其属性
        jf.setSize(300, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        //使用空布局
        jf.setLayout(null);
        //创建一个按钮，并设置其大小
        JButton jbu = new JButton(str);
        jbu.setBounds(80,50, 120,40);
        //添加到窗体里
        jf.add(jbu);

        jf.setVisible(true);

       // WinnerListener wl = new WinnerListener(jf,jp,array,s,weightArray);
        //jbu.addActionListener(wl);
        //游戏一方获胜计数器归0
        count = 0;
    }

    // 将array数组传递出去
    public int[][] getArray() {
        return array;
    }
    /**
     * 确定电脑下棋的下一步的行和列数
     */
 /*   private void computerNextStep(){
        int[] max= new int[weightArray.length];	//存储行最大权值
        for(int i =0 ;i<weightArray.length;i++){	//求出x方向上面的最大值
            int maxX = weightArray[i][0];
            for(int j =0;j<weightArray[i].length;j++){
                if(maxX < weightArray[i][j]){
                    maxX = weightArray[i][j];
                }
            }
            max[i] = maxX;
        }
        int m =max[0];
        for(int i=1;i<max.length;i++){
            if(m<max[i]){
                m = max[i];
            }
        }
        int flag = 0;
        System.out.println("max="+m);

        for(int i =0 ;i<weightArray.length;i++){
            for(int j =0;j<weightArray[i].length;j++){
                if(weightArray[i][j] == m){			//找出最大是的行和列标
                    System.out.println("i ="+i+"   j="+j);
                    x1 = i;
                    y1 = j;
                    System.out.println("x1="+x1+"    y1="+y1);
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
    }*/
    /**
     * 实现人机对战
     * @param r 人下的棋子行数
     * @param c	人下棋子的劣势
     */
/*    private void pkComputer(int r,int c){
        System.out.println("x1="+x1+"    y1="+y1);
        if( array[r][c] == 0 ){
            for(int i =0;i<30;i++){
                g.setColor(new Color(i*4,i*4,i*4));
                g.fillOval(Config.X0 + c * Config.SIZE - Config.CHESS_SIZE/2+i/2,
                        Config.Y0  + r * Config.SIZE - Config.CHESS_SIZE/2+i/2,
                        Config.CHESS_SIZE-i,Config.CHESS_SIZE-i);
            }
            array[r][c] = 1; 	// 1表示该位置为黑棋
            ca.ai();			//更新权值数组
            computerNextStep(); 	//电脑下棋的下一步
            count++;		//计数器加1
            //记录画出一个棋子后的x和y坐标
            setX[count] = r;
            setY[count] = c;
        }
        //判断黑棋是否获胜
        gameWin(r,c);
        if(array[x1][y1] == 0 ){
            for(int i =30,j=0;i>=0 && j<30;i--,j++){
                g.setColor(new Color(255-3*i,255-3*i,255-3*i));
                g.fillOval(Config.X0 + y1 * Config.SIZE - Config.CHESS_SIZE/2+j/2,
                        Config.Y0  + x1 * Config.SIZE - Config.CHESS_SIZE/2+j/2,
                        Config.CHESS_SIZE-j,Config.CHESS_SIZE-j);
            }
            array[x1][y1] = 2;	//2表示该位置为白棋
            count++;		//计数器加一
            setX[count] = x1;
            setY[count] = y1;
        }
        //判断白棋是否获胜
        gameWin(x1,y1);
        //将有棋子位置的权值归0
        updateWeight();
    }*/
    /**
     * 玩家之间的对战
     * @param r 人下的棋子行数
     * @param c	人下棋子的劣势
     */
    private void playerPk(int r,int c){
        // 存储棋子的位置
        if(array[r][c] == 0 ){
            if (count % 2 == 0) {
                for(int i =0;i<30;i++){
                    g.setColor(new Color(i*4,i*4,i*4));
                    g.fillOval(Config.X0 + c * Config.SIZE - Config.CHESS_SIZE/2+i/2,
                            Config.Y0  + r * Config.SIZE - Config.CHESS_SIZE/2+i/2,Config.CHESS_SIZE-i,Config.CHESS_SIZE-i);
                }
                array[r][c] = 1; 	// 1表示该位置为黑棋
            } else if (count % 2 == 1) {
                for(int i =30,j=0;i>=0 && j<30;i--,j++){
                    g.setColor(new Color(255-3*i,255-3*i,255-3*i));
                    g.fillOval(Config.X0 + c * Config.SIZE - Config.CHESS_SIZE/2+j/2,
                            Config.Y0  + r * Config.SIZE - Config.CHESS_SIZE/2+j/2,
                            Config.CHESS_SIZE-j,Config.CHESS_SIZE-j);
                }
                array[r][c] = 2;	//2表示该位置为白棋
            }
        }
        // 计数器加1
        count++;
        //判断赢得一方
        gameWin(r,c);

        //记录画出一个棋子后的x和y坐标
        setX[count] = r;
        setY[count] = c;
    }
    /**
     * 下棋之后将有棋子位置的权值改为0
     */
/*    private void updateWeight(){
        for(int i =0;i<weightArray.length;i++){
            for(int j = 0;j<weightArray[i].length;j++){
                weightArray[i][j] = 0;
            }
        }
    }*/

}