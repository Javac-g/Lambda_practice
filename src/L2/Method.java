package L2;

public class Method {


    static <T> String word(T[] values,T t){

        int count = 0;

        for (int i = 0; i <= values.length-1; i++){

            if(values[i] == t)count++;

        }

        return "Value: " + count;

    }

    static <T> Integer digit(T[] values, T t){

        int count = 0;

        for (int i = 0; i <= values.length-1; i++){

            if(values[i] == t)count++;

        }

        return count;

    }









}
