package Three;

public class Main_Two {
    static <T,V> V boxFactory(Constr<T,V> tool,T w,T h , T l){

        return tool.function(w,h,l);

    }
    static void P(Box box){
        System.out.println("W: " + box.getWeight());
        System.out.println("H: " + box.getHeight());
        System.out.println("L: " + box.getLength());
    }
    public static void main(String...args){

        //Constr C = Box::new;
        //Box box = C.function(12,13,14);
       // P(box);

    }
}
