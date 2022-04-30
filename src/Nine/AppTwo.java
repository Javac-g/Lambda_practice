package Nine;

public class AppTwo {


    static <V,T> V factory(BB<V,T> create,T w, T h, T l){

        return create.function(w,h,l);

    }
    public static void main(String...args){


        B tool = Box_one::new;
        Box_one box = tool.function(1,2,3);

        BB<Box_two<Integer> , Integer> toool = Box_two<Integer> :: new;
        Box_two<Integer> box2 = factory(toool,2,3,4);









    }
}
