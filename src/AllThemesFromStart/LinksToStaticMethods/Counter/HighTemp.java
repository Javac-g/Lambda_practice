package AllThemesFromStart.LinksToStaticMethods.Counter;

public class HighTemp {
    private static int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    public int gethTemp() {
        return hTemp;
    }

    public static boolean sameTemp(HighTemp ht2){

        return  hTemp == ht2.gethTemp();

    }
    public boolean lessThanTemp(HighTemp ht2){
        return this.hTemp < ht2.gethTemp();
    }
    public boolean moreThanTemp(HighTemp ht2){
        return this.hTemp > ht2.gethTemp();
    }

}
