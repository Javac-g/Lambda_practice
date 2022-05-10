package L2.Constr;

public class App {


    static <V,T> V factory(B<V,T> tool ,T w, T h, T l){

        return tool.function(w,h,l);

    }

    public static void main(String...args){

        A tool = Box::new;

        Box one = tool.function(12,13,14);

        System.out.println("W: " + one.getW());
        System.out.println("H: " + one.getH());
        System.out.println("L: " + one.getL());

        //Easy but not usefull

        B<Cub<Integer>,Integer> toool = Cub<Integer> :: new;
        B<Box,Integer> pppp = Box::new;

        Cub<Integer> cubic = factory(toool,31,32,33);
        Box pp = factory(pppp,100,200,300);















    }
}
