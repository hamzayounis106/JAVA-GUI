import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class flowLayout {

    public static void main(String[] args) {
        System.out.println("FlowLayout is used to arrange the components in a line, one after another (in a flow).");
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        // FlowLayout is default layout manager, so no need to provide it. In parameters
        // pass the y and x gaps/amrgin. Default is 5, 5. Trailings is used to put
        // everthing on right, Leading is ued to put everything on left and Center is
        // used to put everything on Center

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
