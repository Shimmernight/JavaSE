package gui.监听器;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo02 {
    public static void main(String[] args) {
        new windowFrame();
    }
}

//窗口监听
class windowFrame extends Frame{
    public windowFrame(){
        setBounds(200,200,500,400);
        setVisible(true);

        //匿名内部类
        this.addWindowListener(new WindowAdapter() {
            //关闭窗口
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                //隐藏
                //setVisible(false);
                System.exit(0);
                System.out.println("窗口已关闭");
            }

            //激活窗口
            @Override
            public void windowActivated(WindowEvent windowEvent) {
                System.out.println("暴露了！");
                windowFrame  source = (windowFrame) windowEvent.getSource();//强转
                source.setTitle("暴露了");
            }
        });
    }
}