package five;

public class Metod {

    static <T> String words(T[] vals, T t){
        int count = 0;

        for (int i = 0 ; i <= vals.length-1; i++ ){

            if(vals[i] == t)count++;

        }

        return "" + count;
    }

    static <T> Integer digits(T[] vals, T t){

        int count = 0;

        for(int i = 0 ; i <= vals.length-1; i++){

            if (vals[i] == t)count++;

        }

        return count;

    }



}
