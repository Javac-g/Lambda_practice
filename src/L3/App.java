package L3;

public class App {

    static <T> String S_run(Stool<T> tool, T[] values, T t){

        return tool.function(values,t);

    }
    static <T> Integer I_run(Itool<T> tool , T[] values, T t){

        return tool.function(values,t);

    }
    static <V,T> V All (Atool<V,T> tool, T[] values, T t){

       return tool.function(values,t);

    }
    public static void main(String...args){







    }

}
