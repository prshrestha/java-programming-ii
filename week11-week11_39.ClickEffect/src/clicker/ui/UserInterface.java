package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    private Calculator cal;

    public UserInterface(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public void run() {
        this.frame = new JFrame("Click Effect");
        this.frame.setPreferredSize(new Dimension(200, 100));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);

        JLabel text = new JLabel(Integer.toString(this.cal.giveValue()));

        JButton click = new JButton("Click!");

        ClickListener calListener = new ClickListener(this.cal, text);

        click.addActionListener(calListener);

        container.add(text);
        container.add(click);
    }

    public JFrame getFrame() {
        return frame;
    }
}
