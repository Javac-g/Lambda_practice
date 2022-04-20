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




    }
}
