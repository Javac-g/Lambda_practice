package AllThemesFromStart.LinksToConstructors;

public class Box {
    private final Integer height;
    private final Integer width;
    private final Integer length;


    public Box(Integer height,Integer width,Integer length){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }
    public void show(){
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
