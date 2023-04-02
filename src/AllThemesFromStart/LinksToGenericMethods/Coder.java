package AllThemesFromStart.LinksToGenericMethods;

public class Coder {
    public static <T> int matchesInt(T[] vals, T t){
        int res = 0;
        for(int i = 0;i < vals.length;i++){
            if (vals[i] == t)res++;
        }
        return res;
    }
    public static  <V> String matchesStr(V[] vals, V t){
        int res = 0;
        for(int i = 0;i < vals.length;i++){
            if (vals[i] == t)res++;
        }
        return "Result: " + res;
    }

}
