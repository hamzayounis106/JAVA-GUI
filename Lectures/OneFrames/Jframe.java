package OneFrames;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jframe extends JFrame {

    public Jframe() {
        this.setTitle("Frame");
        this.setVisible(true);
        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        this.setBackground(Color.CYAN);
        this.setSize(800, 600);
         ImageIcon image = new ImageIcon("xhime_logo.enc");
        this.setIconImage(image.getImage());
        JLabel newLabel = new JLabel();
        newLabel.setText("Xhime");
        newLabel.setIcon(image);
        newLabel.setForeground(Color.gray);
        newLabel.setBackground(Color.black);
        this.add(newLabel); 
        this.setLayout(null);
    }

}
