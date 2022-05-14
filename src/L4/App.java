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











    }
}
