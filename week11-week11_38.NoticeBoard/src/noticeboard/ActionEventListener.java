/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author
 */
public class ActionEventListener implements ActionListener {
    
    private JTextField origin;
    private JLabel destination;
    
    public ActionEventListener(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
}
