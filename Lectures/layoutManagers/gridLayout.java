import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class gridLayout {
    public static void main(String[] args) {
        System.out.println("GridLayout is used to arrange the components in a rectangular grid.");
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 4, 10, 10)); // 3 rows, 4 columns, 10 x 10 gap
        // Adding Buttons to frame
        frame.add(new JButton(" 1"));
        frame.add(new JButton(" 2"));
        frame.add(new JButton(" 3"));
        frame.add(new JButton(" 4"));
        frame.add(new JButton(" 5"));
        frame.add(new JButton(" 6"));
        frame.add(new JButton(" 7"));
        frame.add(new JButton(" 8"));
        frame.add(new JButton(" 9"));
        frame.add(new JButton(" 10"));

        // Making the Frame Visible
        frame.setVisible(true);
    }
}
