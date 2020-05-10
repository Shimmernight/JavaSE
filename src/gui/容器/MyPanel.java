package gui.容器;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//panel可以看成是一个空间，但不能单独存在
public class MyPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("窗口");
        //布局
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //窗口
        frame.setBounds(500,500,400,400);
        frame.setBackground(new Color(1, 170,1));

        //panel位置是相对于Frame的
        panel.setBounds(100,100,200,200);
        panel.setBackground(new Color(161,1,1));

        frame.add(panel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });


    }
}
