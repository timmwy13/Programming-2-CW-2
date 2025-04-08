package system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class App {

public static void main(String args[]) {
    SwingUtilities.invokeLater(() -> new App().createGUI());
}

    public App() {
        products = new ArrayList<>();  
    }

    private void createGUI() {

        // Main JFrame
        JFrame frame = new JFrame ("Smart Shop Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); // DOESNT WOWKR

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton manageProducts= new JButton("Manage Products");
        JButton manageSales= new JButton("Manage Sales");
        JButton manageStock = new JButton("Manage Stock");


        // The manageProducts button links to a method to open a new JFrame.
        manageProducts.addActionListener(e -> openManageProductsFrame());
        // Copy+Paste for future buttons ^^
        manageSales.addActionListener(e -> openManageSalesFrame());
        manageStock.addActionListener(e -> openManageStockFrame());

        // Add to panel
        panel.add(manageProducts);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Space between
        panel.add(manageSales);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Space between
        panel.add(manageStock);
        frame.add(panel);
        frame.setVisible(true);
    }



    private void openManageProductsFrame() {
        JFrame addFrame = new JFrame ("Manage Products");
        addFrame.setSize(400, 400);
        addFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Enter Product Name:");
        JTextField productField = new JTextField(20);
        JButton submitButton = new JButton("Submit");
            
            inputPanel.add(label);
            inputPanel.add(productField);
            inputPanel.add(submitButton);
            addFrame.add(inputPanel, BorderLayout.CENTER);
            addFrame.setVisible(true);

            submitButton.addActionListener(e -> {
            String productText = productField.getText().trim();
            if (!productText.isEmpty()) {
                products.add(new Product(productText));
                JOptionPane.showMessageDialog(addFrame, "Product added successfully!");
                productField.setText("");
            } else {
                JOptionPane.showMessageDialog(addFrame, "Error: Product name cannot be empty.");
                // Add more validation if needed
            }
        });
    }

    private void openManageSalesFrame() {
        JFrame addFrame = new JFrame ("Manage Sales");
        addFrame.setSize(400, 400);
        addFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Label, Buttons or Any functionality should be added below here.
    }

    private void openManageStockFrame() {
        JFrame addFrame = new JFrame ("Manage Sales");
        addFrame.setSize(400, 400);
        addFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Label, Buttons or Any functionality should be added below here.
    }
}