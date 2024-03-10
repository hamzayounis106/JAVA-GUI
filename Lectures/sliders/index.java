import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SLider");
        JSlider slider = new JSlider(0, 100, 23);
        JLabel label = new JLabel("23°C", SwingConstants.CENTER);
        ///
        ///
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setBounds(100, 100, 200, 200);
        slider.setFont(new Font("Poppins", Font.ITALIC, 20));
        slider.setPaintLabels(true);
        slider.addChangeListener(e -> {
            label.setText(slider.getValue() + "°C");
        });
        ///
        ///
        label.setBounds(100, 100, 200, 200);
        label.setFont(new Font("Poppins", Font.ITALIC, 20));
     
        label.setHorizontalTextPosition(JLabel.RIGHT);
        ///
        ///
        frame.add(slider, BorderLayout.NORTH);
        frame.add(label, BorderLayout.SOUTH);
        // frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}