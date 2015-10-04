
import javax.swing.JButton;
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
public class CalculatorMath {

    private JTextField input, output;
    private JButton resetButton;

    public CalculatorMath(JTextField input, JTextField output, JButton resetButton) {
        this.input = input;
        this.output = output;
        this.resetButton = resetButton;
    }

    public int sum(int i, int j) {
        return i + j;
    }

    public int minus(int i, int j) {
        return i - j;
    }

    public int reset() {
        return 0;
    }

}
