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

    public boolean isVisible() {
        return visible;
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

        }
    }

    public void moveRight () {
        this.x+=5;
    }

    public void moveLeft () {
        this.x-=5;
    }
    public void moveUP () {
        this.y-=5;
    }

    public void moveDown () {
        this.y+=5;
    }
    public void moveDiagonalUp() {
        this.x+=5;
        this.y-=5;
    }

    public void moveDiaganalDown () {
        this.x-=5;
        this.y+=5;

    }



    //public void explode () {
        //this.visible = false;
   // }
    public void setVisible(boolean visible){
        this.visible=visible;
    }

}