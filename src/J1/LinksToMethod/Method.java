package J1.LinksToMethod;

public class Method {


    static <T> String words(T[] values, T t){
        int count = 0;

        for (int i = 0; i <= values.length-1; i++){

            if (values[i].equals(t))count++;

        }
        return "" + count;

    }



}
