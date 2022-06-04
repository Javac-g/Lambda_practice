package J1;

public class App {
    static <V,T> V creator(Gen<V,T> tool,T w, T h, T l){

        return tool.function(w,h,l);

    }
    public static void main(String...args){

        Box_I one = Box::new;

        Box box = one.function(12,13,14);

        Gen<>

    }
}
