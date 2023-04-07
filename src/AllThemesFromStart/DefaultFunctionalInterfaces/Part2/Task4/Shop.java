package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<MakeDecision> list = new ArrayList<>();

    public int sale(String product,int discount){
        int count = 0;
        for (MakeDecision goShopping : list){
            if (goShopping.function(product, discount))count++;
        }
        return count;
    }
}
