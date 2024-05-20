import java.awt.*;

public class Car {
    public static final int BODY_WIDTH = 100;
    public static final int BODY_HEIGHT = 80;
    private int x;
    private int y;
    private boolean visible;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
        this.visible = true;
    }

    public void paint (Graphics g) {
        if (this.visible) {
            g.setColor(Color.green);
            g.fillRect(this.x,
                    this.y,
                    BODY_WIDTH,
                    BODY_HEIGHT);
            //FRONT
            g.setColor(Color.BLUE);
            g.fillRect(
                    this.x + BODY_WIDTH,
                    (this.y + BODY_HEIGHT / 2),
                    BODY_WIDTH / 2,
                    BODY_HEIGHT / 2);
            g.setColor(Color.RED);
            g.fillOval(this.x,
                    this.y + BODY_HEIGHT - BODY_WIDTH / 4 /2,
                    BODY_WIDTH / 4,
                    BODY_WIDTH / 4);
            g.fillOval(this.x + BODY_WIDTH,
                    this.y + BODY_HEIGHT - BODY_WIDTH / 4 / 2,
                    BODY_WIDTH / 4,
                    BODY_WIDTH / 4);
        } else {
            g.setColor(Color.RED);
            g.fillRect(0, 0,1000, 1000);
        }
    }

    public void moveRight () {
        this.x++;
    }

    public void moveLeft () {
        this.x--;
    }
    public void moveUP () {
        this.y--;
    }

    public void moveDown () {
        this.y++;
    }
    public void moveDiaganalUp () {
        this.x++;
        this.y--;
    }

    public void moveDiaganalDown () {
        this.x--;
        this.y++;

    }



    public void explode () {
        this.visible = false;
    }
}