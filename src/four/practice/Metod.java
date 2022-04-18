package four.practice;

public class Metod<T extends Comparable<T>> implements Tool<T> {

     public T Max(T[] vals, T t){
        T Max = vals[0];
        for (int i = 0; i <= vals.length-1;i++){
            if(vals[i].compareTo(t) > 0){
                Max = vals[i];
            }
        }
        return Max;
    }
    public T Min(T[] vals,T t){
        T Min = vals[0];
        for (int i = 0; i <= vals.length-1;i++){
            if(vals[i].compareTo(t) < 0){
                Min = vals[i];
            }
        }
        return Min;
    }

}
