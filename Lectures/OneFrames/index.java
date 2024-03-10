package OneFrames;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.*;

public class index {

    public static void main(String[] args) {
        JLabel lable = new JLabel();
        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
        lable.setText("Happy");
        lable.setIcon(image);
        lable.setHorizontalTextPosition(JLabel.CENTER);
        lable.setVerticalTextPosition(JLabel.TOP);
        lable.setForeground(Color.WHITE);
        lable.setBackground(Color.BLACK);
        lable.setOpaque(true);
        lable.setBorder(border);
        lable.setVerticalAlignment(JLabel.CENTER);
        lable.setHorizontalAlignment(JLabel.CENTER);
        lable.setFont(new Font("Cursive", Font.PLAIN, 30));
        JFrame Frame = new JFrame();
        Frame.setTitle("Frames");
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        Frame.setIconImage(image.getImage());
        Frame.add(lable);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
    }

}
