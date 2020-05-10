package gui.布局管理;
import java.awt.*;

//将所有布局结合运用
public class Test {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button btn10 = new Button("btn10");
        frame.setBounds(500,500,500,300);
        //设置布局管理器
        frame.setLayout(new GridLayout(2,1));
        //新建4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        //上
        p1.add(new Button("btn1"),BorderLayout.WEST);
        p1.add(new Button("btn2"),BorderLayout.EAST);
        p2.add(new Button("btn3"));
        p2.add(new Button("btn4"));
        p1.add(p2,BorderLayout.CENTER);
        //下
        p3.add(new Button("btn5"),BorderLayout.WEST);
        p3.add(new Button("btn6"),BorderLayout.EAST);
        //中间4个
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("btn"+(i+7)));
        }
        p3.add(p4,BorderLayout.CENTER);

        //上下面板添加到frame窗口
        frame.add(p1,BorderLayout.NORTH);
        frame.add(p3,BorderLayout.SOUTH);
        //frame.pack();
        frame.setVisible(true);
    }
}
