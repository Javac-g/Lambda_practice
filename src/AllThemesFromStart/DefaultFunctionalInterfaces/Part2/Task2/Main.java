package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task2;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static Consumer<double[]> consumer = (double[] arr)->{
        for(int i = 0;i < arr.length;i++){
            if (arr[i]  > 2.0){
                arr[i] *= 0.8;
            }else{
                arr[i] *= 0.9;
            }
        }
    };
    public static double[] getChanged(double[] arr, Consumer<double[]> consumer){
        double[] proxyArray = Arrays.copyOf(arr,arr.length);
        consumer.accept(proxyArray);
        return proxyArray;
    }
    public static void main(String...args){
        double[] initArray = {1.1, 2.2, 3.3, 1.4 , 4.4};
        double[] result = getChanged(initArray,consumer);
        for(Double x:result){
            System.out.print(x + " ");
        }
    }
}
