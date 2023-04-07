package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task5;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

    public static void method(){

        Set<Predicate<Integer>> predicates = new HashSet<>();
        predicates.add( (Integer x) -> x > 0);
        predicates.add( (Integer x) -> x < 5);
        predicates.add( (Integer x) -> x != 3);
        Predicate<Integer> result = getPredicateFromSet(predicates);

        for (int i = -2; i< 10;i++){
           result(result,i);
        }

    }
    public static void result(Predicate<Integer> predicates, Integer i){


        System.out.println(i + ": " + predicates.test(i));

    }
    public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> set){
        Predicate<Integer> result = (x) -> true;

        for (Predicate<Integer> predicate : set ){
            result = result.and(predicate);
        }
        return result;
    }
    public static void main(String...args){

        method();
    }

}
