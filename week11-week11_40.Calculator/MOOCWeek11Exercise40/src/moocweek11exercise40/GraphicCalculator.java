/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise40;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Trigg
 */
public class GraphicCalculator implements Runnable{
    private JFrame frame;
    
    public GraphicCalculator(){
        this.frame = new JFrame("Calculator");
    }

    @Override
    public void run() {
        this.frame.setPreferredSize(new Dimension(400, 175));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    public void createComponents(Container container){
        container.setLayout(new GridLayout(3, 1));
        
        JTextField numberTop = new JTextField(0 + "");
        JTextField numberBottom = new JTextField();
        numberTop.setEnabled(false);
        
        CenterPanel cp = new CenterPanel();
        Listener listen = new Listener(numberTop, numberBottom);
        cp.renderPanel(listen);
        
        container.add(numberTop, BorderLayout.NORTH);
        container.add(numberBottom, BorderLayout.CENTER);
        container.add(cp.getPanel(), BorderLayout.SOUTH);
        
        cp.getButtons(listen);
    }
}
