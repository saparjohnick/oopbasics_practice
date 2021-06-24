package inheritance_practice;


import java.io.Serial;
import java.io.Serializable;

public class Television extends Product {
    private String model;

    public Television(String model, String manufacturer, double price) {
        super(manufacturer, price);
        this.model = model;
    }

    public Television() {
        super("default", 0.0);
        this.model = "default_model";
        // code
    }

    public String toString() {
        return super.toString() + "model: " + model;
    }
//
//    public static void main(String[] args) throws NotSerializableException {
//        Television tv = new Television("Bravia 5S", "SONY", 5000);
//        System.out.println(tv);
//    }
}
