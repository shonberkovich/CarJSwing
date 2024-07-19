import javax.swing.*;
import java.awt.*;

public class MainScene extends JPanel {
    private Car car1;
    private Car car2;

    public MainScene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setBackground(Color.CYAN.brighter());
        this.car1 = new Car(50, 50);
        this.car2 = new Car(500, 200);
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(new MovementListener(this));
        this.addMouseListener(new MovementListener(this));

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.car1.paint(g);
        this.car2.paint(g);
    }

    public Car getCar1() {
        return this.car1;
    }

    public Car getCar2() {
        return this.car2;
    }
}