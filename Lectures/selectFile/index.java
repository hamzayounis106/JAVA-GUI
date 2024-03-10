import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton opener = new JButton("Select File");
        opener.addActionListener(e -> {
            JFileChooser gFileChooser = new JFileChooser();

            int response = gFileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(gFileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        });
        JButton saver = new JButton("Save File");
        saver.addActionListener(e -> {
            JFileChooser gFileChooser = new JFileChooser();

            int response = gFileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(gFileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        });
        opener.setBounds(0, 0, 100, 40);
        saver.setBounds(45, 45, 100, 40);
        frame.add(opener);
        frame.add(saver);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}