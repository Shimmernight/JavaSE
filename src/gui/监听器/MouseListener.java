package gui.监听器;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListener {
    public static void main(String[] args) {
        mouseFrame frame = new mouseFrame("鼠标监听测试窗口");

        //添加鼠标监听
        frame.addMouseListener(new myMouse());
        frame.addWindowListener(new windowClose());
        frame.setVisible(true);
    }
}

//适配器模式
//实现鼠标监听
class myMouse extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("点击");
        //获取鼠标位置
        System.out.println("鼠标位置为("+mouseEvent.getX()+","+mouseEvent.getY()+")");
    }
}

//实现窗口监听
class windowClose extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}

//窗口封装
class mouseFrame extends Frame{
    public mouseFrame(String title){
        super(title);
        this.setBounds(200,200,500,400);
    }
}