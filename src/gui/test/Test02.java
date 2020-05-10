package gui.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//实现超简易的计算器
public class Test02 {
    public static void main(String[] args) {
        Counter counter = new Counter();
    }
}


//计算器类
class Counter extends Frame{
    public Counter() {
        super("简易计算器");
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        //3个文本框
        TextField t1 = new TextField(5);
        TextField t2 = new TextField(5);
        TextField t3 = new TextField(10);

        //1个标签
        Label label = new Label("+");

        //1个按钮
        Button button = new Button("=");

        //给按钮添加监听
        button.addActionListener(new myCounterListener(t1,t2,t3));

        this.add(t1);
        this.add(label);
        this.add(t2);
        this.add(button);
        this.add(t3);
        this.pack();
        this.setVisible(true);
    }
}

//监听类
class myCounterListener implements ActionListener{
    TextField t1;
    TextField t2;
    TextField t3;

    public myCounterListener(TextField t1, TextField t2, TextField t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //1.获取加数和被加数
        int left = Integer.parseInt(t1.getText());
        int right = Integer.parseInt(t2.getText());

        //2.两数相加，和传给第三个框
        t3.setText(""+(left+right));

        //3.清除前两个框
        t1.setText("");
        t2.setText("");

        System.out.println("计算结束");
    }
}
