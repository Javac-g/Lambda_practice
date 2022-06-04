package L5;

public class Metods {




    static <T> String Words(T[] values, T t){
        int count = 0;

        for (int i = 0; i <=values.length-1; i++){

            if (values[i].equals(t))count++;

        }
        return "" + count;

    }
    static <T> Integer Digits(T[] values, T t){
        int count = 0;

        for (int i = 0; i <=values.length-1;i++){

            if (values[i].equals(t))count++;

        }
        return count;

    }
}
