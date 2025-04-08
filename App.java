import java.awt.*;
import javax.swing.*;

public class App {
    static JFrame frame;

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayJFrame();
            }
        });
    }

    static void displayJFrame(){
        frame = new JFrame("Smart Shop Management System");

        JButton manageProducts= new JButton("Manage Products");
        JButton manageSales= new JButton("Manage Sales");
        JButton manageStock = new JButton("Manage Stock");


        frame.add(manageProducts);
        frame.add(manageSales);
        frame.add(manageStock);
        
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500)); 
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    

}
