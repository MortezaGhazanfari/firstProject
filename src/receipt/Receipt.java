package receipt;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Product> products;
    private double givenMoney;


    public Receipt(List<Product> products, double givenMoney) {
        this.products = products;
        this.givenMoney = givenMoney;
    }

    public List<Product> getProducts() {
        return products;
    }



    public double getGivenMoney() {
        return givenMoney;
    }

    public double getTotalPrice(){
        double totalPrice=0;
        for(Product product:getProducts()){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }



    public double getRepay() {
        return getGivenMoney() - getTotalPrice();
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "products=" + products +
                ", givenMoney=" + givenMoney +
                '}';
    }
}
