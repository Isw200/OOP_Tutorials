import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CalculatorFrame frame = new CalculatorFrame();
        frame.setTitle("Calculator");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}