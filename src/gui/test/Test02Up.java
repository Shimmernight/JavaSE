package gui.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//面向对象+内部类思想重构
public class Test02Up {
    public static void main(String[] args) {
        new CounterUp().loadFrame();
    }
}


//计算器类
class CounterUp extends Frame {
    //属性
    TextField t1;
    TextField t2;
    TextField t3;

    //方法
    void loadFrame() {
        setTitle("简易计算器");
        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(10);
        Label label = new Label("+");
        Button button = new Button("=");

        //给按钮添加监听
        button.addActionListener(new myCounterListenerUp());

        //布局
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(t1);
        add(label);
        add(t2);
        add(button);
        add(t3);

        pack();
        setVisible(true);
    }

    //监听类
    //内部类的优点，可以直接访问外部类的属性
    class myCounterListenerUp implements ActionListener {
//        /*获取计算器这个对象，在一个类中组合另外一个类（和继承功能类似）*/
//        CounterUp counterUp = null;
//
//        public myCounterListenerUp(CounterUp counterUp) {   /*直接传入对象，操作对象的属性*/
//            this.counterUp = counterUp;
//        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            //1.获取加数和被加数
            //2.两数相加，和传给第三个框
            //3.清除前两个框
            int left = Integer.parseInt(t1.getText());
            int right = Integer.parseInt(t2.getText());
            t3.setText("" + (left + right));
            t1.setText("");
            t2.setText("");

            System.out.println("计算结束");
        }
    }
}
