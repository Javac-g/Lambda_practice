package AllThemesFromStart.LinksToGenericMethods;

public class Main {
    public static <T> int runnerNum(ToolInt<T> toolInt, T[] vals, T t){ //can use link to int return method only
        return toolInt.func(vals,t);
    }
    public static <V> String runnerStr(ToolStr<V> toolInt, V[] vals, V v){//Can use link to String return method only
        return "" + toolInt.func(vals,v);
    }
    public static <T,V> T runnerAll(All<T,V> tool,V[] vals, V v){ //Can return any type, and consume any args
        return tool.function(vals, v);
    }
    public static void main(String[] args) {
        String[] str = {"hello","hello","hello"};
        Integer[] nums = {1,1,1,1,1,2,5,6,7,8,0};

        System.out.println("Result: " + runnerNum(Coder::matchesInt,nums,1)); //Generic method return int but consume Any args
        System.out.println("Result: " + runnerNum(Coder::matchesInt,str,"Hello"));

        System.out.println(runnerStr(Coder::matchesStr , str,"Hello")); //Generic method return Str but consume Any Args
        System.out.println(runnerStr(Coder::matchesStr,nums,1));

        System.out.println("" + runnerAll(Coder::matchesInt,nums,1));//Generic method can use any return type and any arguments
        System.out.println("" + runnerAll(Coder::matchesInt,str,1));
        System.out.println("" + runnerAll(Coder::matchesStr,nums,1));
        System.out.println("" + runnerAll(Coder::matchesStr,str,1));

    }
}
