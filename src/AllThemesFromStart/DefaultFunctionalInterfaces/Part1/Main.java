package AllThemesFromStart.DefaultFunctionalInterfaces.Part1;

import java.util.function.Function;

public class Main {
    public static <T,V> V process(Function<T,V> function,T num){
        return function.apply(num);
    }
    public static void main(String...args){
        Function<Integer,Double> arg = (Integer num) -> num.doubleValue();
        System.out.println(process(arg,22));
        System.out.println(arg.apply(9));
    }
}
