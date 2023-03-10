package receipt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Receipt shopping(List<Product> products,double givenMoney){
        return new Receipt(products,givenMoney);

    };
    public static void main(String[] arg) {
        Product wurst = new Product("Wurst", 4.20);
        Product kaese = new Product("Käse", 2.30);
        Product brot = new Product("Brot", 2.10);
        Product dvd = new Product("DVD", 12);

        List<Product> products = new ArrayList<>();

        products.add(wurst);
        products.add(kaese);
        products.add(brot);
        products.add(dvd);
        products.add(dvd);

        Receipt receipt = shopping(products,50);
        System.out.println(receipt);

    }
}
