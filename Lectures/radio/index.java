import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

public class index {
    public static void main(String[] args) {
        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.addActionListener(e -> {
            System.out.println("Male");
        });
        JRadioButton femaleButton = new JRadioButton("FeMale");
        femaleButton.addActionListener(e -> {
            System.out.println("FeMale");
        });
        JRadioButton otherButton = new JRadioButton("Other");
        otherButton.addActionListener(e -> {
            System.out.println("male");
        });
        JFrame frame = new JFrame();
        ButtonGroup group = new ButtonGroup();
        group.add(otherButton);
        group.add(maleButton);
        group.add(femaleButton);
        frame.add(otherButton);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}