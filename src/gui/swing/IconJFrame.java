package gui.swing;

import javax.swing.*;
import java.net.URL;

public class IconJFrame extends myJFrame {
        public IconJFrame(){
            setSize(1000,1000);

            //图片在标签上显示
            JLabel jlabel = new JLabel();
            URL url = IconJFrame.class.getResource("tp.png");//直接获取同级目录下的图片地址
            ImageIcon imageIcon = new ImageIcon(url);
            //设置图片
            jlabel.setIcon(imageIcon);
            add(jlabel);
            setVisible(true);
        }

    public static void main(String[] args) {
        new IconJFrame();
    }
}
