package AllThemesFromStart.LinksToConstructors;

public class Main {
    public static Box getBox(Tool tool,Integer h,Integer w,Integer l){
        return tool.func(h,w,l);
    }
    public static <T,V> T runner(Factory<T,V> tool, V value){
        return tool.function(value);
    }
    public static void main(String[] args) {
        Tool tool = Box::new;
        ToolCircle<String> toolCircle = Circle<String>::new;
        Factory<Circle<Integer>,Integer> circleFactory = Circle::new;
        Factory<Cube,Integer> cubeFactory = Cube::new;


        Box one = tool.func(1,2,3);
        one.show();

        Box two = getBox(Box::new,4,5,6);
        two.show();

        Circle<String> c1 = toolCircle.func("Hello");
        c1.show();

        Circle<Integer> C2 = runner(circleFactory,12345);
        C2.show();

        Circle<Integer> C3 = runner(Circle::new,12345);
        C3.show();

        Cube cube = runner(cubeFactory,1234);
        cube.show();


    }
}
