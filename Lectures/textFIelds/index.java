import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Box");
        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200, 40));
        textArea.setFont(new Font("Cursive", Font.ITALIC, 20));
        textArea.setForeground(Color.green);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.black);
        textArea.setCaretColor(Color.white);
        frame.setBackground(Color.black);
        JButton button = new JButton("Submit");
      
        frame.add(button);
        frame.add(textArea);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();
        button.addActionListener(e -> {
            System.out.println(textArea.getText());
            button.setEnabled(false);
        });
        frame.setVisible(true);

    }
}