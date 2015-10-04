
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
class createButtonPanel extends JPanel {

    public JPanel createButtonPanel() {

        JPanel buttons = new JPanel(new GridLayout(1, 3));

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");

        buttons.add(plus);
        buttons.add(minus);
        buttons.add(reset);

        return buttons;
    }

}
