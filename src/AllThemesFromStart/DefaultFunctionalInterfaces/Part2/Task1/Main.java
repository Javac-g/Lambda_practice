package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task1;

import java.util.function.Predicate;

public class Main {
    public static int getCount(int[] arr, Predicate<Integer> predicate){
        int count = 0;
        for (int x:arr){
            if (predicate.test(x))count++;
        }
        return count;
    }
    public static void main(String...args){
        Predicate<Integer> predicate = (Integer x)->{
            return 4 > x & x > 0;
        };
        int[] nums = {-3,-2,-1,0,1,2,3,4,5,6};

        System.out.println(" Values in array that 4 > x > 0 : " + getCount(nums,predicate));
    }
}
