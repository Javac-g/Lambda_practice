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
    public static void main(String...args){









    }

}
