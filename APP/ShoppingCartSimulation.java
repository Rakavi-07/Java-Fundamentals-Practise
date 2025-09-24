import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        // Step 1: Create the main frame
        JFrame frame = new JFrame("Shopping Cart");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.setLayout(new GridLayout(0, 1));  // 0 rows = auto, 1 column


        // Step 2: Create checkboxes for items
        JCheckBox laptop = new JCheckBox("Laptop - $800");
        JCheckBox phone = new JCheckBox("Phone - $500");
        JCheckBox headphones = new JCheckBox("Headphones - $100");

        // Step 3: Create button
        JButton billButton = new JButton("Generate Bill");

        // Step 4: Add ActionListener to button
        billButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                StringBuilder items = new StringBuilder("You selected:\n");

                if (laptop.isSelected()) {
                    items.append("Laptop ($800)\n");
                    total += 800;
                }
                if (phone.isSelected()) {
                    items.append("Phone ($500)\n");
                    total += 500;
                }
                if (headphones.isSelected()) {
                    items.append("Headphones ($100)\n");
                    total += 100;
                }

                if (total == 0) {
                    JOptionPane.showMessageDialog(frame, "No items selected!");
                } else {
                    items.append("\nTotal Price: $" + total);
                    JOptionPane.showMessageDialog(frame, items.toString());
                }
            }
        });

        // Step 5: Add components to frame
        frame.add(laptop);
        frame.add(phone);
        frame.add(headphones);
        frame.add(billButton);

        // Step 6: Show frame
        frame.setVisible(true);
    }
}
