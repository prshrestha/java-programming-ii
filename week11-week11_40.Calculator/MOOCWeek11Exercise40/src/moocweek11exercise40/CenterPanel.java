/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise40;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class CenterPanel {
    private JPanel panel;
    private JButton plus;
    private JButton minus;
    private JButton zero;
    private ArrayList<JButton> buttons;
    
    public CenterPanel(){
        this.buttons = new ArrayList<>();
        this.panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        
        this.plus = new JButton("+");
        this.minus = new JButton("-");
        this.zero = new JButton("Z");
    }
    
    public void renderPanel(Listener listen){
        this.plus.addActionListener(listen);
        this.minus.addActionListener(listen);
        this.zero.addActionListener(listen);
        this.zero.setEnabled(false);
        
        this.buttons.add(this.plus);
        this.buttons.add(this.minus);
        this.buttons.add(this.zero);
        
        this.panel.add(this.plus);
        this.panel.add(this.minus);
        this.panel.add(this.zero);
    }
    
    public JPanel getPanel(){
        return this.panel;
    }
    
    public JButton getPlus(){
        return this.plus;
    }
    
    public JButton getMinus(){
        return this.minus;
    }
    
    public JButton getZero(){
        return this.zero;
    }
    
    public void getButtons(Listener listen){
        listen.recordButtons(this.buttons);
    }
}
