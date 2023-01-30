package AllThemesFromStart.LinksToStaticMethods.CounterTraining;

public class Main {
     static <T> int run(MyInterface<T> f, T[] vals,T t){
        int count = 0;
        for (int i = 0;i< vals.length;i++){
            if (f.function(t,vals[i]))count++;
        }
        return count;
    }
    public static void main(String...args){
        HighTemp[] days = {new HighTemp(10),new HighTemp(20),new HighTemp(30)};
        int same = run(HighTemp::sameTemp,days,new HighTemp(20));
    }
}
