import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, equalButton, clearButton;
    private JPanel panel;

    private double num1, num2, result;
    private String operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 30, 240, 30);
        frame.add(textField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equalButton;
        functionButtons[5] = clearButton;

        for (int i = 0; i < 10; i++) {
            numberButtons[i].addActionListener(new NumberButtonActionListener());
        }

        for (int i = 0; i < 6; i++) {
            functionButtons[i].addActionListener(new FunctionButtonActionListener());
        }

        panel = new JPanel();
        panel.setBounds(30, 80, 240, 250);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(numberButtons[0]);
        panel.add(clearButton);
        panel.add(equalButton);
        panel.add(divButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class NumberButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 10; i++) {
                if (e.getSource() == numberButtons[i]) {
                    textField.setText(textField.getText().concat(String.valueOf(i)));
                }
            }
        }
    }

    private class FunctionButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = "+";
                textField.setText("");
            } else if (e.getSource() == subButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = "-";
                textField.setText("");
            } else if (e.getSource() == mulButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = "*";
                textField.setText("");
            } else if (e.getSource() == divButton) {
                num1 = Double.parseDouble(textField.getText());
                operator = "/";
                textField.setText("");
            } else if (e.getSource() == equalButton) {
                num2 = Double.parseDouble(textField.getText());

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }

                textField.setText(String.valueOf(result));
            } else if (e.getSource() == clearButton) {
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
