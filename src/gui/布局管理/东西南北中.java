package gui.布局管理;

import java.awt.*;

//BorderLayout
public class 东西南北中 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");

        frame.setBounds(100,100,500,400);
        //设置布局管理器
        frame.add(btn1,BorderLayout.EAST);
        frame.add(btn2,BorderLayout.WEST);
        frame.add(btn3,BorderLayout.SOUTH);
        frame.add(btn4,BorderLayout.NORTH);
        frame.add(btn5,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
