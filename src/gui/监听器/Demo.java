package gui.监听器;

import java.awt.*;
import java.awt.event.*;

//创建监听事件
public class Demo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        Button button = new Button("start");

        //添加监听器
        //根据参数我们可以知道需要添加一个监听器类，所以需要什么，我们就new什么
        MyListener myListener = new MyListener();
        button.addActionListener(myListener);

        frame.add(button);
        windowClose(frame);
        frame.pack();//自动控制大小
        frame.setVisible(true);

    }

    //实现关闭窗口监听
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }


    static class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("产生事件响应...");
        }
    }
}
