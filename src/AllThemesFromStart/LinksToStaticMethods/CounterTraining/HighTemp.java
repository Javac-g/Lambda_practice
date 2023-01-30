package AllThemesFromStart.LinksToStaticMethods.CounterTraining;

public class HighTemp {
    private int temp;

    public HighTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public boolean sameTemp(HighTemp h2){

        return this.temp == h2.getTemp();
    }
    public boolean lessTemp(HighTemp h2){

        return this.temp < h2.getTemp();
    }
    public boolean moreTemp(String o,HighTemp h2){

        return this.temp > h2.getTemp();
    }
}
