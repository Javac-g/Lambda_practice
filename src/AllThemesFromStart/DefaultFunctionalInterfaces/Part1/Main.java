package AllThemesFromStart.DefaultFunctionalInterfaces.Part1;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static <T,V> V process(Function<T,V> function,T num){
        return function.apply(num);
    }
    public static void main(String...args){
        Function<Integer,Double> arg = (Integer num) -> num.doubleValue();
        BinaryOperator<Integer> binaryOperator = (Integer x,Integer y)->{
            x += y;
            return x + y;
        };
        System.out.println(process(arg,22));
        System.out.println(arg.apply(9));
        System.out.println(binaryOperator.apply(12,13));
    }
}
