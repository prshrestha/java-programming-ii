
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300, 200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }

    //creates the input screen, the result screen and
    //adds the panel of three buttons
    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        //text field for the result
        JTextField result = new JTextField();
        result.setEnabled(false);
        
        //text field for the input
        JTextField input = new JTextField();
        
        JPanel pp = new createButtonPanel();
        
        CalculatorListeners cl = new CalculatorListeners(input, result, pp);
        
        //pp.
                
        container.add(result);
        container.add(input);
        container.add(pp, BorderLayout.SOUTH);
    }

    //creates the lowermost panel of three buttons
    
    
    public JFrame getFrame(){
        return frame;
    }
}