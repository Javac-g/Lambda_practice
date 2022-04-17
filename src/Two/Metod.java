package Two;

public class Metod {

    static <T> String IsIn(T[] arr , T t){
        int count = 0;
        for (int i = 0; i <= arr.length-1; i++){
            if(arr[i].equals(t)){
                count++;
            }
        }
        return "" + count;
    }

    static <T> Integer IsStr(T[] arr, T t){
        int count = 0;
        for (int i = 0; i <= arr.length-1; i++){
            if(arr[i].equals(t)){
                count++;
            }
        }
        return  count;
    }


}
