package game.wuziqi.java;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class GameUI extends JPanel implements Config {

    //记录棋子的位置的数组
    private int[][] array;

    //设置一个开始的flag
    boolean flag =false;

    public void inIt(){
        //创建一个窗体,并给其设置属性
        JFrame jf = new JFrame("五子棋");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setResizable(false);
        jf.setLayout(new FlowLayout(0,0,0));

        //设置JPanel组件的大小和背景颜色
        this.setPreferredSize(new Dimension(650,700));
        this.setBackground(new Color(204,162,129));
        jf.add(this);

        //再设置一个JPanel
        JPanel jp = new JPanel ();
        jp.setPreferredSize(new Dimension(140,700));
        jp.setBackground(Color.WHITE);

        //添加一个开始的按钮
        JButton startB = new JButton("开始");
        createButton(jp,startB,20,150);

        //添加一个悔棋的按钮
        JButton huiqiB = new JButton("悔棋");
        createButton(jp,huiqiB,20,250);

        //添加一个重新开始的按钮
        JButton restartB = new JButton("重新开始");
        createButton(jp,restartB,20,200);

        //添加一个结束游戏按钮
        JButton endgameB = new JButton("结束游戏");
        createButton(jp,endgameB,20,300);

        //添加人机对战按钮
        JButton computerPk = new JButton("人机对战");
        createButton(jp,computerPk,20,350);

        jf.add(jp);

        //设置窗口可见
        jf.setVisible(true);

        Graphics g = this.getGraphics();

        //创建一个监听器
        GameListener gL = new GameListener(g,this,flag);
        this.addMouseListener(gL);
        //给按钮添加动作监听器
        startB.addActionListener(gL);
        huiqiB.addActionListener(gL);
        restartB.addActionListener(gL);
        endgameB.addActionListener(gL);
        computerPk.addActionListener(gL);

        //获取存储数组
        array = gL.getArray();

    }

    /**
     * 重写重绘函数
     */
    public void paint(Graphics g){
        super.paint(g);
        //画出五子棋的棋盘
        drawChessTable(g);
        //重绘五子棋的棋子
        drawChess(g);
    }

    /**
     * 画出棋盘
     * @param
     */
    public void drawChessTable(Graphics g){
        //设置五子棋的棋盘的属性
        ImageIcon chessBoardImageIcon = new ImageIcon(this.getClass().getResource("/game/wuziqi/img/chessboard.jpg"));
        g.drawImage(chessBoardImageIcon.getImage(), 0, 0, this.getWidth(), this.getHeight()-30, null);
        for(int i = 0; i< Config.ROWS; i++){
            g.drawLine(Config.X0, Config.Y0+Config.SIZE*i,Config.X0+(Config.ROWS-1)*Config.SIZE,Config.Y0+Config.SIZE*i);
            g.drawLine(Config.X0+Config.SIZE*i, Config.Y0,Config.X0+Config.SIZE*i, Config.Y0+(Config.ROWS-1)*Config.SIZE);
        }
    }

    /**
     * 重新画出棋子的位置
     * @param
     */
    public void drawChess(Graphics g){

        //创建一个画图片的对象
        ImageIcon chessImageIcon = null;

        //使用遍历数组存储棋子的位置
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j] == 1){
                    chessImageIcon = new ImageIcon(this.getClass().getResource("img\\heiqi.png"));
                    g.drawImage(chessImageIcon.getImage(),Config.X0 + j * Config.SIZE - Config.CHESS_SIZE/2,
                            Config.Y0  + i * Config.SIZE - Config.CHESS_SIZE/2,Config.CHESS_SIZE,
                            Config.CHESS_SIZE, null);
                }
                else if(array[i][j] == 2){
                    chessImageIcon = new ImageIcon(this.getClass().getResource("img\\baiqi.png"));
                    g.drawImage(chessImageIcon.getImage(),Config.X0 + j * Config.SIZE - Config.CHESS_SIZE/2,
                            Config.Y0  + i * Config.SIZE - Config.CHESS_SIZE/2,Config.CHESS_SIZE,
                            Config.CHESS_SIZE, null);
                }
            }
        }
    }

    /**
     *
     * @param jpa
     * @param jb
     * @param x 按钮的左上角的横坐标
     * @param y	按钮的坐上角的纵坐标
     */
    public void createButton(JPanel jpa,JButton jb,int x,int y){
        jpa.setLayout(null);
        jb.setBounds(x, y,100, 30);
        jpa.add(jb);
    }


    public static void main (String[] args){

        //创建游戏界面类
        GameUI gameUi = new GameUI();
        //调用类的实现函数
        gameUi.inIt();

    }
}