package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator extends JFrame implements ActionListener {
    double sum = 0;
    JTextField jTextField;
    JButton[] numButton = new JButton[11];
    JButton[] funcButton = new JButton[4];
    JButton addButton, subButton;
    JButton equalButton, clearButton;
    JPanel p1 = new JPanel(new GridLayout(4,3,5,5));
    JPanel p2 = new JPanel(new GridLayout(4,1,5,5));
    JPanel p3 = new JPanel(new GridLayout(1,2,5,5));
    Font font = new Font("Arial", Font.BOLD, 30);
    Font displayFont = new Font("Arial", Font.BOLD, 40);

    public Calculator() {
        setLayout(new BorderLayout());

        jTextField = new JTextField();
        jTextField.setFont(displayFont);
        jTextField.setEditable(false);
        jTextField.setBackground(Color.darkGray);
        jTextField.setForeground(Color.WHITE);

        addButton = new JButton("+");
        subButton = new JButton("-");
        equalButton = new JButton("=");
        clearButton = new JButton("CLEAR");

        funcButton[0] = addButton;
        funcButton[1] = subButton;
        funcButton[2] = clearButton;
        funcButton[3] = equalButton;

        for (int i = 0; i < 4; i++){
            p2.add(funcButton[i]);
            funcButton[i].addActionListener(this);
            funcButton[i].setFont(font);
            funcButton[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++){
            numButton[i] = new JButton(String.valueOf(i));
        }
        numButton[10] = new JButton(".");

        for (int i = 0; i < numButton.length; i++){
            numButton[i].addActionListener(this);
            numButton[i].setFont(font);
            numButton[i].setFocusable(false);
            p1.add(numButton[i]);
        }


        p3.add(p1);
        p3.add(p2);

        add(jTextField, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <11; i++){
            if (e.getSource() == numButton[i]){
                jTextField.setText(jTextField.getText().concat(numButton[i].getText()));
            }
        }
        if (e.getSource() == addButton){
            jTextField.setText(jTextField.getText().concat(addButton.getText()));
        }
        if (e.getSource() == subButton){
            jTextField.setText(jTextField.getText().concat(subButton.getText()));
        }
        if (e.getSource() == clearButton){
            jTextField.setText("");
            sum = 0;
        }
        if (e.getSource() == equalButton){
            String equation = jTextField.getText();

            StringBuilder temp = new StringBuilder();
            LinkedList<String> numsAndOps = new LinkedList<>();

            for (int i = 0; i < equation.length(); i++) {
                if (equation.charAt(i) == '+'){
                    numsAndOps.add(temp.toString());
                    temp.delete(0,temp.length());
                    numsAndOps.add("+");
                } else if (equation.charAt(i) == '-') {
                    numsAndOps.add(temp.toString());
                    temp.delete(0,temp.length());
                    numsAndOps.add("-");
                }
                else {
                    temp.append(equation.charAt(i));
                }
            }
            numsAndOps.add(String.valueOf(temp));


            for (int i= 0; i < numsAndOps.size(); i++){
                if (i == 0){
                    sum = Double.parseDouble(numsAndOps.get(i));
                }
                if (numsAndOps.get(i).equals("+")){
                    sum += (Double.parseDouble(numsAndOps.get(i+1)));
                } else if (numsAndOps.get(i).equals("-")) {
                    sum -= (Double.parseDouble(numsAndOps.get(i+1)));
                }
            }
            jTextField.setText(String.valueOf(sum));
        }
    }
}
