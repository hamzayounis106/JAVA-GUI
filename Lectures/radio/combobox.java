import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class combobox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String[] Genders = { "Male", "Female", "Other" };
        @SuppressWarnings("rawtypes")
        JComboBox comboBox = new JComboBox(Genders);
        comboBox.setEditable(true);
        comboBox.setSelectedIndex(2);
        comboBox.addActionListener(e -> {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        });
        frame.setSize(500, 500);
        frame.add(comboBox);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}