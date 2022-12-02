import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class CalculatorFrame extends JFrame implements ActionListener {
    public CalculatorFrame() {
        double sum = 0;
        ArrayList<String> fullEquation = new ArrayList<>();

        //Main Calculator Frame
        setLayout(new BorderLayout(5, 10));

        Font myFont1 = new Font("SansSerif ", Font.BOLD, 26);
        Font myFont2 = new Font("SansSerif ", Font.BOLD, 26);

        //Display JTextField in NORTH
        JTextField display = new JTextField();
        display.setBounds(0, 0, 0, 0);
        display.setFont(myFont1);
        display.setEditable(false);
        display.setOpaque(true);
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        display.setBackground(Color.ORANGE);
        add(display, BorderLayout.NORTH);

        //P1 Number panel in WEST
        JPanel panel1 = new JPanel();
        panel1.setFont(myFont2);
        panel1.setLayout(new GridLayout(4, 3, 5, 5));

        JButton b1 = new JButton("1");
        b1.addActionListener(event -> {
            String a = process(event, "1");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
//        b1.setOpaque(true);
        b1.setBackground(Color.BLACK);
//        b1.setBorderPainted(false);
//        b1.setForeground(Color.GRAY);

        JButton b2 = new JButton("2");
        b2.addActionListener(event -> {
            String a = process(event, "2");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b3 = new JButton("3");
        b3.addActionListener(event -> {
            String a = process(event, "3");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b4 = new JButton("4");
        b4.addActionListener(event -> {
            String a = process(event, "4");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b5 = new JButton("5");
        b5.addActionListener(event -> {
            String a = process(event, "5");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b6 = new JButton("6");
        b6.addActionListener(event -> {
            String a = process(event, "6");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b7 = new JButton("7");
        b7.addActionListener(event -> {
            String a = process(event, "7");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b8 = new JButton("8");
        b8.addActionListener(event -> {
            String a = process(event, "8");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b9 = new JButton("9");
        b9.addActionListener(event -> {
            String a = process(event, "9");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton b0 = new JButton("0");
        b0.addActionListener(event -> {
            String a = process(event, "0");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton point = new JButton(".");
        point.addActionListener(event -> {
            String a = process(event, ".");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });

        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel1.add(b8);
        panel1.add(b9);
        panel1.add(b0);
        panel1.add(point);


        //P2 Operators panel
        JPanel panel2 = new JPanel();
        panel2.setFont(myFont2);
        panel2.setLayout(new GridLayout(4, 1, 5, 5));

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(event -> {
            String a = process(event, "+");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(event -> {
            String a = process(event, "-");
            fullEquation.add(a);
            setDisplayValue(fullEquation, display);
        });
        JButton clearBtn = new JButton("CLEAR");
        clearBtn.addActionListener(event -> {
            String a = process(event, "CLEAR");
            fullEquation.clear();
            setDisplayValue(fullEquation, display);
        });
        JButton sumBtn = new JButton("=");
        sumBtn.addActionListener(event -> {
            setSum(fullEquation, display);
        });

        panel2.add(plusBtn);
        panel2.add(minusBtn);
        panel2.add(clearBtn);
        panel2.add(sumBtn);

        //P3 Grid Layout containing P1 and P2
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 2, 5, 5));
        panel3.add(panel1);
        panel3.add(panel2);

        add(panel3, BorderLayout.CENTER);
    }


    private String process(ActionEvent ae, String i) {
        return i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * create a method to generate a string by an arraylist
     * then set the display value to the string
     *
     * @param displayValue arrayList contains all clicked numbers
     * @param textField    calculator display
     */
    public void setDisplayValue(ArrayList<String> displayValue, JTextField textField) {
        StringBuilder equation = new StringBuilder();
        for (String s : displayValue) {
            equation.append(s);
        }
        textField.setText(String.valueOf(equation));
    }

    public void setSum(ArrayList<String> displayValue, JTextField textField) {
        double sum = 0;
        ArrayList<String> strNums = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < displayValue.size(); i++) {
            if (displayValue.get(i).equals("+") || displayValue.get(i).equals("-")) {
                strNums.add(temp);
                temp = "";
                if (displayValue.get(i).equals("+")) {
                    strNums.add("+");
                } else {
                    strNums.add("-");
                }
            } else {
                temp = temp + displayValue.get(i);
            }
        }
        strNums.add(temp);

        for (int i = 0; i < strNums.size(); i++) {
            if (strNums.get(i).equals("+")) {
                Double num1 = Double.parseDouble(strNums.get(i - 1));
                Double num2 = Double.parseDouble(strNums.get(i + 1));
                sum = sum + num1+ num2;
                strNums.set(i + 1, String.valueOf(sum));
                strNums.remove(i);
                strNums.remove(i - 1);
            } else if (strNums.get(i).equals("-")) {
                Double num1 = Double.parseDouble(strNums.get(i - 1));
                Double num2 = Double.parseDouble(strNums.get(i + 1));
                sum = sum + num1 - num2;
                strNums.set(i + 1, String.valueOf(sum));
                strNums.remove(i);
                strNums.remove(i - 1);
                System.out.println(sum);
            }
            if (strNums.isEmpty()){
                break;
            }
        }

        for (int i = 0; i < strNums.size(); i++) {
//            System.out.println(strNums.get(i));
        }
        textField.setText(String.valueOf(sum));

    }
}
