package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static int getMaxByCondition(List<Integer> values, Predicate<Integer> predicate){
        List<Integer> satisfy = new ArrayList<>();
        for (int x : values){
            if (predicate.test(x))satisfy.add(x);
        }
        return Collections.max(satisfy);
    }
}
