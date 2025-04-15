package system;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main {
	
	//Main method and GUI
    public static void main(String[] args) {
    	
    	JFrame MainMenu = new JFrame("Shop Management System");
	    
		MainMenu.setLayout(new FlowLayout());
	    
	    //View Products
	    
	    JButton viewProductsButton = new JButton("View Products");
	    viewProductsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	JFrame ViewProducts = new JFrame("View Products"); 
            	ViewProducts.setLayout(new FlowLayout());
            	
            	
            	//Add Product//
            	JButton addProductsButton = new JButton("Add Products");
            	addProductsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	
                    }
        	    });
            	
            	
            	//Update Product//
            	JButton updateProductsButton = new JButton("Update Existing Products");
            	updateProductsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	
                    }
        	    });
            	
            	
            	//Delete Product//
            	JButton deleteProductsButton = new JButton("Remove Products");
            	deleteProductsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	
                    }
        	    });
            	
            	
            	ViewProducts.add(addProductsButton);
            	ViewProducts.add(updateProductsButton);
            	ViewProducts.add(deleteProductsButton);
            	
            	ViewProducts.setSize(600, 600);
            	ViewProducts.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	ViewProducts.setVisible(true);
           }
        });
	    
	    
	    //Sales Button//
	    
	    JButton salesButton = new JButton("Add Transaction");
	    salesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            }
	    });
	    
	    
	    //Summary Button//
	    
    	JButton summaryButton = new JButton("Generate Sales Summary Report");
    	summaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            }
	    });
    	
    	
    	MainMenu.add(salesButton);
    	MainMenu.add(summaryButton);
	    MainMenu.add(viewProductsButton);
	    MainMenu.setSize(700, 700);
	    MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    MainMenu.setVisible(true); // Show the window
    	
		}
}