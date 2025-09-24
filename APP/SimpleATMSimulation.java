import java.awt.*;
import javax.swing.*;

public class SimpleATMSimulation {
    private static double balance = 1000.0; // initial balance

    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("ATM Login");
        loginFrame.setSize(250, 120);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(new FlowLayout());

        JLabel pinLabel = new JLabel("Enter PIN:");
        JPasswordField pinField = new JPasswordField(10);
        JButton loginButton = new JButton("Login");

        loginFrame.add(pinLabel);
        loginFrame.add(pinField);
        loginFrame.add(loginButton);

        loginButton.addActionListener(e -> {
            String enteredPin = new String(pinField.getPassword());
            if (enteredPin.equals("1234")) {
                loginFrame.dispose(); // close login
                showATMMenu();
            } else {
                JOptionPane.showMessageDialog(loginFrame, "Wrong PIN!");
            }
        });

        loginFrame.setVisible(true);
    }

    private static void showATMMenu() {
        JFrame atmFrame = new JFrame("ATM Menu");
        atmFrame.setSize(250, 150);
        atmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        atmFrame.setLayout(new FlowLayout());

        JButton checkBalance = new JButton("Check Balance");
        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");

        checkBalance.addActionListener(e -> 
            JOptionPane.showMessageDialog(atmFrame, "Balance: $" + balance));

        deposit.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter deposit amount:");
            double amt = Double.parseDouble(input);
            balance += amt;
            JOptionPane.showMessageDialog(atmFrame, "Deposited $" + amt);
        });

        withdraw.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter withdraw amount:");
            double amt = Double.parseDouble(input);
            balance -= amt;
            JOptionPane.showMessageDialog(atmFrame, "Withdrew $" + amt);
        });

        atmFrame.add(checkBalance);
        atmFrame.add(deposit);
        atmFrame.add(withdraw);

        atmFrame.setVisible(true);
    }
}
