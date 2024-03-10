import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenu viewmenu = new JMenu("View");
        JMenu helpmenu = new JMenu("Help");

        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem exitItem = new JMenuItem("Exit");

        saveItem.setMnemonic(KeyEvent.VK_S);
        saveItem.addActionListener(e ->{
            System.out.println("Saved");
        });

        filemenu.add(saveItem);
        filemenu.add(loadItem);
        filemenu.add(exitItem);
        menuBar.add(filemenu);
        menuBar.add(viewmenu);
        menuBar.add(helpmenu);

        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}