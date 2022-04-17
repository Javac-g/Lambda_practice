package Two;

public class App {

    static <T> String SRun(StrINF<T> tool , T[] vals,T t){
        return "Val: " + tool.function(vals,t);
    }
    static <T> Integer IRun(IntINF<T> tool , T[] vals,T t){
        return tool.function(vals,t);
    }

    private static <T,V> V BR(ALL<T, V> tool, T[] vals, T t){
        return tool.function(vals,t);
    }
    public static void main(String...args){
        Integer[] iarr = {1,2,3,4,4,2,1,1,133,3,4,5,4,3,21,1,1,2};
        String[] sarr = {"one","two","one","one","two"};




        System.out.println(SRun(Metod::IsIn,iarr,1));
        System.out.println(SRun(Metod::IsIn,sarr,"one"));
        System.out.println(IRun(Metod::IsStr,iarr,2));
        System.out.println(IRun(Metod::IsStr,sarr,"one"));

        System.out.println("Val: " + BR(Metod::IsStr,iarr,1));
        System.out.println("Val: " + BR(Metod::IsStr,sarr,"two"));

        System.out.println("Val: " + BR(Metod::IsIn,iarr,1));
        System.out.println("Val: " + BR(Metod::IsIn,sarr,"two"));


    }
}
