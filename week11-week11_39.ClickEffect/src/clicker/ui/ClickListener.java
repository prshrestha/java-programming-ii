/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author
 */
public class ClickListener implements ActionListener {

    private JLabel label;
    private Calculator cal;

    public ClickListener(Calculator cal, JLabel label) {
        this.label = label;
        this.cal = cal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cal.increase();
        this.label.setText(Integer.toString(cal.giveValue()));
    }
}
