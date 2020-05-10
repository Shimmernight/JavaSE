package gui.swing;

import javax.swing.*;
import java.awt.*;

public class Demo01 {
    public static void main(String[] args) {
        new Demo01JFrame();
    }

}

//JFrame是Frame的子类
class Demo01JFrame extends myJFrame{
    //JFrame是一个顶级窗口
    public Demo01JFrame(){
        //组件都是在容器中设置
        //获得容器
        Container container = this.getContentPane(); //JFrame也属于一个容器，需要将容器实例化
        container.setBackground(new Color(172, 26, 9));
        container.setLayout(null);

        //添加面板
        JPanel jP = new JPanel();
        jP.setBackground(new Color(1,50,1));
        jP.setBounds(100,100,200,200);

        container.add(jP);
        setVisible(true);
    }
}

//有一定的偏移，因为将顶部高度也算在其中了