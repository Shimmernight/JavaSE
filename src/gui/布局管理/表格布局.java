package gui.布局管理;

import java.awt.*;

public class 表格布局 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(100, 100, 200, 200);

        //设置布局管理器
        frame.setLayout(new GridLayout(3, 2));//行列

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        //frame.pack();//自动设置大小
        frame.setVisible(true);//可视化
    }
}
