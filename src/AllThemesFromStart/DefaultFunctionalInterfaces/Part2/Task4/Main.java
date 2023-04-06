package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static boolean  getDecision(Tool<Product> tool,Product product){
        return tool.function(product);
    }
    public static void main(String... args) {
        List<Person> personList = Person.getPersons();
        List<Product> productList = Product.getProducts();
        List<Product> sold = new ArrayList<>();


        for (int i = 0; i < productList.size();i++){
            for (int j = 0;j < personList.size();j++){

                if (getDecision(personList.get(i).tool,productList.get(j)))sold.add(productList.get(i));
            }

        }
        System.out.println(sold);

        Shop shop = new Shop(personList);
        int count;
        for (int i = 0; i< productList.size();i++){
            count = shop.sale(productList.get(i));
        }
        List<Product> sold2 = shop.getSold();
        System.out.println(sold2);
    }
}
