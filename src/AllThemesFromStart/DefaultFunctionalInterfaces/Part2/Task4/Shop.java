package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
     private List<Person> customers = new ArrayList<>();
    private List<Product> sold = new ArrayList<>();
    public Shop(List<Person> customers) {
        this.customers = customers;
    }

    public  Integer sale(Product product){

        int count = 0;
        for (Person p : customers){
            if (p.tool.function(product)){
                sold.add(product);
                count++;
            }
        }

        return count;
    }

    public List<Person> getCustomers() {
        return customers;
    }

    public List<Product> getSold() {
        return sold;
    }
}
