package gui.test.贪吃蛇;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//面板
public class GameJPanel extends JPanel implements ActionListener {

    int length;//蛇的长度
    int[] snakeX = new int[600];//蛇的X的最大长度
    int[] snakeY = new int[500];//蛇的Y的最大长度
    String fx = "R";
    boolean isStart = false;//默认不开始
    //定时器
    Timer timer = new Timer(100, this);//100毫秒=1秒
    int foodX;
    int foodY;
    Random random = new Random();//随机数
    boolean isFail = false;//失败条件
    int score;

    public GameJPanel() {
        init();
        this.setFocusable(true);//获取焦点事件
        addKeyListener(new GameKeyListener(this));
        //开启定时器
        timer.start();
    }

    //初始化
    void init() {
        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;//第一个身体
        snakeX[1] = 75;
        snakeY[1] = 100;//第二个身体
        snakeX[2] = 50;
        snakeY[2] = 100;//第三个身体
        fx = "R";
        //食物随机分布
        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);
        score = 0;
    }

    //绘制面板,所有东西都是通过graphics这个画笔绘制
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);//清屏

        //添加静态布局
        GameData.header.paintIcon(this, graphics, 25, 11);
        graphics.fillRect(25, 75, 850, 600);
        //积分板
        graphics.setColor(Color.white);
        graphics.setFont(new Font("微软雅黑", Font.BOLD, 18));
        graphics.drawString("长度："+length,750,35);
        graphics.drawString("得分："+score,750,55);
        //先画食物，防止吃掉有延迟
        GameData.food.paintIcon(this, graphics, foodX, foodY);
        //画小蛇
        switch (fx) {
            case "R":
                GameData.right.paintIcon(this, graphics, snakeX[0], snakeY[0]);
                break;
            case "L":
                GameData.left.paintIcon(this, graphics, snakeX[0], snakeY[0]);
                break;
            case "U":
                GameData.up.paintIcon(this, graphics, snakeX[0], snakeY[0]);
                break;
            case "D":
                GameData.down.paintIcon(this, graphics, snakeX[0], snakeY[0]);
                break;
        }
        //身体
        for (int i = 1; i < length; i++) {
            GameData.body.paintIcon(this, graphics, snakeX[i], snakeY[i]);
        }
        //游戏状态
        if (!isStart) {
            graphics.setColor(Color.white);
            graphics.setFont(new Font("微软雅黑", Font.BOLD, 40));//设置字体
            graphics.drawString("按下空格，开始游戏", 300, 300);
        }
        //游戏失败
        if (isFail) {
            graphics.setColor(Color.red);
            graphics.setFont(new Font("微软雅黑", Font.BOLD, 40));
            graphics.drawString("游戏失败,请按空格继续", 300, 300);
        }

    }

    //事件监听--固定事件刷新一次，1s=100ms
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (isStart && !isFail) {
            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                //长度+1
                length++;
                score+=10;
                //重新随机绘制食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }
            //后一节移动到前一节，从而由头带动身体移动
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
            switch (fx) {
                case "R":
                    snakeX[0] += 25;//头部移动
                    // 边界判断
                    if (snakeX[0] > 850) { snakeX[0] = 25; }
                    break;
                case "L":
                    snakeX[0] -= 25;//头部移动
                    if (snakeX[0] < 25) { snakeX[0] = 850; }
                    break;
                case "U":
                    snakeY[0] -= 25;//头部移动
                    if (snakeY[0] < 75) { snakeY[0] = 650; }
                    break;
                case "D":
                    snakeY[0] += 25;//头部移动
                    if (snakeY[0] > 650) { snakeY[0] = 75; }
                    break;
            }
            //失败判定
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                    break;
                }
            }
            repaint();//重绘
        }
        //开启定时器
        timer.start();
    }
}
