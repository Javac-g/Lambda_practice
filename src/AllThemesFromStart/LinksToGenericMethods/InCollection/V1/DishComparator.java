package AllThemesFromStart.LinksToGenericMethods.InCollection.V1;

import java.util.Comparator;

public class DishComparator implements Comparator<Dishes> {
    @Override
    public int compare(Dishes o1, Dishes o2) {
        return o1.getCalories() - o2.getCalories();
    }
}
