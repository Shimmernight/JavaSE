package gui.test.贪吃蛇;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyListener extends KeyAdapter {
    GameJPanel gameJPanel = null;

    public GameKeyListener(GameJPanel gameJPanel) {
        this.gameJPanel = gameJPanel;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode()==KeyEvent.VK_SPACE){
            if (gameJPanel.isFail) {
                //重新开始
                gameJPanel.isFail = false;
                gameJPanel.init();
            } else{
                //因为需要反复变换所以不能写死了
                gameJPanel.isStart = !gameJPanel.isStart;
            }
            gameJPanel.repaint();//重绘，否则没有反应
        }else if (keyEvent.getKeyCode()==KeyEvent.VK_LEFT){
            gameJPanel.fx="L";
        }else if (keyEvent.getKeyCode()==KeyEvent.VK_RIGHT){
            gameJPanel.fx="R";
        }else if (keyEvent.getKeyCode()==KeyEvent.VK_UP){
            gameJPanel.fx="U";
        }else if (keyEvent.getKeyCode()==KeyEvent.VK_DOWN){
            gameJPanel.fx="D";
        }
    }
}
