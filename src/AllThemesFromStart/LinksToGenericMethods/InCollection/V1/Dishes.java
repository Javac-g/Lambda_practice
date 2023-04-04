package AllThemesFromStart.LinksToGenericMethods.InCollection.V1;

public class Dishes {
    private final Integer calories;
    public Dishes(int calories){
        this.calories = calories;
    }

    public Integer getCalories(){
        return calories;
    }

    @Override
    public String toString() {
        return "Calories: " + getCalories();
    }
}
