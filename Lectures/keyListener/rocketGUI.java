import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class rocketGUI extends JFrame implements KeyListener {
    JLabel rocket;
    ImageIcon rocketimage;
    ImageIcon targetIcon;

    rocketGUI() {
       targetIcon = new ImageIcon("111.png");
       targetIcon = new ImageIcon(
        targetIcon.getImage().getScaledInstance(200, 190, java.awt.Image.SCALE_SMOOTH));
        JLabel targetJlLabel = new JLabel();
        targetJlLabel.setIcon(targetIcon);
        rocketimage = new ImageIcon("rocket.png");
        rocketimage = new ImageIcon(
                rocketimage.getImage().getScaledInstance(40, 50, java.awt.Image.SCALE_SMOOTH));

        this.add(targetJlLabel);
        this.setSize(500, 500);
        targetJlLabel.setBounds(100, 00, 200, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rocket = new JLabel();

        rocket.setBackground(Color.red);
        rocket.setIcon(rocketimage);
        rocket.setOpaque(true);
        rocket.setFocusable(true);
        rocket.setBounds(100, 500, 40, 40);
        rocket.addKeyListener(this);
        this.add(rocket);
this.pack();
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

        Character key = e.getKeyChar();
        if (key == 'w') {
            rocket.setLocation(rocket.getX(), rocket.getY() - 10);
        } else if (key == 's') {
            rocket.setLocation(rocket.getX(), rocket.getY() + 10);
        } else if (key == 'a') {
            rocket.setLocation(rocket.getX() - 10, rocket.getY());
        } else if (key == 'd') {
            rocket.setLocation(rocket.getX() + 10, rocket.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == 38) {
            rocket.setLocation(rocket.getX(), rocket.getY() - 10);
        } else if (keyCode == 40) {
            rocket.setLocation(rocket.getX(), rocket.getY() + 10);
        } else if (keyCode == 37) {
            rocket.setLocation(rocket.getX() - 10, rocket.getY());
        } else if (keyCode == 39) {
            rocket.setLocation(rocket.getX() + 10, rocket.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println(e.getKeyCode());
    }
}
