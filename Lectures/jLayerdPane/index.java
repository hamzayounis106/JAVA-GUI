import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLayeredPane");
        JLayeredPane layeredPane = new JLayeredPane();
        JLabel greenJLabel = new JLabel();
        JLabel blueJLabel = new JLabel();
        JLabel redJLabel = new JLabel();
        greenJLabel.setOpaque(true);
        greenJLabel.setBackground(Color.GREEN);
        greenJLabel.setBounds(20, 20, 200, 200);
        blueJLabel.setOpaque(true);
        blueJLabel.setBackground(Color.BLUE);
        blueJLabel.setBounds(120, 120, 200, 200);
        redJLabel.setOpaque(true);
        redJLabel.setBackground(Color.RED);
        redJLabel.setBounds(220, 220, 200, 200);

        layeredPane.setBounds(0, 0, 600, 600);
        layeredPane.add(greenJLabel, Integer.valueOf(0)); // Set the layer for greenJLabel to 0
        layeredPane.add(blueJLabel, Integer.valueOf(2)); // Set the layer for blueJLabel to 1
        layeredPane.add(redJLabel, Integer.valueOf(0)); // Set the layer for redJLabel to 2

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}