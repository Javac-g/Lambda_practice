package Nine;

public class App {
    static <T> String S_runner(Stool<T> tool, T[] values, T t){

        return tool.function(values,t);

    }

    static <T> Integer I_runner(Itool<T> tool,T[] values, T t){

        return tool.function(values,t);

    }
    public static void main(String ...args){





    }
}
