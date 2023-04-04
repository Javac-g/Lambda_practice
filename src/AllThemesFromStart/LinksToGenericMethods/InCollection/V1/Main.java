package AllThemesFromStart.LinksToGenericMethods.InCollection.V1;

import java.util.*;

public class Main {
    public static void main(String...args){
        List<Dishes> dishlist  = new ArrayList<>();
        for (int i = 0; i < 10;i++){
            dishlist.add(new Dishes(new Random().nextInt(1000)));
        }
        DishComparator dishComparator = new DishComparator();

        Dishes maxCalories = Collections.max(dishlist, dishComparator::compare);

        System.out.println(dishlist);
        System.out.println(maxCalories);
    }
}
