package Three;

public class Metod {

    static <T> String SP(T[] vals ,T t){

        Integer count = 0;

        for(int i = 0; i<= vals.length -1; i++ ){

            if(vals[i] == t)count++;

        }
        return "Interceptions: " + count;
    }

    static <T> Integer IP(T[] vals, T t){
        Integer count = 0;

        for(int i = 0; i <= vals.length-1;i++){

            if(vals[i] == t)count++;

        }
        return count;
    }

}
