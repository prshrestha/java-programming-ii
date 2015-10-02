package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Notice Board");
        this.frame.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textAreaTop = new JTextField("The message in the board.");
        JLabel textAreaButton = new JLabel();
        JButton copyButton = new JButton("Copy!");

    ActionEventListener listener = new ActionEventListener(textAreaTop, textAreaButton);

        copyButton.addActionListener(listener);

        container.add(textAreaTop);
        container.add(copyButton);
        container.add(textAreaButton);
    }
}
