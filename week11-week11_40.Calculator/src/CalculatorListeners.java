
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class CalculatorListeners implements ActionListener {

    private JTextField input, output;
    private JPanel resetButton;
    private CalculatorMath cm;

    public CalculatorListeners(JTextField input, JTextField output, JPanel resetButton) {
        this.input = input;
        this.output = output;
        this.resetButton = resetButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("+")) {
            int inputNum1 = Integer.parseInt(input.toString());
            int inputNum2 = Integer.parseInt(input.toString());

            int output1 = cm.sum(inputNum2, inputNum1);

            output.setText(Integer.toString(output1));
        }
        if (e.getActionCommand().equals("-")) {
            int inputNum1 = Integer.parseInt(input.toString());
            int inputNum2 = Integer.parseInt(input.toString());

            int output1 = cm.minus(inputNum2, inputNum1);

            output.setText(Integer.toString(output1));
        }
        if (e.getActionCommand().equals("Z")) {
            int output1 = cm.reset();

            output.setText(Integer.toString(output1));
        }

    }

}
