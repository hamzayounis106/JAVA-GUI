import javax.swing.JOptionPane;

public class index {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        // optionPane.showMessageDialog(null, "Useless message", "Message",
        // JOptionPane.PLAIN_MESSAGE);
        // optionPane.showMessageDialog(null, "Useless message", "Message",
        // JOptionPane.CANCEL_OPTION);
        // optionPane.showMessageDialog(null, "Useless message", "Message",
        // JOptionPane.ERROR_MESSAGE);
        // optionPane.showMessageDialog(null, "Useless message", "Message",
        // JOptionPane.INFORMATION_MESSAGE);
        // optionPane.showMessageDialog(null, "Useless message", "Message",
        // JOptionPane.NO_OPTION);
        // optionPane.showMessageDialog(null, "Useless message", "Message",
        // JOptionPane.OK_CANCEL_OPTION);

        // System.out.println(optionPane.showConfirmDialog(null, "Yes or no?", "Y/N",
        // JOptionPane.YES_NO_CANCEL_OPTION));

        // optionPane.showOptionDialog(null, "Option Dialogue", "Option", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, JOptionPane, optionPane);
        //Ignore spellings
        String[] optios = {
            "You are Awosem",
            "I am Awosem",
            "We are Awosem"
        };
       System.out.println( JOptionPane.showOptionDialog(null, "OptionPane", "Option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optios, 0));
    }
}