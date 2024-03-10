import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage {
    JButton button = new JButton("Open New Window");
    JFrame frame = new JFrame();

    LaunchPage() {
        button.setBounds(100, 100, 200, 100);
        button.setFocusable(false);
        button.addActionListener(e -> {
            frame.dispose();
            MyFrame window = new MyFrame();
            window.setVisible(true);
        });
        frame.add(button);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();    }

}
