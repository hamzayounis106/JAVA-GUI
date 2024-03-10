// This is old method, check the advance method on the bottom.
package buttons;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("icon.png");
        ImageIcon image = new ImageIcon("happy.png");
        button = new JButton();
        button.addActionListener(this);
        // Here's how it works:

        // When button.addActionListener(this); is called, it adds the current instance
        // (which is an instance of MyFrame) as an action listener to the button.

        // When an action event, such as a button click, occurs on the button, the
        // button notifies all of its action listeners (including the MyFrame instance)
        // by calling their actionPerformed(ActionEvent e) methods.

        // Since the MyFrame class implements the ActionListener interface and defines
        // the actionPerformed(ActionEvent e) method, the MyFrame instance's
        // actionPerformed(ActionEvent e) method will be invoked when an action event
        // occurs on the button.
        button.setBounds(100, 100, 200, 150);
        button.setBackground(Color.BLUE);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setIcon(icon);
        button.setText("Facebook");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Comic sans", Font.BOLD, 22));
        label = new JLabel();
        label.setIcon(image);
        label.setVisible(false);
        label.setBounds(100,250,300,200);
        this.add(label);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);

    }

    @Override // @Override is used to explicitly declare that a method is intended to override
              // a method in a superclass or implement a method from an interface, and it
              // helps catch errors related to method signature mismatches during compilation.
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Poo");
           if ( label.isVisible()) {
            label.setVisible(false);
           } else {
            label.setVisible(true);
           }
        }
    }
}

// Advance method
// package buttons;

// import javax.swing.JFrame;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;

// public class MyFrame extends JFrame {
// JButton button;

// MyFrame() {
// button = new JButton();
// button.addActionListener(e -> System.out.println("Poo"));

// button.setBounds(100, 100, 50, 50);
// this.setVisible(true);
// this.setSize(500, 500);
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(null);
// this.add(button);
// }

// }
