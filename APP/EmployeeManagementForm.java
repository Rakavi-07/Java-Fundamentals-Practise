import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class EmployeeManagementForm {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Employee Management");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // --- Top Panel: Input Form ---
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        String[] departments = {"HR", "Finance", "IT", "Sales"};
        JComboBox<String> deptBox = new JComboBox<>(departments);

        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField();

        JButton addButton = new JButton("Add Employee");

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(deptLabel);
        formPanel.add(deptBox);
        formPanel.add(salaryLabel);
        formPanel.add(salaryField);
        formPanel.add(new JLabel()); // empty cell
        formPanel.add(addButton);

        // --- Bottom Panel: Employee Table ---
        String[] columns = {"Name", "Department", "Salary"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // --- Button Action ---
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String dept = (String) deptBox.getSelectedItem();
                String salary = salaryField.getText();

                if (name.isEmpty() || salary.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!");
                } else {
                    tableModel.addRow(new Object[]{name, dept, salary});
                    nameField.setText("");
                    salaryField.setText("");
                }
            }
        });

        // Add panels to frame
        frame.add(formPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Show
        frame.setVisible(true);
    }
}

