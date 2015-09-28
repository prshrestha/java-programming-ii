package greeter.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
    }

    private void createComponents(Container container) {
    }

    public JFrame getFrame() {
        return frame;
    }
}
