import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class hp {
    JProgressBar bar = new JProgressBar(0, 100);
    JFrame frame = new JFrame("Progress Bar");

    hp() {
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setBounds(0, 0, 350, 30);
        bar.setForeground(Color.red);
        bar.setFont(new Font("SansSerif", Font.ITALIC, 19));
        /// Frame
        frame.add(bar);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        increment();
    }

    public void increment() {
        int counter = 100;
        while (counter > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            counter -= 1;
            bar.setValue(counter);
        }
        bar.setString("You are Dead (⊙ˍ⊙)");
    }
}
