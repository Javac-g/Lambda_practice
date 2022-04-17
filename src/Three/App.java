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



    }
}
