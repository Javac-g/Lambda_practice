package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String productName;
    private final Integer discount;

    public Product(String productName, Integer discount) {
        this.productName = productName;
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getDiscount() {
        return discount;
    }
    public static List<Product> getProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Banana",25));
        productList.add(new Product("Rice",10));
        productList.add(new Product("Soup",1));
        productList.add(new Product("Raspberry",2));
        productList.add(new Product("Strawberry",49));

        return productList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", discount=" + discount +
                '}';
    }
}
