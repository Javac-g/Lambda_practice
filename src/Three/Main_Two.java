package Three;

public class Main_Two {
    static <T,V> T boxFactory(Constr<T,V> tool,V w,V h , V l){

        return tool.function(w,h,l);

    }
    static void P(Box box){
        System.out.println("W: " + box.getWeight());
        System.out.println("H: " + box.getHeight());
        System.out.println("L: " + box.getLength());
    }
    static void PC(Cube cube){
        System.out.println("W: " + cube.getOne());
        System.out.println("H: " + cube.getTwo());
        System.out.println("L: " + cube.getThree());
    }
    public static void main(String...args){

        Cn C = Box::new;
        Box box = C.function(12,13,14);
        P(box);


        CubeFunc<Integer> A = Cube<Integer> :: new;
        CubeFunc<String> B = Cube<String>:: new;
        Constr<Cube<Character>,Character> D = Cube<Character>:: new;

        Cube<Integer> cubic = A.function(1,2,3);
        PC(cubic);

        Cube<String> rubic = B.function("One","Two","Three");
        PC(rubic);

        Cube<Character> last = boxFactory(D,'A','B','C');





    }
}
