//based from alex lee
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

        private int count = 0;
        private JLabel label;
        private JFrame frame;
        private JPanel panel;

        public GUI()
        {
            //constructors
            JFrame frame = new JFrame(); //window

            JButton button = new JButton("Click Me!");
            button.addActionListener(this);

            label = new JLabel("Number of clicks: 0");

            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); //setting up the panel
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("First Gui");
            frame.pack();
            frame.setVisible(true);
        }
    public static void main (String[]args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //tied to the button object
        count++;
        label.setText("Number of clicks: " + count);
    }
}
