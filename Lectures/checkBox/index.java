import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JCheckBox checkBox = new JCheckBox();
        JButton button = new JButton("Submit");
        button.setBounds(100, 100, 200, 100);
        button.addActionListener(e -> {
            System.out.println(checkBox.isSelected());
        });
        checkBox.setFont(new Font("Consolas",Font.BOLD,20));
        checkBox.setText("Are you a Human");
        frame.add(button);
        frame.add(checkBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}