package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(300, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        ButtonGroup radioButtons = new ButtonGroup();
        
        container.setLayout(layout);

        JLabel text = new JLabel("Are you?");
        container.add(text);

        //create radio buttons
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        //add radio buttons
        radioButtons.add(yes);
        radioButtons.add(no);
        
        //add radio buttons to the canvas
        container.add(yes);
        container.add(no);

        JLabel reason = new JLabel("Why?");
        container.add(reason);

        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton funReason = new JRadioButton("Because it is fun!");

        radioButtons.add(noReason);
        radioButtons.add(funReason);
        
        container.add(noReason);
        container.add(funReason);
        
        JButton done = new JButton("Done!");
        container.add(done);
    }

    public JFrame getFrame() {
        return frame;
    }
}
