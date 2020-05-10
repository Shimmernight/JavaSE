package gui.test.贪吃蛇;

import javax.swing.*;
import java.net.URL;

//数据中心
public class GameData {

        //绝对路径：/ 表示该项目
        //获取路径
        static URL bodyUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/body.png");
        static URL downUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/down.png");
        static URL foodUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/food.png");
        static URL headerUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/header.png");
        static URL leftUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/left.png");
        static URL rightUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/right.png");
        static URL upUrl = GameData.class.getResource("/gui/test/贪吃蛇/statics/up.png");

        //定义静态图片
        public static ImageIcon body = new ImageIcon(bodyUrl);
        public static ImageIcon down = new ImageIcon(downUrl);
        public static ImageIcon food = new ImageIcon(foodUrl);
        public static ImageIcon header = new ImageIcon(headerUrl);
        public static ImageIcon left = new ImageIcon(leftUrl);
        public static ImageIcon right = new ImageIcon(rightUrl);
        public static ImageIcon up = new ImageIcon(upUrl);
}
