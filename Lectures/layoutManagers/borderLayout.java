package layoutManagers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class borderLayout {
    public static void main(String[] args) {
        // Layout manager: Layout manager is used to layout (or arrange) the GUI
        // components in a container.
        // 3 Commonly used layout managers are:
        // 1. BorderLayout: The BorderLayout is used to arrange the components in five
        // regions: north, south, east, west, and center. All extra space is placed in
        // center.
        // 2. FlowLayout: The FlowLayout is used to arrange the components in a line,
        // one after another (in a flow).
        // 3. GridLayout: The GridLayout is used to arrange the components in a
        // rectangular grid.

        // BorderLayout
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10)); // Providing Gap between Panels
      

        // Creating Panels
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        // Assining Colors to Panels
        northPanel.setBackground(Color.red);
        westPanel.setBackground(Color.blue);
        eastPanel.setBackground(Color.green);
        southPanel.setBackground(Color.orange);
        centerPanel.setBackground(Color.black);

        // Dimensions of Panels
        northPanel.setPreferredSize(new Dimension(100, 100));
        westPanel.setPreferredSize(new Dimension(100, 100));
        eastPanel.setPreferredSize(new Dimension(100, 100));
        southPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));

        // Adding panels to Frame
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        // In the same way you can add sub-panels inside any panel, and so on. But the parent panel should have a BorderLayout to achieve simmilar layout of the current frame.


        //Sometimes the components added to frame might not render if they are added after   frame.setVisible(true); , so always add components before setting frame visible.
        frame.setVisible(true);
    }
}