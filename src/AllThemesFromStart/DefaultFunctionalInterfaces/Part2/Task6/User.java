package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class User {
    public  final List<Integer> values = new ArrayList<>();

    public  int getFilteredValue(BiFunction<List<Integer>,Predicate<Integer>,Integer>function, Predicate<Integer> predicate){
        return function.apply(values,predicate);
    }
    public int getMaxValueByCondition(Predicate<Integer> predicate){
        BiFunction<List<Integer>,Predicate<Integer>,Integer>function = Main::getMaxByCondition;
        BiFunction<List<Integer>,Predicate<Integer>,Integer>function2 = (List<Integer> nums,Predicate<Integer> pred)->{
            return Main.getMaxByCondition(nums,pred);
        };

        return getFilteredValue(function,predicate);
    }
}
