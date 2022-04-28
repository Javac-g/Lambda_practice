package Eight;

public class Metod {


    static <T> String words(T[] values, T t){
        int count = 0;

        for(int i = 0; i <= values.length-1; i++){

            if(values[i] == t)count++;

        }

        return "" + count;

    }

    static <T> Integer digits(T[] values, T t){

        int count = 0;

        for (int i = 0; i <=values.length-1; i++){


            if (values[i] == t)count++;


        }

        return count;

    }














}
