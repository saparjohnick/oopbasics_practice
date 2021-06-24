package inheritance_practice;

import java.io.Serializable;

public class Product implements Serializable {
    private String company;
    private double price;
    private int quantitySold;

    public Product(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public void sell() {
        quantitySold++;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public String toString() {
        return "Company: " + company + "\nprice: " + price + "\nquantity sold: " + quantitySold;
    }
}
