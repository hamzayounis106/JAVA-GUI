import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JLabel textJLabel = new JLabel("This is test text");
        textJLabel.setBackground(Color.white);
        textJLabel.setOpaque(true);
        textJLabel.setFont(new Font("Arial", Font.BOLD, 30));
        JButton ColorPicker = new JButton("Set Color");
        ColorPicker.addActionListener(e -> {
            JColorChooser colorChooser = new JColorChooser();
            Color newColor = colorChooser.showDialog(null, "Choose Color", Color.black);
            textJLabel.setForeground(newColor);
        });
        frame.add(ColorPicker);
        frame.add(textJLabel);

        frame.setVisible(true);
    }
}