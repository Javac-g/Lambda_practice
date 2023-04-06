package AllThemesFromStart.DefaultFunctionalInterfaces.Part2;

import java.util.function.Predicate;

public class Main {
    public static Integer getCount(Integer[] arr, Predicate<Integer> predicate){
        int count = 0;
        for(int x:arr){
            if (predicate.test(x)){
                count++;
            }

        }
        return count;
    };
    public static void main(String...args){
        Predicate<Integer> predicate = (Integer x)->{
            return x > 0 & x < 4;
        };
        Integer[] arr = {1,2,3,4,5,6,7};
        System.out.println(getCount(arr,predicate));
    }
}
