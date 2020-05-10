package gui.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//尝试将Frame进行封装，并创建多个窗口
public class Test01 {
    public static void main(String[] args) {
        new MyFrame01(100,100,200,200,Color.BLACK);
        new MyFrame01(100,300,200,200,Color.YELLOW);
        new MyFrame01(300,100,200,200,Color.BLUE);
        new MyFrame01(300,300,200,200,Color.WHITE);
    }

}

//对Frame类进行封装
class MyFrame01 extends Frame {
    int id = 0;//对窗口进行计数

    public MyFrame01(int x,int y,int l,int w,Color color){

        this.setTitle("MyFrame01"+id);
        //同时设置大小、位置
        this.setBounds(x,y,l,w);
        //颜色
        this.setBackground(color);
        //可见性
        this.setVisible(true);
        this.setResizable(false);

        //添加监听事件
        //适配器模式
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        this.id++;
    }

}