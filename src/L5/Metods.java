package L5;

public class Metods {




    static <T> String Words(T[] values, T t){
        int count = 0;

        for (int i = 0; i <=values.length-1; i++){

            if (values[i].equals(i))count++;

        }
        return "" + count;

    }
}
