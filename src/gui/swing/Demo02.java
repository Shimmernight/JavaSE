package gui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo02 {
    public static void main(String[] args) {
        new Demo02Frame();
    }


}


class Demo02Frame extends myJFrame{
    public Demo02Frame(){
        //容器
        Container contentPane = this.getContentPane();
        //绝对布局
        contentPane.setLayout(null);
        Button btn1 = new Button("btn1");
        btn1.setBounds(100,100,70,30);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new myJDialog();
            }
        });
        contentPane.add(btn1);
        setVisible(true);
    }
}

//弹窗属性和frame类似
class myJDialog extends JDialog {
    public myJDialog() {
        setVisible(true);
        setBounds(500,500,300,300);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //任何组件都需要放到容器当中，否则无效
        Container container = this.getContentPane();
        //container.setLayout(new FlowLayout(FlowLayout.CENTER));

        Label label = new Label("成功弹出弹窗");
        //如果显示中文只能设置为MS Song字体，否则的话就会显示方框状的乱码
        label.setFont(new Font("MS Song", Font.PLAIN, 9));
        container.add(label);
    }
}