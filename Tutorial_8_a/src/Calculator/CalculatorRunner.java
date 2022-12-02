package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame .setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
