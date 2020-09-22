package practiceCode;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI_Final {
    private JFrame frame;
    private JButton addButton;
    private JLabel num1;
    private JLabel num2;
    private JLabel sum;
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField sumField;

    public GUI_Final() {
        frame = new JFrame();
        frame.setSize(400, 300);
        Border border = BorderFactory.createLineBorder(Color.BLUE, 1);

        addButton = new JButton("Add");
        addButton.addActionListener(e -> {
            Integer result = Integer.parseInt(num1Field.getText()) + Integer.parseInt(num2Field.getText());
            sumField.setText(result.toString());
        });

        num1 = new JLabel("Number 1:");
        num2 = new JLabel("Number 2:");
        sum = new JLabel("Sum:");
        num1Field = new JTextField();
        num1Field.setBorder(border);
        num2Field = new JTextField();
        num2Field.setBorder(border);
        sumField = new JTextField();
        sumField.setBorder(border);


        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(4,2));
        contentPane.add(num1);
        contentPane.add(num1Field);
        contentPane.add(num2);
        contentPane.add(num2Field);
        contentPane.add(sum);
        contentPane.add(sumField);
        contentPane.add(addButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI_Final test = new GUI_Final();
    }
}
