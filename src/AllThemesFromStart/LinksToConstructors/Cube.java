package AllThemesFromStart.LinksToConstructors;

public class Cube {
    private final int value;
    public Cube(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void show(){
        System.out.println("Cube: " + value);
    }
}
