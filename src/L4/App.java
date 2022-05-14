package L4;

public class App {
    static <T> String A(Stool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }
    static <T> Integer B(Itool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }

    static <V,T> V C(Atool<V,T> tool,T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String...args){

        Integer[] N = {1,1,1,1,1,1,1,1,1,1,1,1};
        String[] S = {"one","one","one","one","one","one","one","one","one",};

        System.out.println("Val: " + A(Metod::words,S,"one"));
        System.out.println("Val: " + A(Metod::words,N,1));

        System.out.println("Val: " + B(Metod::digits,S,"one"));
        System.out.println("Val: " + B(Metod::digits,N,1));

        System.out.println("Val: " + C(Metod::words,S,"one"));
        System.out.println("Val: " + C(Metod::words,N,1));

        System.out.println("Val: " + C(Metod::digits,S,"one"));
        System.out.println("Val: " + C(Metod::digits,N,1));








    }
}
