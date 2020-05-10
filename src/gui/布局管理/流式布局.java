package gui.布局管理;

import java.awt.*;

//flowLayout
public class 流式布局 {
    public static void main(String[] args) {
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Frame frame = new Frame();
        //设置流式布局
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setBounds(100,100,600,400);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.setVisible(true);
    }
}
