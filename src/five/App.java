package five;




public class App {

    static <T> Integer I(I_Tool<T> tool, T[] vals, T t){

        return tool.function(vals,t);

    }
    static <V> String S(S_Tool<V> tool, V[] vals,V v){

        return "" + tool.function(vals,v);

    }
    static <T,V> T A(A_Tool<T,V> tool, V[] vals, V v){

        return tool.function(vals,v);

    }

    public static void main(String...args){

        Integer[] Numb = {1,2,3,4,1,1,12,2,3,4,5,1,3,1,1,1,2};
        String[] M = {"hello", "Hello" , "hello" , "hello"};

        System.out.println(I(Metod::digits,Numb,1));
        System.out.println(I(Metod::digits,M,"hello"));

        System.out.println(S(Metod::words,Numb,1));
        System.out.println(S(Metod::words,M,"hello"));

        System.out.println("" + A(Metod::words,Numb,1));
        System.out.println("" + A(Metod::words,M,"hello"));
        System.out.println("" + A(Metod::digits,Numb,1));
        System.out.println("" + A(Metod::digits,M,"hello"));



    }
}
