import javax.swing.*;
import java.awt.*;

public class Main {
    public Main() {
        JFrame frame = new JFrame("Tip Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        JLabel label = new JLabel("Bill");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        JTextField bill = new JTextField();
        bill.setHorizontalAlignment(JTextField.CENTER);
        frame.add(bill);
        JLabel label2 = new JLabel("Tip Percentage");
        label2.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label2);
        JTextField tipPercentage = new JTextField();
        tipPercentage.setHorizontalAlignment(JTextField.CENTER);
        frame.add(tipPercentage);
        JLabel label3 = new JLabel("Number of People");
        label3.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label3);
        JTextField numberOfPeople = new JTextField();
        numberOfPeople.setHorizontalAlignment(JTextField.CENTER);
        frame.add(numberOfPeople);
        JButton calculate = new JButton("Calculate");
        calculate.setHorizontalAlignment(JButton.CENTER);
        frame.add(calculate);
        JLabel label8 = new JLabel("");
        label8.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label8);

        JLabel label4 = new JLabel("Tip");
        label4.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label4);
        JTextField tip = new JTextField();
        tip.setHorizontalAlignment(JTextField.CENTER);
        frame.add(tip);
        JLabel label5 = new JLabel("Total");
        label5.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label5);
        JTextField total = new JTextField();
        total.setHorizontalAlignment(JTextField.CENTER);
        frame.add(total);
        JLabel label6 = new JLabel("Tip Per Person");
        label6.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label6);
        JTextField tipPerPerson = new JTextField();
        tipPerPerson.setHorizontalAlignment(JTextField.CENTER);
        frame.add(tipPerPerson);
        JLabel label7 = new JLabel("Total Per Person");
        label7.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label7);
        JTextField totalPerPerson = new JTextField();
        totalPerPerson.setHorizontalAlignment(JTextField.CENTER);
        frame.add(totalPerPerson);
        frame.setLayout(new GridLayout(9, 2));

        calculate.addActionListener(e -> {
            TipCalculator tipCalculator = new TipCalculator(Double.parseDouble(bill.getText()), Integer.parseInt(tipPercentage.getText()), Integer.parseInt(numberOfPeople.getText()));
            tip.setText(String.valueOf(tipCalculator.calculateTip()));
            total.setText(String.valueOf(tipCalculator.totalBill()));
            tipPerPerson.setText(String.valueOf(tipCalculator.tipPerPerson()));
            totalPerPerson.setText(String.valueOf(tipCalculator.totalPerPerson()));
        });
    }


    public static void main (String[] args) {
        Main GUI = new Main();
    }
}
