import javax.swing.*;
import java.awt.*;

public class PlannerFrame extends JFrame {
    public PlannerFrame(int width, int height, String title) {
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }
}
