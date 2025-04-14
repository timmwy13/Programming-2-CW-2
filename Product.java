package system;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
    private String name;
    private int price;
    private int quantity;
    private ArrayList<String> productList = new ArrayList<String>();

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Name//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    //Date//

    public int getPrice() {
        return price;
    }

    public void setDate(int price) {
        this.price = price;
    }
    
    
    //Quantity//

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //Product List Array//

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public void productList(Product product) {
        this.productList.add(product.getName());
    }
}