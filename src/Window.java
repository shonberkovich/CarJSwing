import javax.swing.*;

public class Window extends JFrame {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;


    public Window () {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        MainScene mainScene = new MainScene(WINDOW_WIDTH / 4, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(mainScene);
        MenuPane menuPane = new MenuPane(0, 0, WINDOW_WIDTH / 4, WINDOW_HEIGHT);
        this.add(menuPane);
        this.setVisible(true);
    }
}