package exercicio_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private final JTextField numField1;
    private final JTextField numField2;
    private final JTextField resultField;
    private final JButton addButton;
    private final JButton subtractButton;
    private final JButton multiplyButton;
    private final JButton divideButton;

    public Calculator() {
        setTitle("Calculadora");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 5, 5));

        numField1 = new JTextField();
        numField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("÷");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        inputPanel.add(new JLabel("Número 1:"));
        inputPanel.add(numField1);

        inputPanel.add(new JLabel("Número 2:"));
        inputPanel.add(numField2);

        inputPanel.add(new JLabel("Resultado:"));
        inputPanel.add(resultField);

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);

        setLocationRelativeTo(null);
    }

    public void sum(float num1, float num2) {
        double result = num1 + num2;
        resultField.setText(String.valueOf(result));
    }

    public void subtract(float num1, float num2) {
        double result = num1 - num2;
        resultField.setText(String.valueOf(result));
    }

    public void multiply(float num1, float num2) {
        double result = num1 * num2;
        resultField.setText(String.valueOf(result));
    }

    public void divide(float num1, float num2) {
        if (num2 == 0) {
            resultField.setText("Cannot divide by zero");
        } else {
            double result = num1 / num2;
            resultField.setText(String.valueOf(result));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());

        if (e.getSource() == addButton) {
            sum((float) num1, (float) num2);
        }
        if (e.getSource() == subtractButton) {
            subtract((float) num1, (float) num2);
        }
        if (e.getSource() == multiplyButton) {
            multiply((float) num1, (float) num2);
        }
        if (e.getSource() == divideButton) {
            divide((float) num1, (float) num2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
