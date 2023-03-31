package AllThemesFromStart.LinksToStaticMethods.V2.Counter;

public class High {
    private final int temp;
    public High(int temp){
        this.temp = temp;
    }
    public int getTemp(){
        return temp;
    }
    public boolean isHighger(High ob){
        return this.getTemp() > ob.getTemp();
    }
    public boolean isSmaller(High ob){
        return this.getTemp() < ob.getTemp();
    }
    public boolean isEqual(High ob){
        return this.getTemp() == ob.getTemp();
    }
}
