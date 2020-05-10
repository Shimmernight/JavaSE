package gui.test.贪吃蛇;

import javax.swing.*;

public class GameStart{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(100,100,900,720);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        jFrame.add(new GameJPanel());
        jFrame.setVisible(true);
    }
}
