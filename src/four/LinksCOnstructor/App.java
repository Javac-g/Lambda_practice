package four.LinksCOnstructor;

public class App {

    static <T,V> T constFactory(Creator<T,V> tool, V w,V h, V l){

        return tool.function(w,h,l);

    }
    public static void main(String...args){

        int w,h,l;

        w = 3;
        h = 4;
        l = 6;

        Box A = Box_one::new;
        Box_one box_one = A.function(w,h,l);

        Creator<Box_two<Integer>,Integer> B = Box_two<Integer> ::new;
        Box_two<Integer> box_two = constFactory(B,w,h,l);
        System.out.println(box_two.getH());




    }
}
