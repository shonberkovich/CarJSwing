import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener implements KeyListener {
    private MainScene mainScene;

    public MovementListener (MainScene mainScene) {
        this.mainScene = mainScene;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("t");

    }
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.mainScene.getCar1().moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.mainScene.getCar1().moveLeft();
        }
        System.out.println("keyPressed");
        if (e.getKeyCode() == KeyEvent.VK_1) {
            this.mainScene.getCar2().moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_2) {
            this.mainScene.getCar2().moveLeft();
        }
        this.mainScene.repaint();
        if (e.getKeyCode() == KeyEvent.VK_3) {
            this.mainScene.getCar2().moveDiaganalUp();
        } else if (e.getKeyCode() == KeyEvent.VK_4) {
            this.mainScene.getCar2().moveDiaganalDown();
        }
        this.mainScene.repaint();
        if (e.getKeyCode() == KeyEvent.VK_5) {
            this.mainScene.getCar1().moveDiaganalUp();
        } else if (e.getKeyCode() == KeyEvent.VK_6) {
            this.mainScene.getCar1().moveDiaganalDown();
        }
        this.mainScene.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
      //  this.mainScene.getCar1().explode();
      //  this.mainScene.repaint();
    }
}