package AllThemesFromStart.DefaultFunctionalInterfaces.Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static <T,V> V process(Function<T,V> function,T num){
        return function.apply(num);
    }
    public static void main(String...args){
        List<String> names = new ArrayList<>();

        Function<Integer,Double> function = (Integer num) -> num.doubleValue();
        UnaryOperator<Double> unaryOperator = (Double x) -> {
            x = x + 2.0;
            return x ;
        };
        BinaryOperator<Integer> binaryOperator = (Integer x,Integer y)->{
            x += y;
            return x + y;
        };
        Consumer<String> consumer = names::add;
        Supplier<String> supplier = ()->{
            return names.get(0);
        };

        Predicate<Integer> predicate = (Integer x)->{
           return x > 0;
        };

        System.out.println(process(function,22));
        System.out.println(function.apply(9));
        System.out.println(unaryOperator.apply(99.9));
        System.out.println(binaryOperator.apply(12,13));
        consumer.accept("Max");
        System.out.println(names);
        System.out.println(supplier.get());
        System.out.println(predicate.test(4));
    }
}
