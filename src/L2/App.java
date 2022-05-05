package L2;

public class App {

    static Integer[] N = {1,2,3,4,51,1,1,1,1,1,1,1,1,1,1,2,2,22,2};
    static String[] W = {"one" , "two", "three" , "one" , "one"};

    static <T> String S_run(Stool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }

    static <T> Integer I_run(Itool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }

    static <V,T> V All(Atool<V,T> tool , T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String...args){


        System.out.println(S_run(Method::word,N,1));
        System.out.println(S_run(Method::word,W,"one"));

        System.out.println("Value: " + I_run(Method::digit,N,1));
        System.out.println("Value: " + I_run(Method::digit,W,"one"));

        System.out.println("Value: " + All(Method::word,N,1));
        System.out.println("Value: " + All(Method::word,W,"one"));
        System.out.println("Value: " + All(Method::digit,N,1));
        System.out.println("Value: " + All(Method::digit,W,"one"));






    }

}
