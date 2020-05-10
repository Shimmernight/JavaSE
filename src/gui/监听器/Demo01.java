package gui.监听器;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo01 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");

        //设置监听
        MyListener myListener = new MyListener();
        btn1.setActionCommand("btn1");
        btn2.setActionCommand("btn2");
        btn1.addActionListener(myListener);
        btn2.addActionListener(myListener);

        frame.setLayout(new GridLayout(1,2));
        frame.add(btn1);
        frame.add(btn2);
        frame.pack();
        frame.setVisible(true);
    }
}

//实现共同监听事件
 class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand()+"发出响应。");
        //通过监听事件返回值，判断
        if (actionEvent.getActionCommand().equals("btn1")){
            System.out.println("start");
        }
    }
}