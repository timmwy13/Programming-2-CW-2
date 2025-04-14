package system;

import java.io.Serializable;
import java.util.ArrayList;

public class Sales implements Serializable {
    private String name;
    private int total_price;
    private int date;
    private int quantity_sold;

    public Sales(String name, int date, int total_price, int quantity_sold) {
        this.name = name;
        this.date = date;
        this.total_price = total_price;
        this.quantity_sold = quantity_sold;
    }

    //Name//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    //Date//
    
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    
    //Total Price//
    
    public int getTotalPrice() {
        return total_price;
    }

    public void setTotalPrice(int total_price) {
        this.total_price = total_price;
    }
    
    
    //Quantity Sold//

    public int getQuantitySold() {
        return quantity_sold;
    }

    public void setQuantitySold(int quantity) {
        this.quantity_sold = quantity;
    }


}