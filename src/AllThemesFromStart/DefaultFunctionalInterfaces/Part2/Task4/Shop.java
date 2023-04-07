package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<MakeDecision> listDecisions = new ArrayList<>();

    public int sale(String product,int discount){
        int count = 0;
        for (MakeDecision goShopping : listDecisions){
            if (goShopping.function(product, discount))count++;
        }
        return count;
    }
}
