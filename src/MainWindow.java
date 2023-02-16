import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 320);
        setLocation(400, 400);
        setResizable(false);
        add(new GameField());
        setVisible(true);
    }
    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}