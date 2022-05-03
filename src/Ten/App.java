package Ten;

public class App {

    static <T> String s_run(Stool<T> tool,T[] values, T t){

        return  tool.function(values,t);

    }
    static <T> Integer i_run(Itool<T> tool, T[] values,T t){

        return tool.function(values,t);


    }

    static <V,T> V all(Atool<V,T> tool, T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String...args){







    }
}
