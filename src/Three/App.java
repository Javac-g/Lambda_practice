package Three;

public class App {
    static <T> String Str(S_TOOL<T> stool,T[] vals,T t){

        return "" + stool.function(vals,t);

    }
    static <T>Integer Int(I_TOOL<T> itool,T[] vals,T t){

        return itool.function(vals,t);

    }
    static <T,V> V all(A_TOOL<T,V> a_tool,T[] vals,T t){

        return a_tool.function(vals,t);

    }

    public static void main(String...args){

        Integer[] vals = new Integer[]{1,2,3,4,5,6,7,1,2,3,1,2,31,1,1,12,2,3,4,5};
        String[] valls = new String[]{"one","one","one","one","one","one","one","one","one"};

        System.out.println(Str(Metod::SP,valls,"one"));
        System.out.println(Str(Metod::SP,vals,1));

        System.out.println(Int(Metod::IP,valls,"one"));
        System.out.println(Int(Metod::IP,vals,1));

        System.out.println("" + all(Metod::IP,vals,1));
        System.out.println("" + all(Metod::IP,valls,"one"));
        System.out.println("" + all(Metod::SP,vals,2));
        System.out.println("" + all(Metod::SP,valls,"one"));

    }
}
