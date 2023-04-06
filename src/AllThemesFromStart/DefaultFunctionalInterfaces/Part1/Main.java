package AllThemesFromStart.DefaultFunctionalInterfaces.Part1;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static <T,V> V process(Function<T,V> function,T num){
        return function.apply(num);
    }
    public static void main(String...args){
        Function<Integer,Double> function = (Integer num) -> num.doubleValue();
        UnaryOperator<Double> unaryOperator = (Double x) -> {
            x = x + 2.0;
            return x ;
        };
        BinaryOperator<Integer> binaryOperator = (Integer x,Integer y)->{
            x += y;
            return x + y;
        };
        System.out.println(process(function,22));
        System.out.println(function.apply(9));
        System.out.println(unaryOperator.apply(99.9));
        System.out.println(binaryOperator.apply(12,13));
    }
}
