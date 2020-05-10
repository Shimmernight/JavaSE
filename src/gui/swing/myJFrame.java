package gui.swing;

import javax.swing.*;

public class myJFrame extends JFrame {
    //JFrame是一个顶级窗口
    public myJFrame() {
        setBounds(100, 100, 400, 400);
        //swing关闭窗口的方法
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
