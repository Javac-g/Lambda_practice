package practice_10_11_2022.LinksToMethods;

public class Method {
   static <T> String first(T[] arr,T t){
        int count  = 0;

        for (int i = 0 ; i < arr.length;i++){

            if (arr[i] == t)count++;

        }
        return "Matches: " + count;
   }
    static <T> Integer second(T[] arr,T t){
        int count  = 0;

        for (int i = 0 ; i < arr.length;i++){

            if (arr[i] == t)count++;

        }
        return  count;
    }

}
