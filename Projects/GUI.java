import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class GUI extends JFrame {
    private JPanel actualTaskcontainer;

    // Constructor
    GUI() {
        this.setTitle("Your To Do List");
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Create panel for header and task container
        JPanel headerAndTaskPanel = new JPanel(new BorderLayout());
        headerAndTaskPanel.setBackground(Color.WHITE);
        JLabel headerLabel2 = new JLabel("<html><center>You don't have any task, are you that much lazy?<br>Type your task below:</center></html>");
        JLabel headerLabel = new JLabel("To-do List");
        headerLabel.setFont(new Font("Monospaced", Font.BOLD, 24)); // Set font size and style
        headerLabel.setHorizontalAlignment(JLabel.CENTER); // Center-align the text
        headerAndTaskPanel.add(headerLabel, BorderLayout.NORTH);

        headerLabel2.setFont(new Font("Monospaced", Font.BOLD, 14)); // Set font size and style
        headerLabel2.setHorizontalAlignment(JLabel.CENTER); // Center-align the text
        headerAndTaskPanel.add(headerLabel2, BorderLayout.PAGE_END);

        // Create input label panel
        JPanel inputLabel = new JPanel();
        inputLabel.setLayout(new BorderLayout());
        JTextArea taskTextArea = new JTextArea();
        JButton pushButton = new JButton("Add Task");
        pushButton.setFont(new Font("Monospaced", Font.BOLD, 20));
        pushButton.setBackground(Color.black);
        pushButton.setForeground(Color.white);
        pushButton.setFocusable(false);

        taskTextArea.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 16));
        
        actualTaskcontainer = new JPanel();
        actualTaskcontainer.setPreferredSize(new Dimension(600, 550));
     
        pushButton.addActionListener(e -> {

            // Create new task
            if (taskTextArea.getText().isEmpty()) {
                JOptionPane optionPane = new JOptionPane();
                optionPane.showMessageDialog(null, "Empty Task is not a task, just go to bed", "Message",
                        JOptionPane.ERROR_MESSAGE);
                optionPane.setFocusable(false);
                optionPane.setFont(new Font("Monospaced", Font.BOLD, 16));
            } else {
                headerLabel2.setVisible(false);
                taskCreator newtask = new taskCreator(taskTextArea.getText());
                JLabel addnewtask = newtask.getTaskLabel();
                JButton adddelButton = newtask.getTaskButton();

                addnewtask.setPreferredSize(new Dimension(450, 20));
                adddelButton.setPreferredSize(new Dimension(60, 20));
                actualTaskcontainer.add(addnewtask, BorderLayout.WEST);
                actualTaskcontainer.add(adddelButton, BorderLayout.EAST);
                this.revalidate();
                this.repaint();
                taskTextArea.setText("");
            }

        });

        inputLabel.setPreferredSize(new Dimension(600, 25));
        taskTextArea.setPreferredSize(new Dimension(450, 25));
        pushButton.setPreferredSize(new Dimension(100, 18));
        inputLabel.add(taskTextArea, BorderLayout.WEST);
        inputLabel.add(pushButton, BorderLayout.CENTER);

        JPanel finalTaskview = new JPanel();
        finalTaskview.add(actualTaskcontainer, BorderLayout.NORTH);

        // Set layout and add components to the frame
        headerAndTaskPanel.add(finalTaskview, BorderLayout.CENTER);
        this.add(headerAndTaskPanel, BorderLayout.NORTH);
        this.add(inputLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}

class taskCreator {
    private JLabel taskLabel;
    private JButton taskdelButton;

    // Constructor
    taskCreator(String task) {
        taskLabel = new JLabel(task);
        taskdelButton = new JButton();
        taskLabel.setFont(new Font("Monospaced", Font.BOLD, 18));
        taskdelButton.setFont(new Font("Monospaced", Font.BOLD, 16));
        taskdelButton.setBackground(Color.black);
        taskdelButton.setForeground(Color.white);
        taskdelButton.setFocusable(false);
        taskdelButton.setText("X");
        taskdelButton.addActionListener(e -> {
            taskLabel.setVisible(false);
            taskdelButton.setVisible(false);
        });
    }

    public JLabel getTaskLabel() {
        return taskLabel;
    }

    public JButton getTaskButton() {
        return taskdelButton;
    }
}