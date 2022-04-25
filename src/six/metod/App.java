package six.metod;

public class App {

    static <T> String run_S(Stool<T> tool,T[] vals,T t){

        return tool.function(vals,t);

    }
    static <T>Integer run_I(Itool<T> tool ,T[] vals,T t){

        return tool.function(vals,t);

    }

    static <V,T> V run_All(Atool<V,T> tool, T[] vals,T t){

        return tool.function(vals,t);

    }

    public static void main(String...args){
        String msg = "Values matched: ";
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,0,1,1,1,1,1,2,2,2,3,34,5,6,7};
        String[] arr2 = {"one","two","three","four","five","one","one"};

        //link to String generic method  + String functional interface
        System.out.println(msg + run_S(Metod::words,arr1,1));
        System.out.println(msg + run_S(Metod::words,arr2,"one"));

        //link to Integer generic method  + Integer functional interface
        System.out.println(msg + run_I(Metod::digits,arr1,1));
        System.out.println(msg + run_I(Metod::digits,arr2,"one"));

        //link to  generic type method  + Generic functional interface
        System.out.println(msg + run_All(Metod::words,arr1,1));
        System.out.println(msg + run_All(Metod::words,arr1,1));
        System.out.println(msg + run_All(Metod::digits,arr1,1));
        System.out.println(msg + run_All(Metod::digits,arr2,"one"));





    }

}
