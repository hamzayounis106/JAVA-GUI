package Lables;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;
import java.awt.GridLayout;

public class index {

    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("icon.png");
        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
        JLabel lable = new JLabel();
        lable.setText("Happy");
        lable.setIcon(image);
        lable.setHorizontalTextPosition(JLabel.CENTER);
        lable.setVerticalTextPosition(JLabel.TOP);
        lable.setForeground(Color.WHITE);
        lable.setBackground(Color.BLACK);
        lable.setOpaque(true);
       lable.setVerticalTextPosition(JLabel.BOTTOM);
        lable.setVerticalAlignment(JLabel.CENTER);
        lable.setHorizontalAlignment(JLabel.CENTER);
        lable.setFont(new Font("Cursive", Font.PLAIN, 30));
        lable.setSize(40,40);
  
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 200, 100);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(200, 0, 300, 100);
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);

        blackPanel.setLayout(new BorderLayout());
        blackPanel.setBounds(0, 100, 500, 350);
        JPanel bluPanel = new JPanel();
        bluPanel.setBackground(Color.BLUE);
        bluPanel.setBounds(0, 450, 500, 50);
        JFrame Frame = new JFrame();
        Frame.setTitle("Frames");
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        Frame.setIconImage(image.getImage());
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.add(redPanel);
        Frame.add(greenPanel);
        Frame.add(bluPanel);
        blackPanel.add(lable);
        Frame.add(blackPanel);
        Frame.setLayout(null);

    }

}
