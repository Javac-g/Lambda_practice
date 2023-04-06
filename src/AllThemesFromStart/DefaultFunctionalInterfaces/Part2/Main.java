package AllThemesFromStart.DefaultFunctionalInterfaces.Part2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    private static Consumer<double[]> cons = (double[] array)->{

        for (int i = 0; i < array.length; i++){
            if (array[i] > 2.0){
                array[i] *= 9;
            }else {
                array[i] *= 0.9;
            }
        }
    };
    ;
    public static Integer getCount(Integer[] arr, Predicate<Integer> predicate){
        int count = 0;
        for(int x:arr){
            if (predicate.test(x)){
                count++;
            }

        }
        return count;
    };
    public static double[] getChanged(double[] arr,Consumer<double[]> consumer){
        double[] result = Arrays.copyOf(arr,arr.length);

        consumer.accept(result);
        return result;
    }
    public static void main(String...args){
        Predicate<Integer> predicate = (Integer x)->{
            return x > 0 & x < 4;
        };
        Integer[] arr = {1,2,3,4,5,6,7};
        System.out.println(getCount(arr,predicate));



        double[] vals = {1.1009, 2.900, 1.300, 3.300, 1.4, 2.2};
        double[] res = getChanged(vals,cons);
        for (Double x : res){
            System.out.print(x + " ");
        }

    }//end of main
}
