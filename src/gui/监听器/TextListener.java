package gui.监听器;

import java.awt.*;

public class TextListener {
    public static void main(String[] args) {
        TextFrame textFrame = new TextFrame("文本测试窗口");

        //新建文本框
        TextField textField = new TextField();

        textFrame.add(textField,BorderLayout.CENTER);
        textFrame.setVisible(true);
    }

}

//将窗口类封装
class TextFrame extends Frame{
    public TextFrame(String title){
        super(title);
        this.setBounds(200,200,500,400);
    }
}