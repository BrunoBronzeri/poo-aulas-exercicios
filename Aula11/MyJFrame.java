import java.awt.Color;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    
    public MyJFrame() {
        setTitle("My JFrame Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public static void main(String[] args) {
        MyJFrame frame = new MyJFrame();
        frame.setVisible(true);
    }
    
}
