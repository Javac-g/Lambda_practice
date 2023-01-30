package AllThemesFromStart.LinksToStaticMethods.Counter;

public class Main {
    static <T> int counter(CountInterface<T> f,T[] vals,T t){
        int count = 0;
        for (int i = 0; i < vals.length;i++){
            if (f.func(t,vals[i]))count++;
        }
        return count;
    }
    public static void main(String...args){
        HighTemp[] weekDayH = {
                new HighTemp(100),new HighTemp(90),new HighTemp(80),
                new HighTemp(70),new HighTemp(60),new HighTemp(50),
                new HighTemp(40),new HighTemp(30),new HighTemp(20),
                new HighTemp(10),new HighTemp(30),new HighTemp(20)

        };

        int sameCount = counter(HighTemp::sameTemp,weekDayH,new HighTemp(20));
        int smallerCount = counter(HighTemp::lessThanTemp,weekDayH,new HighTemp(40));
        int biggerCount = counter(HighTemp::moreThanTemp,weekDayH,new HighTemp(70));

        System.out.println("Same as 20: " + sameCount);
        System.out.println("Smaller then: " + smallerCount);
        System.out.println("Bigger then"+ biggerCount);
    }
}
