/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise40;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class Listener implements ActionListener{
    private JTextField topNumber;
    private JTextField bottomNumber;
    private Calculator calc;
    private JButton button;
    
    public Listener(JTextField topNumber, JTextField bottomNumber){
        this.topNumber = topNumber;
        this.bottomNumber = bottomNumber;
        this.calc = new Calculator();
        this.button = new JButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.topNumber.getText().equals("0")){
            this.button.setEnabled(false);
        }
        
        try {
            if (e.getActionCommand().equals("+")) {
                this.topNumber.setText(this.calc.add(Integer.parseInt(this.topNumber.getText()), Integer.parseInt(this.bottomNumber.getText())) + "");
                this.bottomNumber.setText("");
                this.button.setEnabled(true);
                if (this.topNumber.getText().equals("0")) {
                    this.button.setEnabled(false);
                }
            } else if (e.getActionCommand().equals("-")) {
                this.topNumber.setText(this.calc.minus(Integer.parseInt(this.topNumber.getText()), Integer.parseInt(this.bottomNumber.getText())) + "");
                this.bottomNumber.setText("");
                this.button.setEnabled(true);
                if (this.topNumber.getText().equals("0")) {
                    this.button.setEnabled(false);
                }
            } else if (e.getActionCommand().equals("Z")) {
                this.topNumber.setText("0");
                this.bottomNumber.setText("");
                this.button.setEnabled(false);
            }
        } catch (Exception x) {
            this.bottomNumber.setText("");
        }
    }
    
    public void recordButtons(ArrayList<JButton> buttons) {
        for (JButton recordZ : buttons) {
            if (recordZ.getText().equals("Z")) {
                this.button = recordZ;
            }
        }
    }
}
