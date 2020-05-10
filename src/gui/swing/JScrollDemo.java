package gui.swing;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends myJFrame{
    public JScrollDemo(){
        //获取容器
        Container container = this.getContentPane();

        //创建文本域
        JTextArea jtArea = new JTextArea(50,50);
        jtArea.setText("hello");

        //创建一个滚动条面板
        JScrollPane scrollPane = new JScrollPane(jtArea);//添加了文本域
        scrollPane.setBounds(100,100,200,100);

        container.add(scrollPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
