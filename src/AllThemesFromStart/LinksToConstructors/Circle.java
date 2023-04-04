package AllThemesFromStart.LinksToConstructors;

public class Circle<T> {
    private final T value;

    public Circle(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void show(){
        System.out.println("Circle: " + value);
    }
}
