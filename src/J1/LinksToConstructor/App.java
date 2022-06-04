package J1.LinksToConstructor;

public class App {
    static <V,T> V creator(Gen<V,T> tool,T w, T h, T l){

        return tool.function(w,h,l);

    }
    public static void main(String...args){

        Box_I one = Box::new;

        Box box = one.function(12,13,14);

        Gen<Cube<Integer>,Integer> A = Cube<Integer> ::new;
        Cube<Integer> Acube = creator(A,22,33,44);

        Gen<Box,Integer> B = Box::new;
        Box Bcube = creator(B,333,444,555);

        System.out.println("Box: " + box.getH());
        System.out.println("Cube: " + Acube.getH());
        System.out.println("Box cube: " + Bcube.getH());

    }
}
