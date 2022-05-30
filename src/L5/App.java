package L5;

public class App {
    static <T> String S_Runner(Stool<T> tool,T[] values,T t){

        return tool.function(values,t);

    }
    static <T> Integer I_Runner(Itool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }
    static <V,T> V A_Runner(Atool<V,T> tool, T[] values,T t){

        return tool.function(values,t);

    }
    public static void main(String...args){







    }
}
