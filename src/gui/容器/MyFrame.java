package gui.容器;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame {
    public static void main(String[] args) {

        //创建一个Frame对象
        Frame frame = new Frame("我的第一个Frame窗口");

        //此时的Frame只是占用了空间，还看不见
        //所以需要定义一些属性
        //1.设置可见性
        frame.setVisible(true);

        //2.设置大小
        frame.setSize(200,200);

        //3.设置位置
        frame.setLocation(100,100);

        //4.设置颜色
        frame.setBackground(Color.yellow);

        //是否可以改变大小
        frame.setResizable(false);

        //添加监听事件
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

    }
}
