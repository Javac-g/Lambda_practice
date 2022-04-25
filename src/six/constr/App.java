package six.constr;

public class App {
    static <V,T> V factory(ALL<V,T> tool,T w,T h,T l){

        return tool.function(w,h,l);

    }
    public static void main(String...args){

        Tool tool = box::new;
        box a = tool.function(1,2,3);


        System.out.println("w: " + a.getW());
        System.out.println("H: " + a.getH());
        System.out.println("L: " + a.getL());
        //but this is no useful,try next one>>

        ALL<rumb<Integer>,Integer> A = rumb<Integer>::new;
        ALL<rumb<String>,String> B = rumb<String>::new;

        rumb<Integer> one = factory(A,1,2,3);
        rumb<String> two = factory(B,"w","h","l");

        System.out.println("w: " + one.getW());
        System.out.println("H: " + one.getH());
        System.out.println("L: " + one.getL());

        System.out.println("w: " + two.getW());
        System.out.println("H: " + two.getH());
        System.out.println("L: " + two.getL());








    }
}
