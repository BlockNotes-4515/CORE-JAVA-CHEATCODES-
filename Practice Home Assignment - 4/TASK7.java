import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TASK7 extends JFrame implements ActionListener {

    JTextField display;
    StringBuilder input = new StringBuilder();

    public TASK7() {
        // Frame setup
        setTitle("Calculator");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.BLUE);

        // Display field
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "+", "1", "2", "3",
            "-", "4", "5", "6",
            "*", "7", "8", "9",
            "/", ".", "0", "C",
            "="
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("=")) {
            try {
                String expression = input.toString();
                double result = evaluateExpression(expression);
                display.setText(expression + "=" + result);
                input.setLength(0);
            } catch (Exception ex) {
                display.setText("Error");
                input.setLength(0);
            }
        } else if (command.equals("C")) {
            input.setLength(0);
            display.setText("");
        } else {
            input.append(command);
            display.setText(input.toString());
        }
    }

    // Simple expression evaluator
    private double evaluateExpression(String expression) {
        char operator = 0;
        double num1 = 0, num2 = 0;

        for (char c : new char[]{'+', '-', '*', '/'}) {
            int index = expression.indexOf(c);
            if (index != -1) {
                operator = c;
                num1 = Double.parseDouble(expression.substring(0, index));
                num2 = Double.parseDouble(expression.substring(index + 1));
                break;
            }
        }

        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num2 != 0 ? num1 / num2 : Double.NaN;
            default: throw new IllegalArgumentException("Invalid Expression");
        }
    }

    public static void main(String[] args) {
        new TASK7();
    }
}
