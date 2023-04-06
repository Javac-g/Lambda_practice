package AllThemesFromStart.DefaultFunctionalInterfaces.Part2.Task2;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    private static Consumer<Double[]> consumer = (Double[] arr)->{
        for(int i = 0;i < arr.length;i++){
            if (arr[i]  > 2.0){
                arr[i] *= 0.8;
            }else{
                arr[i] *= 0.9;
            }
        }
    };
    public static Double[] getChange(Double[] arr, Consumer<Double[]> consumer){
        Double[] proxyArray = Arrays.copyOf(arr,arr.length);
        consumer.accept(proxyArray);
        return proxyArray;
    }
    public static void main(String...args){
        Double[] initArray = {1.1, 2.2, 3.3, 1.4 , 4.4};
        Double[] result = getChange(initArray,consumer);
        for(Double x:result){
            System.out.print(x + " ");
        }
    }
}
