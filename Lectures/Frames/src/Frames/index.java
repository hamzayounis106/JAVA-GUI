package Frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class index {

	public static void main(String[] args) {
JLabel lable = new JLabel();
ImageIcon image = new ImageIcon("logo.png");
		lable.setText("Wordpress");
		lable.setIcon(image);
		lable.setHorizontalTextPosition(JLabel.CENTER);
		lable.setVerticalTextPosition(JLabel.TOP);
		lable.setForeground(Color.WHITE);
		
		JFrame Frame = new JFrame();
		Frame.setBackground(new Color(0x000000));
		Frame.setTitle("Frames");
		Frame.setSize(500,500);
		Frame.setVisible(true);
		Frame.setIconImage(image.getImage());
		Frame.add(lable);
		Frame.pack();
Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
